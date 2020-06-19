package com.mulin.dao;

import com.mulin.bean.Muactivityrelease;
import com.mulin.bean.MuactivityreleaseExample;
import com.mulin.bean.MuactivityreleaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuactivityreleaseMapper {
    long countByExample(MuactivityreleaseExample example);

    int deleteByExample(MuactivityreleaseExample example);

    int deleteByPrimaryKey(Integer activityid);

    int insert(MuactivityreleaseWithBLOBs record);

    int insertSelective(MuactivityreleaseWithBLOBs record);

    List<MuactivityreleaseWithBLOBs> selectByExampleWithBLOBs(MuactivityreleaseExample example);

    List<Muactivityrelease> selectByExample(MuactivityreleaseExample example);

    MuactivityreleaseWithBLOBs selectByPrimaryKey(Integer activityid);

    int updateByExampleSelective(@Param("record") MuactivityreleaseWithBLOBs record, @Param("example") MuactivityreleaseExample example);

    int updateByExampleWithBLOBs(@Param("record") MuactivityreleaseWithBLOBs record, @Param("example") MuactivityreleaseExample example);

    int updateByExample(@Param("record") Muactivityrelease record, @Param("example") MuactivityreleaseExample example);

    int updateByPrimaryKeySelective(MuactivityreleaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MuactivityreleaseWithBLOBs record);

    int updateByPrimaryKey(Muactivityrelease record);
}