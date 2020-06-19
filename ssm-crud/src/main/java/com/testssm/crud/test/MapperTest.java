package com.testssm.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.testssm.crud.bean.Department;
import com.testssm.crud.bean.Employee;
import com.testssm.crud.dao.DepartmentMapper;
import com.testssm.crud.dao.EmployeeMapper;

/**
 * 测试 dao 层的工作
 * @author xuxuehua
 * 推荐 Spring 的项目就可以使用 Spring 的单元测试，可以自动注入我们需要的组件
 * 1.导入 SpringTest 模块
 * 2.@ContextConfiguration指定 spring 配置文件的位置
 * 3.直接 autowired 要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
   @Autowired
   DepartmentMapper departmentMapper;
   @Autowired
   EmployeeMapper employeeMapper;
   
   @Autowired
   SqlSession sqlSession;
   /*
    * 测试 DepartmentMapper	
    */
   @Test	
   public void testCRUD() {
	   // 1.创建 SpringIOC 容器
	   //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	   // 2.从容器中获取 Mapper
	   //DepartmentMapper bean = ac.getBean(DepartmentMapper.class);
	   System.out.println(departmentMapper);
	   //departmentMapper.insertSelective(new Department("开发部"));
	   //departmentMapper.insertSelective(new Department("人事部"));
	   /*departmentMapper.insertSelective(new Department(null,"测试部"));
	   departmentMapper.insertSelective(new Department(null,"产品部1"));
	   departmentMapper.insertSelective(new Department(null,"测试部2")); */
	   
	  // employeeMapper.insertSelective(new Employee("Jerry", "M", "zhangsan@qq.com", 1));
	   //employeeMapper.insertSelective(new Employee(empName, gender, email, dId));
	   EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
	   for (int i = 0; i < 1000; i++) {
		  String gender = "";
		  if(i % 2 == 0) {
			  gender = "W";
		  }else {
			  gender = "M";
		  }
		  String nameUid = UUID.randomUUID().toString().substring(0, 5) + i; 
		  mapper.insertSelective(new Employee(nameUid, gender , nameUid + "@qq.com", 1));
	   }
	   System.out.println("批量完成！！！");
   }
}
