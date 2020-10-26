package ua.lviv.lgs.controller;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.lviv.lgs.model.Student;
import ua.lviv.lgs.services.StudentService;

@Controller
public class ApplicationController  {
	
	@Autowired
	StudentService studentSerivce;

	//Start
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(HttpServletRequest request) {
		
		return "EllenPage";
	}
	
	//Upload
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String upload(@RequestParam("photo") MultipartFile file, HttpServletRequest request) throws IOException {

		Student student = new Student();
		student.setName(request.getParameter("name"));
		student.setSurname(request.getParameter("surname"));
		student.setAge(Integer.parseInt(request.getParameter("age")));
		student.setPhoto(file.getBytes());
		
		studentSerivce.create(student);

		request.setAttribute("name", student.getName());
		request.setAttribute("surname", student.getSurname());
		request.setAttribute("age", student.getAge());
		String photo = Base64.getEncoder().encodeToString(file.getBytes());
		request.setAttribute("photo", photo);

		return "profile";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request) {
		
		Student student = studentSerivce.read((long) 1);
		
		String photo = Base64.getEncoder().encodeToString(student.getPhoto());
		request.setAttribute("photo", photo);
		
		return "test";
	}
	
}
