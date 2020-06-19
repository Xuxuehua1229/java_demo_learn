package com.mulin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mulin.bean.Mufamily;
import com.mulin.service.MufamilyService;

@Controller
public class MufamilyController {
	@Autowired
	MufamilyService mufamilyService;
	
	@RequestMapping("/getMyFamilyByUsername")
	public String getMyFamilyByUsername(@RequestParam(value="username") String username,Model model) {
		List<Mufamily> mufamilies = mufamilyService.getMyFamilyByUsername(username);
		model.addAttribute("mufamilies", mufamilies);
		return "";
	}
}
