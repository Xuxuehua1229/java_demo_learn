package com.mulin.dao;

import com.mulin.bean.Muexampleroominfo;
import com.mulin.bean.MuexampleroominfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuexampleroominfoMapper {
    long countByExample(MuexampleroominfoExample example);

    int deleteByExample(MuexampleroominfoExample example);

    int insert(Muexampleroominfo record);

    int insertSelective(Muexampleroominfo record);

    List<Muexampleroominfo> selectByExample(MuexampleroominfoExample example);

    int updateByExampleSelective(@Param("record") Muexampleroominfo record, @Param("example") MuexampleroominfoExample example);

    int updateByExample(@Param("record") Muexampleroominfo record, @Param("example") MuexampleroominfoExample example);
}