package com.mulin.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mulin.bean.Mufamily;
import com.mulin.bean.MufamilyExample;
import com.mulin.bean.Mufamilyuser;
import com.mulin.bean.MufamilyuserExample;
import com.mulin.bean.MufamilyExample.Criteria;
import com.mulin.bean.Ofuser;
import com.mulin.dao.MufamilyMapper;
import com.mulin.dao.MufamilyuserMapper;
import com.mulin.dao.OfuserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	OfuserMapper ofuerMapper;
	@Autowired
	MufamilyMapper mufamilyMapper;
	@Autowired
	MufamilyuserMapper mufamilyuserMapper;

	@Test
	public void testGet() {
		System.out.println(ofuerMapper);
		Ofuser ofuser = ofuerMapper.selectByPrimaryKey("xxh806");
		System.out.println(ofuser);
	}

	@Test
	public void testMuFamilyuserMapper() {
		MufamilyuserExample fue = new MufamilyuserExample();
        fue.setOrderByClause("isMaster");
        fue.createCriteria().andFamilynameEqualTo("xxh806");
		List<Mufamilyuser> mufamilyusers = mufamilyuserMapper.selectByExample(fue);
		System.out.println("mufamilyusers_size:"+mufamilyusers.size());
		for (Mufamilyuser mufamilyuser : mufamilyusers) {
			System.out.println(mufamilyuser.getFamilyname() + ",username:" + mufamilyuser.getUsername());
		}
	}

	@Test
	public void testMufamilyMapper() {
		//List<Mufamily> mufamilies = mufamilyMapper.selectByExample(mfe);
		//System.out.println("mufamilies.size:"+mufamilies.size());
		/*for (Mufamily mufamily : mufamilies) {
		            System.out.println(mufamily.getName()+",Nickname:" + mufamily.getNickname());
				}*/
		/*MufamilyExample mfe = new MufamilyExample();
		mfe.setOrderByClause("isMaster");
		mfe.createCriteria().andMufamilyusersEqualTo("xxh806");*/
		List<Mufamily> mufamilies = mufamilyMapper.selectByUsername("xxh806");
		System.out.println(mufamilies.size());
		for (Mufamily mufamily : mufamilies) {
			System.out.println(mufamily.getName()+ " ,Nickname: " + mufamily.getNickname());
		}
	}
}
