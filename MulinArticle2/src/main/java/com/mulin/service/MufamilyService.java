package com.mulin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulin.bean.Mufamily;
import com.mulin.dao.MufamilyMapper;

@Service
public class MufamilyService {
   @Autowired
   MufamilyMapper mufamilyMapper;
   
   public List<Mufamily> getMyFamilyByUsername(String username){
	   return mufamilyMapper.selectByUsername(username);
   }
}
