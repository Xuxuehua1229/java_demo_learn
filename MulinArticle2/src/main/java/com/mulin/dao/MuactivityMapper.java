package com.mulin.dao;

import com.mulin.bean.Muactivity;
import com.mulin.bean.MuactivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuactivityMapper {
    long countByExample(MuactivityExample example);

    int deleteByExample(MuactivityExample example);

    int deleteByPrimaryKey(Integer activityid);

    int insert(Muactivity record);

    int insertSelective(Muactivity record);

    List<Muactivity> selectByExample(MuactivityExample example);

    Muactivity selectByPrimaryKey(Integer activityid);

    int updateByExampleSelective(@Param("record") Muactivity record, @Param("example") MuactivityExample example);

    int updateByExample(@Param("record") Muactivity record, @Param("example") MuactivityExample example);

    int updateByPrimaryKeySelective(Muactivity record);

    int updateByPrimaryKey(Muactivity record);
}