package com.teacher.management.Dao;

import java.util.List;

import com.teacher.management.model.TeacherDetails;

public interface TeacherDao {
	
	public void saveteacher(TeacherDetails  teacherdetails);
	public List<TeacherDetails> getTeacherDetails();
	public void updateteacheDetailsr(TeacherDetails  teacherdetails, int id);
	public  TeacherDetails  teacherdetailsbyid(int id);

}
