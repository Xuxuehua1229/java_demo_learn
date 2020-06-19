package com.mulin.dao;

import com.mulin.bean.Ofproperty;
import com.mulin.bean.OfpropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfpropertyMapper {
    long countByExample(OfpropertyExample example);

    int deleteByExample(OfpropertyExample example);

    int deleteByPrimaryKey(String name);

    int insert(Ofproperty record);

    int insertSelective(Ofproperty record);

    List<Ofproperty> selectByExampleWithBLOBs(OfpropertyExample example);

    List<Ofproperty> selectByExample(OfpropertyExample example);

    Ofproperty selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Ofproperty record, @Param("example") OfpropertyExample example);

    int updateByExampleWithBLOBs(@Param("record") Ofproperty record, @Param("example") OfpropertyExample example);

    int updateByExample(@Param("record") Ofproperty record, @Param("example") OfpropertyExample example);

    int updateByPrimaryKeySelective(Ofproperty record);

    int updateByPrimaryKeyWithBLOBs(Ofproperty record);
}