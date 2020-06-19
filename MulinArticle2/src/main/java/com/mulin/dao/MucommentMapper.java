package com.mulin.dao;

import com.mulin.bean.Mucomment;
import com.mulin.bean.MucommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MucommentMapper {
    long countByExample(MucommentExample example);

    int deleteByExample(MucommentExample example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(Mucomment record);

    int insertSelective(Mucomment record);

    List<Mucomment> selectByExampleWithBLOBs(MucommentExample example);

    List<Mucomment> selectByExample(MucommentExample example);

    Mucomment selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") Mucomment record, @Param("example") MucommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Mucomment record, @Param("example") MucommentExample example);

    int updateByExample(@Param("record") Mucomment record, @Param("example") MucommentExample example);

    int updateByPrimaryKeySelective(Mucomment record);

    int updateByPrimaryKeyWithBLOBs(Mucomment record);

    int updateByPrimaryKey(Mucomment record);
}