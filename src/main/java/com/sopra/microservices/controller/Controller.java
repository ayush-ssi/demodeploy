package com.sopra.microservices.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Controller {
	
	@GetMapping("/get")
	public void home(HttpServletResponse res) throws IOException {
		res.sendRedirect("swagger-ui/index.html");
	}

}
