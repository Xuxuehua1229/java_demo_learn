package com.mulin.dao;

import com.mulin.bean.Muactivitytemp;
import com.mulin.bean.MuactivitytempExample;
import com.mulin.bean.MuactivitytempWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuactivitytempMapper {
    long countByExample(MuactivitytempExample example);

    int deleteByExample(MuactivitytempExample example);

    int deleteByPrimaryKey(Integer activityid);

    int insert(MuactivitytempWithBLOBs record);

    int insertSelective(MuactivitytempWithBLOBs record);

    List<MuactivitytempWithBLOBs> selectByExampleWithBLOBs(MuactivitytempExample example);

    List<Muactivitytemp> selectByExample(MuactivitytempExample example);

    MuactivitytempWithBLOBs selectByPrimaryKey(Integer activityid);

    int updateByExampleSelective(@Param("record") MuactivitytempWithBLOBs record, @Param("example") MuactivitytempExample example);

    int updateByExampleWithBLOBs(@Param("record") MuactivitytempWithBLOBs record, @Param("example") MuactivitytempExample example);

    int updateByExample(@Param("record") Muactivitytemp record, @Param("example") MuactivitytempExample example);

    int updateByPrimaryKeySelective(MuactivitytempWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MuactivitytempWithBLOBs record);

    int updateByPrimaryKey(Muactivitytemp record);
}