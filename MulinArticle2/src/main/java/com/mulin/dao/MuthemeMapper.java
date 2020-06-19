package com.mulin.dao;

import com.mulin.bean.Mutheme;
import com.mulin.bean.MuthemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuthemeMapper {
    long countByExample(MuthemeExample example);

    int deleteByExample(MuthemeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mutheme record);

    int insertSelective(Mutheme record);

    List<Mutheme> selectByExample(MuthemeExample example);

    Mutheme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mutheme record, @Param("example") MuthemeExample example);

    int updateByExample(@Param("record") Mutheme record, @Param("example") MuthemeExample example);

    int updateByPrimaryKeySelective(Mutheme record);

    int updateByPrimaryKey(Mutheme record);
}