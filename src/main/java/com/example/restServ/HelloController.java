package com.example.restServ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("hello")
	@ResponseBody
	public String hello( ) {
		return "hello";
	}
	
	@GetMapping("add")
	@ResponseBody
	public double add(@RequestParam double first, @RequestParam double second) {
		return first + second;
	}
	//master changed
	
	@GetMapping("sub")
	@ResponseBody
	public double sub(@RequestParam double first, @RequestParam double second) {
		return first - second;
	}
	
	
}
