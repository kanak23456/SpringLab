package com.teacher.management.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.management.model.TeacherDetails;
import com.teacher.management.service.TeacherServiceImpl;

@RestController
@RequestMapping("/controller")
public class TeacherManagementController {
	
	//Logger   logger  = Logger.getLogger(TeacherManagementController.class);
	
	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	
	@PostMapping("/saveTeacher")
	public void saveteacher(@RequestBody TeacherDetails teacherDetails) {
		teacherServiceImpl.saveTeacher(teacherDetails);
	}
	
	@GetMapping("/getTeacher")
	public List<TeacherDetails> getteacher()
	{
		return teacherServiceImpl.getTeacherDetails();
		
	}
	
	@GetMapping("/teacherDetailsbyid")
	@ResponseBody
	public TeacherDetails teacherDetailsbyid(@RequestParam int id)
	{
		return teacherServiceImpl.TeacherDetailsbyid(id);
	}
	
	@PutMapping("/updateteacherDetails")
	public void updateTeacherDetails(@RequestBody TeacherDetails teacherDetails,@RequestParam int id )
	{
		teacherServiceImpl.updateTeacherDetails(teacherDetails, id);
	}
	
	

}
