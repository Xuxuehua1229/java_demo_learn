package com.mulin.dao;

import com.mulin.bean.Muuserneighbour;
import com.mulin.bean.MuuserneighbourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuuserneighbourMapper {
    long countByExample(MuuserneighbourExample example);

    int deleteByExample(MuuserneighbourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Muuserneighbour record);

    int insertSelective(Muuserneighbour record);

    List<Muuserneighbour> selectByExample(MuuserneighbourExample example);

    Muuserneighbour selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Muuserneighbour record, @Param("example") MuuserneighbourExample example);

    int updateByExample(@Param("record") Muuserneighbour record, @Param("example") MuuserneighbourExample example);

    int updateByPrimaryKeySelective(Muuserneighbour record);

    int updateByPrimaryKey(Muuserneighbour record);
}