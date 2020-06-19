package com.mulin.dao;

import com.mulin.bean.Ofmucroom;
import com.mulin.bean.OfmucroomExample;
import com.mulin.bean.OfmucroomKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfmucroomMapper {
    long countByExample(OfmucroomExample example);

    int deleteByExample(OfmucroomExample example);

    int deleteByPrimaryKey(OfmucroomKey key);

    int insert(Ofmucroom record);

    int insertSelective(Ofmucroom record);

    List<Ofmucroom> selectByExample(OfmucroomExample example);

    Ofmucroom selectByPrimaryKey(OfmucroomKey key);

    int updateByExampleSelective(@Param("record") Ofmucroom record, @Param("example") OfmucroomExample example);

    int updateByExample(@Param("record") Ofmucroom record, @Param("example") OfmucroomExample example);

    int updateByPrimaryKeySelective(Ofmucroom record);

    int updateByPrimaryKey(Ofmucroom record);
}