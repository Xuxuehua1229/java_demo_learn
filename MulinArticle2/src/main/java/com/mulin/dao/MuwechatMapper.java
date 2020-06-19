package com.mulin.dao;

import com.mulin.bean.Muwechat;
import com.mulin.bean.MuwechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuwechatMapper {
    long countByExample(MuwechatExample example);

    int deleteByExample(MuwechatExample example);

    int deleteByPrimaryKey(String openid);

    int insert(Muwechat record);

    int insertSelective(Muwechat record);

    List<Muwechat> selectByExample(MuwechatExample example);

    Muwechat selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") Muwechat record, @Param("example") MuwechatExample example);

    int updateByExample(@Param("record") Muwechat record, @Param("example") MuwechatExample example);

    int updateByPrimaryKeySelective(Muwechat record);

    int updateByPrimaryKey(Muwechat record);
}