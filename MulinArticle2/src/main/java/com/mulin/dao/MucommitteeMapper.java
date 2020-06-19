package com.mulin.dao;

import com.mulin.bean.Mucommittee;
import com.mulin.bean.MucommitteeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MucommitteeMapper {
    long countByExample(MucommitteeExample example);

    int deleteByExample(MucommitteeExample example);

    int deleteByPrimaryKey(Long committeeid);

    int insert(Mucommittee record);

    int insertSelective(Mucommittee record);

    List<Mucommittee> selectByExample(MucommitteeExample example);

    Mucommittee selectByPrimaryKey(Long committeeid);

    int updateByExampleSelective(@Param("record") Mucommittee record, @Param("example") MucommitteeExample example);

    int updateByExample(@Param("record") Mucommittee record, @Param("example") MucommitteeExample example);

    int updateByPrimaryKeySelective(Mucommittee record);

    int updateByPrimaryKey(Mucommittee record);
}