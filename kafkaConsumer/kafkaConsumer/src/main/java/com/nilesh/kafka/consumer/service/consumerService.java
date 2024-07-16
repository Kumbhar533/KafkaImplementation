package com.nilesh.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nilesh.kafka.consumer.orderEntity;

@Service
public class consumerService {

	@KafkaListener(topics = "orders", groupId = "my-consumer-group")
	public void getAllOrders(String message) throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		orderEntity readValue = mapper.readValue(message, orderEntity.class);

		System.out.println(readValue.getLocation());
		System.out.println(readValue.getOrderId());
		System.out.println(readValue.getOrderPrice());
		System.out.println(readValue.getShippingDate());
		System.out.println(readValue.getDeliveryDate());

	}

}
