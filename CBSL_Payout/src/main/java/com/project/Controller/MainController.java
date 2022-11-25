package com.project.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dbConnect.service;

@RestController
public class MainController {
	@Autowired JdbcTemplate jdbc;
	
	@Autowired service serv;

	
	@Autowired(required=true) ControllerService cont;
		
	
	@PostMapping(path = "response")
	//@Scheduled(fixedRate = 10000 )
	public String response() throws IOException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cont.Request();
	}
	
	@RequestMapping("/test")
	public String test() throws IOException {
		return cont.Request();
	}
	
	


}
