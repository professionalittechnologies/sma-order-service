package com.professionalit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

	@GetMapping
	public ResponseEntity<String> createOrder() {
		System.out.println("Order-created");
		return ResponseEntity.status(HttpStatus.CREATED).body("Order-created");
	}

	@GetMapping("/all-order")
	public ResponseEntity<List<String>> createOrderList() {
		List<String> order = Arrays.asList("order=101", "order=102", "order=103");
		return ResponseEntity.status(HttpStatus.CREATED).body(order);
	}

}
