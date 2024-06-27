package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		System.out.println( " [로그 확인 메인화면 이동] : ");
		return "main";
	}
	
	
	@GetMapping("/loginPage")
	public String loginPage() {
		System.out.println( " [로그 확인 ] 로그인 페이지 이동: " );
		
		return "loginPage";
	}
	
}
