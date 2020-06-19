package com.mulin.dao;

import com.mulin.bean.Ofmucmember;
import com.mulin.bean.OfmucmemberExample;
import com.mulin.bean.OfmucmemberKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfmucmemberMapper {
    long countByExample(OfmucmemberExample example);

    int deleteByExample(OfmucmemberExample example);

    int deleteByPrimaryKey(OfmucmemberKey key);

    int insert(Ofmucmember record);

    int insertSelective(Ofmucmember record);

    List<Ofmucmember> selectByExample(OfmucmemberExample example);

    Ofmucmember selectByPrimaryKey(OfmucmemberKey key);

    int updateByExampleSelective(@Param("record") Ofmucmember record, @Param("example") OfmucmemberExample example);

    int updateByExample(@Param("record") Ofmucmember record, @Param("example") OfmucmemberExample example);

    int updateByPrimaryKeySelective(Ofmucmember record);

    int updateByPrimaryKey(Ofmucmember record);
}