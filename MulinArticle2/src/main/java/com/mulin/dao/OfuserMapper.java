package com.mulin.dao;

import com.mulin.bean.Ofuser;
import com.mulin.bean.OfuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfuserMapper {
    long countByExample(OfuserExample example);

    int deleteByExample(OfuserExample example);

    int deleteByPrimaryKey(String username);

    int insert(Ofuser record);

    int insertSelective(Ofuser record);

    List<Ofuser> selectByExampleWithBLOBs(OfuserExample example);

    List<Ofuser> selectByExample(OfuserExample example);

    Ofuser selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") Ofuser record, @Param("example") OfuserExample example);

    int updateByExampleWithBLOBs(@Param("record") Ofuser record, @Param("example") OfuserExample example);

    int updateByExample(@Param("record") Ofuser record, @Param("example") OfuserExample example);

    int updateByPrimaryKeySelective(Ofuser record);

    int updateByPrimaryKeyWithBLOBs(Ofuser record);

    int updateByPrimaryKey(Ofuser record);
}