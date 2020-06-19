package com.mulin.dao;

import com.mulin.bean.Mucollection;
import com.mulin.bean.MucollectionExample;
import com.mulin.bean.MucollectionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MucollectionMapper {
    long countByExample(MucollectionExample example);

    int deleteByExample(MucollectionExample example);

    int deleteByPrimaryKey(Integer collectid);

    int insert(MucollectionWithBLOBs record);

    int insertSelective(MucollectionWithBLOBs record);

    List<MucollectionWithBLOBs> selectByExampleWithBLOBs(MucollectionExample example);

    List<Mucollection> selectByExample(MucollectionExample example);

    MucollectionWithBLOBs selectByPrimaryKey(Integer collectid);

    int updateByExampleSelective(@Param("record") MucollectionWithBLOBs record, @Param("example") MucollectionExample example);

    int updateByExampleWithBLOBs(@Param("record") MucollectionWithBLOBs record, @Param("example") MucollectionExample example);

    int updateByExample(@Param("record") Mucollection record, @Param("example") MucollectionExample example);

    int updateByPrimaryKeySelective(MucollectionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MucollectionWithBLOBs record);

    int updateByPrimaryKey(Mucollection record);
}