package com.Data.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/f")
public class Print {
	@GetMapping
	public String datprint(){
		
	return "hello";
	}

}
