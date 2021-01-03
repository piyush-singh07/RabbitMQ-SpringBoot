package com.example.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service("rabbitService")
public class RabbitService {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@Value("${springboot.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${springboot.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Student student) {
		rabbitTemplate.convertAndSend(exchange, routingkey, student);
		System.out.println("Send msg = " + student);
	}
}
