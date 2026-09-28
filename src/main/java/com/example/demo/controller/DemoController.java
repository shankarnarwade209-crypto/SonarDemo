package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@PostMapping("/save")
	public String saveData() {
		return "Data save successfully";

	}
		//@PostMapping("/save")
	public String getData() {
		return "Data retrive successfully";

	}
//adding test commit
}
