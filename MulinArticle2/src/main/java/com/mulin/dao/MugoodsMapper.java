package com.mulin.dao;

import com.mulin.bean.Mugoods;
import com.mulin.bean.MugoodsExample;
import com.mulin.bean.MugoodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MugoodsMapper {
    long countByExample(MugoodsExample example);

    int deleteByExample(MugoodsExample example);

    int deleteByPrimaryKey(Integer goodsreleaseid);

    int insert(MugoodsWithBLOBs record);

    int insertSelective(MugoodsWithBLOBs record);

    List<MugoodsWithBLOBs> selectByExampleWithBLOBs(MugoodsExample example);

    List<Mugoods> selectByExample(MugoodsExample example);

    MugoodsWithBLOBs selectByPrimaryKey(Integer goodsreleaseid);

    int updateByExampleSelective(@Param("record") MugoodsWithBLOBs record, @Param("example") MugoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") MugoodsWithBLOBs record, @Param("example") MugoodsExample example);

    int updateByExample(@Param("record") Mugoods record, @Param("example") MugoodsExample example);

    int updateByPrimaryKeySelective(MugoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MugoodsWithBLOBs record);

    int updateByPrimaryKey(Mugoods record);
}