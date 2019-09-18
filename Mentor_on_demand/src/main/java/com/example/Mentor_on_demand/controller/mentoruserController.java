package com.example.Mentor_on_demand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.mentoruser;

@RestController
public class mentoruserController {
	@RequestMapping(value = "/mentoruser", method = RequestMethod.GET)
	public mentoruser firstPage() {

		mentoruser emp = new mentoruser();
		emp.setId(1);
		emp.setName("pavi");
		emp.setPassword("admin");

		return emp;
	}
}
