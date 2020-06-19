package com.mulin.dao;

import com.mulin.bean.Mustreets;
import com.mulin.bean.MustreetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MustreetsMapper {
    long countByExample(MustreetsExample example);

    int deleteByExample(MustreetsExample example);

    int deleteByPrimaryKey(Long streetid);

    int insert(Mustreets record);

    int insertSelective(Mustreets record);

    List<Mustreets> selectByExample(MustreetsExample example);

    Mustreets selectByPrimaryKey(Long streetid);

    int updateByExampleSelective(@Param("record") Mustreets record, @Param("example") MustreetsExample example);

    int updateByExample(@Param("record") Mustreets record, @Param("example") MustreetsExample example);

    int updateByPrimaryKeySelective(Mustreets record);

    int updateByPrimaryKey(Mustreets record);
}