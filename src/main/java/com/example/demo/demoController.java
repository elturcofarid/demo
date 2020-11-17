package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	
	
	@GetMapping
	public void  demo () {
		
		FileService file = new FileService();
		try {
			file.runTask(new Brand());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ejecutando creacionde  archivo ");
		
	}

}
