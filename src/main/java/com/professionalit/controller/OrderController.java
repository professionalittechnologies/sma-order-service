package com.professionalit.controller;

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

}
