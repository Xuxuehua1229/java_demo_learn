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
 * ���� dao ��Ĺ���
 * @author xuxuehua
 * �Ƽ� Spring ����Ŀ�Ϳ���ʹ�� Spring �ĵ�Ԫ���ԣ������Զ�ע��������Ҫ�����
 * 1.���� SpringTest ģ��
 * 2.@ContextConfigurationָ�� spring �����ļ���λ��
 * 3.ֱ�� autowired Ҫʹ�õ��������
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
    * ���� DepartmentMapper	
    */
   @Test	
   public void testCRUD() {
	   // 1.���� SpringIOC ����
	   //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	   // 2.�������л�ȡ Mapper
	   //DepartmentMapper bean = ac.getBean(DepartmentMapper.class);
	   System.out.println(departmentMapper);
	   //departmentMapper.insertSelective(new Department("������"));
	   //departmentMapper.insertSelective(new Department("���²�"));
	   /*departmentMapper.insertSelective(new Department(null,"���Բ�"));
	   departmentMapper.insertSelective(new Department(null,"��Ʒ��1"));
	   departmentMapper.insertSelective(new Department(null,"���Բ�2")); */
	   
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
	   System.out.println("������ɣ�����");
   }
}
