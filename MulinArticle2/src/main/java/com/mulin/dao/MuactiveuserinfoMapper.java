package com.mulin.dao;

import com.mulin.bean.Muactiveuserinfo;
import com.mulin.bean.MuactiveuserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuactiveuserinfoMapper {
    long countByExample(MuactiveuserinfoExample example);

    int deleteByExample(MuactiveuserinfoExample example);

    int deleteByPrimaryKey(Integer userinfoid);

    int insert(Muactiveuserinfo record);

    int insertSelective(Muactiveuserinfo record);

    List<Muactiveuserinfo> selectByExample(MuactiveuserinfoExample example);

    Muactiveuserinfo selectByPrimaryKey(Integer userinfoid);

    int updateByExampleSelective(@Param("record") Muactiveuserinfo record, @Param("example") MuactiveuserinfoExample example);

    int updateByExample(@Param("record") Muactiveuserinfo record, @Param("example") MuactiveuserinfoExample example);

    int updateByPrimaryKeySelective(Muactiveuserinfo record);

    int updateByPrimaryKey(Muactiveuserinfo record);
}