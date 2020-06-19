package com.mulin.dao;

import com.mulin.bean.Muprovince;
import com.mulin.bean.MuprovinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuprovinceMapper {
    long countByExample(MuprovinceExample example);

    int deleteByExample(MuprovinceExample example);

    int deleteByPrimaryKey(Long provinceid);

    int insert(Muprovince record);

    int insertSelective(Muprovince record);

    List<Muprovince> selectByExample(MuprovinceExample example);

    Muprovince selectByPrimaryKey(Long provinceid);

    int updateByExampleSelective(@Param("record") Muprovince record, @Param("example") MuprovinceExample example);

    int updateByExample(@Param("record") Muprovince record, @Param("example") MuprovinceExample example);

    int updateByPrimaryKeySelective(Muprovince record);

    int updateByPrimaryKey(Muprovince record);
}