package com.teacher.management.DB;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value = {"classpath:application.properties"})
@Configuration
public class DBConfig {
	@Value("${jdbc.driverClassName}")
	private String driverClass;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String Username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${hibernate.dialect}")
	private String dialect;
	
	

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource  datasource = new DriverManagerDataSource(url,Username,password);
		datasource.setDriverClassName(driverClass);
		return datasource;
	}
	
	private Properties hibernateproperProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.dialect", dialect);
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}
	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean  sessionfactory()
	{
		LocalSessionFactoryBean  factory = new  LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setHibernateProperties(hibernateproperProperties());
		factory.setPackagesToScan(new String[] {"com.teacher.management.model"});
		return factory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager  transactionmanager(SessionFactory factory )
	{
		HibernateTransactionManager  transactionmanager= new  HibernateTransactionManager();
		transactionmanager.setSessionFactory(factory);
 		return transactionmanager;
		
	}

}
