package com.mulin.dao;

import com.mulin.bean.Ofmucroomprop;
import com.mulin.bean.OfmucroompropExample;
import com.mulin.bean.OfmucroompropKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfmucroompropMapper {
    long countByExample(OfmucroompropExample example);

    int deleteByExample(OfmucroompropExample example);

    int deleteByPrimaryKey(OfmucroompropKey key);

    int insert(Ofmucroomprop record);

    int insertSelective(Ofmucroomprop record);

    List<Ofmucroomprop> selectByExampleWithBLOBs(OfmucroompropExample example);

    List<Ofmucroomprop> selectByExample(OfmucroompropExample example);

    Ofmucroomprop selectByPrimaryKey(OfmucroompropKey key);

    int updateByExampleSelective(@Param("record") Ofmucroomprop record, @Param("example") OfmucroompropExample example);

    int updateByExampleWithBLOBs(@Param("record") Ofmucroomprop record, @Param("example") OfmucroompropExample example);

    int updateByExample(@Param("record") Ofmucroomprop record, @Param("example") OfmucroompropExample example);

    int updateByPrimaryKeySelective(Ofmucroomprop record);

    int updateByPrimaryKeyWithBLOBs(Ofmucroomprop record);
}