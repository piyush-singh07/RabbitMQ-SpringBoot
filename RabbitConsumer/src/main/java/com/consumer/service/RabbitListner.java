/*
 * package com.consumer.service;
 * 
 * import org.springframework.amqp.core.Message; import
 * org.springframework.amqp.core.MessageListener; import
 * org.springframework.stereotype.Service;
 * 
 * @Service("rabbitListener") public class RabbitListner implements
 * MessageListener {
 * 
 * @Override public void onMessage(Message message) {
 * System.out.println("Message received from the queue is :" + new
 * String(message.getBody())); } }
 */