package com.mulin.dao;

import com.mulin.bean.Mucity;
import com.mulin.bean.MucityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MucityMapper {
    long countByExample(MucityExample example);

    int deleteByExample(MucityExample example);

    int deleteByPrimaryKey(Long cityid);

    int insert(Mucity record);

    int insertSelective(Mucity record);

    List<Mucity> selectByExample(MucityExample example);

    Mucity selectByPrimaryKey(Long cityid);

    int updateByExampleSelective(@Param("record") Mucity record, @Param("example") MucityExample example);

    int updateByExample(@Param("record") Mucity record, @Param("example") MucityExample example);

    int updateByPrimaryKeySelective(Mucity record);

    int updateByPrimaryKey(Mucity record);
}