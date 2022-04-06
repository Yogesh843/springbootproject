package com.onlyjavatech.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String firstHandler() {
		return "Just for testing !!! ";
	}
	

}
