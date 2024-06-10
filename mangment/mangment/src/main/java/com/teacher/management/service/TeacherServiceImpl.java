package com.teacher.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.management.Dao.TeacherDaoImpl;
import com.teacher.management.model.TeacherDetails;


@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDaoImpl TeacherDaoImpl;

	@Override
	public void saveTeacher(TeacherDetails teacherdetails) {
		TeacherDaoImpl.saveteacher(teacherdetails);
		
	}

	@Override
	public TeacherDetails TeacherDetailsbyid(int id) {
		
		return TeacherDaoImpl.teacherdetailsbyid(id);
	}

	@Override
	public void updateTeacherDetails(TeacherDetails teacherdetails, int id) {
		TeacherDaoImpl.updateteacheDetailsr(teacherdetails, id);
		
	}

	@Override
	public List<TeacherDetails> getTeacherDetails() {
		
		return TeacherDaoImpl.getTeacherDetails();
	}

}
