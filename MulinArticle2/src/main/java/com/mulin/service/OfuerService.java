package com.mulin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulin.bean.Ofuser;
import com.mulin.dao.OfuserMapper;

@Service
public class OfuerService {
   @Autowired
   OfuserMapper ofuserMapper;
   
   public Ofuser getUserInfo(String jid) {
	   return ofuserMapper.selectByPrimaryKey(jid);
   }
}
