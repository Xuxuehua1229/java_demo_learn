package com.baidu.ueditor.controller;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.ueditor.ActionEnter;


@Controller
@CrossOrigin
public class UeditorController {

	@RequestMapping("/config")
	public void config(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, JSONException{
		response.setContentType("application/json");
		String rootPath = request.getSession().getServletContext().getRealPath("/");
		try {
			ActionEnter actionEnter = new ActionEnter(request, rootPath);
			String exec=actionEnter.exec();
			PrintWriter writer = response.getWriter();
			writer.write(exec);
			writer.flush();
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}

