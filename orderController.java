package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.OrdersService;

@RestController
@RequestMapping("/orders")
public class orderController {
	
	@Autowired
	OrdersService os;
	
	@GetMapping("/view")
	public String vieworders() {
		return os.getorders().toString();			
	}

}
