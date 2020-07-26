package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
//import 안되면 Sprng web 추가 (프로젝트 생성할떄)
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {
	@RequestMapping
	
	public String index() {
		return "basic index";
	}

}
