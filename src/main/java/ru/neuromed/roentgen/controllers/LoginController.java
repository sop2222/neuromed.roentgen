package ru.neuromed.roentgen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.neuromed.roentgen.vo.LoginDataVO;


@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@PostMapping
	public String login(@RequestBody LoginDataVO dataVO) {
		if ("clon".equals(dataVO.getUserID()) && "password".equals(dataVO.getPassword()))
		{
			return "OK!";
		}
		else
		{
			return "NO!";
		}
	}
	
	@GetMapping
	public String test()
	{
		LoginDataVO d2;
		d2 = new  LoginDataVO();
		d2.setUserID("IDot");
		d2.setPassword("qwerty");
		//String s4 = "The name is ";
		return "The dumbest one, named " + d2.getUserID() + " uses " + d2.getPassword() + " as password";
	}
}
