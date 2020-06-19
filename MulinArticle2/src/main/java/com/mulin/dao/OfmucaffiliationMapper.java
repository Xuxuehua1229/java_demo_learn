package com.mulin.dao;

import com.mulin.bean.Ofmucaffiliation;
import com.mulin.bean.OfmucaffiliationExample;
import com.mulin.bean.OfmucaffiliationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfmucaffiliationMapper {
    long countByExample(OfmucaffiliationExample example);

    int deleteByExample(OfmucaffiliationExample example);

    int deleteByPrimaryKey(OfmucaffiliationKey key);

    int insert(Ofmucaffiliation record);

    int insertSelective(Ofmucaffiliation record);

    List<Ofmucaffiliation> selectByExample(OfmucaffiliationExample example);

    Ofmucaffiliation selectByPrimaryKey(OfmucaffiliationKey key);

    int updateByExampleSelective(@Param("record") Ofmucaffiliation record, @Param("example") OfmucaffiliationExample example);

    int updateByExample(@Param("record") Ofmucaffiliation record, @Param("example") OfmucaffiliationExample example);

    int updateByPrimaryKeySelective(Ofmucaffiliation record);

    int updateByPrimaryKey(Ofmucaffiliation record);
}