package com.teacher.management.service;

import java.util.List;

import com.teacher.management.model.TeacherDetails;

public interface TeacherService {
	
	
	public void saveTeacher(TeacherDetails teacherdetails);
	public  TeacherDetails TeacherDetailsbyid(int id);
	public void updateTeacherDetails(TeacherDetails teacherdetails,int id);
	public List<TeacherDetails> getTeacherDetails();

}
