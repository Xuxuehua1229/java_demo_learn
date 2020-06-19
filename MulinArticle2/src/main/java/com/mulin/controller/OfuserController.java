package com.mulin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mulin.bean.Ofuser;
import com.mulin.service.OfuerService;

@Controller
public class OfuserController {
   @Autowired	
   OfuerService ofuserService;
   
   @RequestMapping(value="/getUserInfo",method=RequestMethod.POST)
   @ResponseBody
   public Ofuser getUserInfo(@RequestParam("jid") String jid) {
	   System.out.println("getUserInfo....");
	   Ofuser ofuser = ofuserService.getUserInfo(jid);
	   System.out.println("Username:"+ofuser.getUsername() + ",Name:" + ofuser.getName());
	   return ofuser;
   }
}
