package com.breezer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tour")
public class TourController {

	@RequestMapping("/mytour")
	public String mytour() {
		
		return "tour/mytour";
	}
}
