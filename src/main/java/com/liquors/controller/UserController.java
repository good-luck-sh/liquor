package com.liquors.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.liquors.service.UserService;
import com.liquors.service.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j //log.info사용
@RestController("/api/user")
public class UserController { //이제 입력받은 값은 @RequestBody부에 받는다.

	private UserService userService;

}
