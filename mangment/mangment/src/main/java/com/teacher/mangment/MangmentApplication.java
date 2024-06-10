package com.teacher.mangment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={HibernateJpaAutoConfiguration.class })
@ComponentScan(basePackages = "com.teacher.management")
public class MangmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangmentApplication.class, args);
	}

}
