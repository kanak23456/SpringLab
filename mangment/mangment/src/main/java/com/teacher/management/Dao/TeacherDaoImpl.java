package com.teacher.management.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teacher.management.model.TeacherDetails;

@Repository
@Transactional
public class TeacherDaoImpl implements TeacherDao {

	
	@Autowired
	
	private SessionFactory factory;
	
	public  Session getSession()
	{
		Session session = factory.getCurrentSession();
		if (session==null)
		{
			session= factory.openSession();
		}
		return session;
	}
	@Override
	public void saveteacher(TeacherDetails teacherdetails) {
		getSession().save(teacherdetails);
		
	}

	@Override
	public List<TeacherDetails> getTeacherDetails() {
		
		return getSession().createQuery("select a from TeacherDetails a" ,TeacherDetails.class ).getResultList();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateteacheDetailsr(TeacherDetails teacherdetails, int id) {
		
		TeacherDetails  teacherdetail = teacherdetailsbyid(id);
		getSession().update(teacherdetails);
		
	}
	@Override
	public TeacherDetails teacherdetailsbyid(int id) {
	
		return getSession().load(TeacherDetails.class, id);
	}

	
	

}
