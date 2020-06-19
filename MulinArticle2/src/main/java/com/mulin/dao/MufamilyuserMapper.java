package com.mulin.dao;

import com.mulin.bean.Mufamilyuser;
import com.mulin.bean.MufamilyuserExample;
import com.mulin.bean.MufamilyuserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MufamilyuserMapper {
    long countByExample(MufamilyuserExample example);

    int deleteByExample(MufamilyuserExample example);

    int deleteByPrimaryKey(MufamilyuserKey key);

    int insert(Mufamilyuser record);

    int insertSelective(Mufamilyuser record);

    List<Mufamilyuser> selectByExample(MufamilyuserExample example);

    Mufamilyuser selectByPrimaryKey(MufamilyuserKey key);

    int updateByExampleSelective(@Param("record") Mufamilyuser record, @Param("example") MufamilyuserExample example);

    int updateByExample(@Param("record") Mufamilyuser record, @Param("example") MufamilyuserExample example);

    int updateByPrimaryKeySelective(Mufamilyuser record);

    int updateByPrimaryKey(Mufamilyuser record);
}