package com.nilesh.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nilesh.kafka.producer.entity.orderEntity;
import com.nilesh.kafka.producer.service.orderService;

@RestController
public class orderController {

	@Autowired
	private orderService orderService;

	@PostMapping("/place-order")
	public ResponseEntity<?> placeOrder(@RequestBody orderEntity orderEntity) {
		try {
			orderService.SendOrder(orderEntity); // Assuming sendOrder method is correctly defined in OrderService
			return ResponseEntity.ok("Order placed successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Failed to place order: " + e.getMessage());
		}
	}

}
