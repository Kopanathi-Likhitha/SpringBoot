package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MySqlExample {

	@Autowired

	private JdbcTemplate jdbc;
	
	@GetMapping("/insert")
	
	public String getmethod() {
		jdbc.execute("insert into player(num,name,country)values(18,'Virat kohli', 'India')");
		return "Inserted Successfully";
	}
	
	
}
