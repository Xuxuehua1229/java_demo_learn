package com.mulin.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.mulin.bean.Mufamily;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/springmvc-servlet.xml"})
public class MvcTest {
	@Autowired
	WebApplicationContext context;

	MockMvc mockMvc;

	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		System.out.println("mockMvc");
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testMuFamilyController() throws Exception {
		System.out.println("testMuFamilyController");
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getMyFamilyByUsername").param("username","xxh806")).andReturn();
		MockHttpServletRequest request = result.getRequest();
		List<Mufamily> mufamilies = (List<Mufamily>) request.getAttribute("mufamilies");
		System.out.println(mufamilies.size());
		for (Mufamily mufamily : mufamilies) {
           System.out.println(mufamily.getName() + ", nickName:"+mufamily.getNickname());
		}
	}
	
	@Test
	public void testOfuser() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getUserInfo").param("jid", "xxh806")).andReturn();
		MockHttpServletRequest request = result.getRequest();
	}
}
