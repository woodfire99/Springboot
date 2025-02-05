package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/") // 홈페이지 경로를 '/'로 설정
    public String home() {
        return "list"; // list.html을 반환 (확장자 .html은 생략)
    }
    }
//}