package com.nilesh.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nilesh.kafka.producer.entity.orderEntity;

@Service
public class orderService {

	private static final String TOPIC = "orders";

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void SendOrder(orderEntity orderEntity) throws JsonProcessingException {

		String orderJson = objectMapper.writeValueAsString(orderEntity);

		kafkaTemplate.send(TOPIC, orderJson.toString());

	}

}
