package com.testssm.crud.test;

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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.testssm.crud.bean.Employee;

/**
 * ʹ�� Spring ����ģ���ṩ�Ĳ��������ܣ����� crud ��׼ȷ��
 * Spring4���Ե�ʱ����Ҫ servlet3.0 ��֧��
 * @author xuxuehua
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
	//���� springmvc �� IOC
	@Autowired
	WebApplicationContext context;
	//���� mvc ���󣬻�ȡ��������
    MockMvc mockMvc;
	
	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		System.out.println("mockMvc-Initial");
	}
	
	@Test
	public void testPage() throws Exception {
		//ģ�������õ�����ֵ
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "1")).andReturn();
		
		//����ɹ�֮���������л��� pageInfo,���ǿ���ȡ�� pageInfo ������֤
		MockHttpServletRequest request = result.getRequest();
		PageInfo pageInfo = (PageInfo)request.getAttribute("pageInfo");
		System.out.println("��ǰҳ�룺" + pageInfo.getPageNum());
		System.out.println("ÿҳ��������" + pageInfo.getPageSize());
		System.out.println("��ҳ�룺" + pageInfo.getPages());
		System.out.println("�ܼ�¼����" + pageInfo.getTotal());
		System.out.println("��ҳ��������ʾ��ҳ�룺" );
		int[] nums = pageInfo.getNavigatepageNums();
		for (int i : nums) {
			System.out.print("  "+i);
		}
		
		//��ȡԱ������
		List<Employee> employees = pageInfo.getList();
		for (Employee employee : employees) {
			System.out.println("Id:"+employee.getEmpId() + ",empName:" + employee.getEmpName() + ",deptName:" + employee.getDepartment().getDeptName());
		}
	}
}
