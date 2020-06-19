package com.mulin.dao;

import com.mulin.bean.Ofroster;
import com.mulin.bean.OfrosterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfrosterMapper {
    long countByExample(OfrosterExample example);

    int deleteByExample(OfrosterExample example);

    int deleteByPrimaryKey(Long rosterid);

    int insert(Ofroster record);

    int insertSelective(Ofroster record);

    List<Ofroster> selectByExample(OfrosterExample example);

    Ofroster selectByPrimaryKey(Long rosterid);

    int updateByExampleSelective(@Param("record") Ofroster record, @Param("example") OfrosterExample example);

    int updateByExample(@Param("record") Ofroster record, @Param("example") OfrosterExample example);

    int updateByPrimaryKeySelective(Ofroster record);

    int updateByPrimaryKey(Ofroster record);
}