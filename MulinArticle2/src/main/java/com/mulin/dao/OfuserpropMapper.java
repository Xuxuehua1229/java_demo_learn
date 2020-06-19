package com.mulin.dao;

import com.mulin.bean.Ofuserprop;
import com.mulin.bean.OfuserpropExample;
import com.mulin.bean.OfuserpropKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfuserpropMapper {
    long countByExample(OfuserpropExample example);

    int deleteByExample(OfuserpropExample example);

    int deleteByPrimaryKey(OfuserpropKey key);

    int insert(Ofuserprop record);

    int insertSelective(Ofuserprop record);

    List<Ofuserprop> selectByExampleWithBLOBs(OfuserpropExample example);

    List<Ofuserprop> selectByExample(OfuserpropExample example);

    Ofuserprop selectByPrimaryKey(OfuserpropKey key);

    int updateByExampleSelective(@Param("record") Ofuserprop record, @Param("example") OfuserpropExample example);

    int updateByExampleWithBLOBs(@Param("record") Ofuserprop record, @Param("example") OfuserpropExample example);

    int updateByExample(@Param("record") Ofuserprop record, @Param("example") OfuserpropExample example);

    int updateByPrimaryKeySelective(Ofuserprop record);

    int updateByPrimaryKeyWithBLOBs(Ofuserprop record);
}