package com.example.demo.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Component
public class RabbitConsumer {

	@RabbitListener(queues = "${springboot.rabbitmq.queue}")
	public void recievedMessage(Student student) {
		System.out.println("Recieved Message From RabbitMQ: " + student);
	}
}
