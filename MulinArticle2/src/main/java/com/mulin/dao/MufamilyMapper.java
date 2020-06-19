package com.mulin.dao;

import com.mulin.bean.Mufamily;
import com.mulin.bean.MufamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MufamilyMapper {
    long countByExample(MufamilyExample example);

    int deleteByExample(MufamilyExample example);

    int deleteByPrimaryKey(String name);

    int insert(Mufamily record);

    int insertSelective(Mufamily record);

    List<Mufamily> selectByExample(MufamilyExample example);
    
    List<Mufamily> selectByUsername(String username);

    Mufamily selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Mufamily record, @Param("example") MufamilyExample example);

    int updateByExample(@Param("record") Mufamily record, @Param("example") MufamilyExample example);

    int updateByPrimaryKeySelective(Mufamily record);

    int updateByPrimaryKey(Mufamily record);
}