package com.rabitmq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabitmq.exception.InvalidSalaryException;
import com.rabitmq.model.Employee;

@Component
public class RabbitMQConsumer {

	private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

	@RabbitListener(queues = "rabitmq.queue")
	public void recievedMessage(Employee employee) throws InvalidSalaryException {
		logger.info("Recieved Message From RabbitMQ: " + employee);
		if (employee.getSalary() < 0) {
			System.out.println("Invalid data  for the employee " + employee.getEmpName());
			throw new InvalidSalaryException();
		}
		else
		{
			System.out.println("Message Received Sucessfully for the employee " + employee.getEmpName());
		}
	}
}