package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.RabbitService;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {
	
	@Autowired
	private RabbitService rabbitService;
	
	@GetMapping("/produce")
	public String produceMessage(@RequestParam("sid") String sid,@RequestParam("sname") String sname)
	{
		Student student= new Student(sid, sname);
		rabbitService.send(student);
		return "Message sent to the RabbitMQ  Successfully";
	}
	

}
