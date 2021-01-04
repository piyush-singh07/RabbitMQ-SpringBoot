package com.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitDemo {

	@RabbitListener(queues = "${springboot.rabbitmq.queue}")
	public void receivedMessage(Student obj)
	{
		System.out.println("Message Received :"+ obj);
	}
	
}
