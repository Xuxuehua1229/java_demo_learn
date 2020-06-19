package com.mulin.dao;

import com.mulin.bean.Mudistrict;
import com.mulin.bean.MudistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MudistrictMapper {
    long countByExample(MudistrictExample example);

    int deleteByExample(MudistrictExample example);

    int deleteByPrimaryKey(Long districtid);

    int insert(Mudistrict record);

    int insertSelective(Mudistrict record);

    List<Mudistrict> selectByExample(MudistrictExample example);

    Mudistrict selectByPrimaryKey(Long districtid);

    int updateByExampleSelective(@Param("record") Mudistrict record, @Param("example") MudistrictExample example);

    int updateByExample(@Param("record") Mudistrict record, @Param("example") MudistrictExample example);

    int updateByPrimaryKeySelective(Mudistrict record);

    int updateByPrimaryKey(Mudistrict record);
}