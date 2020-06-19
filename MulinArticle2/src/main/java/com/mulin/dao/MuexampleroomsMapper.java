package com.mulin.dao;

import com.mulin.bean.Muexamplerooms;
import com.mulin.bean.MuexampleroomsExample;
import com.mulin.bean.MuexampleroomsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuexampleroomsMapper {
    long countByExample(MuexampleroomsExample example);

    int deleteByExample(MuexampleroomsExample example);

    int deleteByPrimaryKey(Integer exampleid);

    int insert(MuexampleroomsWithBLOBs record);

    int insertSelective(MuexampleroomsWithBLOBs record);

    List<MuexampleroomsWithBLOBs> selectByExampleWithBLOBs(MuexampleroomsExample example);

    List<Muexamplerooms> selectByExample(MuexampleroomsExample example);

    MuexampleroomsWithBLOBs selectByPrimaryKey(Integer exampleid);

    int updateByExampleSelective(@Param("record") MuexampleroomsWithBLOBs record, @Param("example") MuexampleroomsExample example);

    int updateByExampleWithBLOBs(@Param("record") MuexampleroomsWithBLOBs record, @Param("example") MuexampleroomsExample example);

    int updateByExample(@Param("record") Muexamplerooms record, @Param("example") MuexampleroomsExample example);

    int updateByPrimaryKeySelective(MuexampleroomsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MuexampleroomsWithBLOBs record);

    int updateByPrimaryKey(Muexamplerooms record);
}