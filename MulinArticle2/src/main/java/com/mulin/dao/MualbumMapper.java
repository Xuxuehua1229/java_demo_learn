package com.mulin.dao;

import com.mulin.bean.Mualbum;
import com.mulin.bean.MualbumExample;
import com.mulin.bean.MualbumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MualbumMapper {
    long countByExample(MualbumExample example);

    int deleteByExample(MualbumExample example);

    int deleteByPrimaryKey(MualbumKey key);

    int insert(Mualbum record);

    int insertSelective(Mualbum record);

    List<Mualbum> selectByExampleWithBLOBs(MualbumExample example);

    List<Mualbum> selectByExample(MualbumExample example);

    Mualbum selectByPrimaryKey(MualbumKey key);

    int updateByExampleSelective(@Param("record") Mualbum record, @Param("example") MualbumExample example);

    int updateByExampleWithBLOBs(@Param("record") Mualbum record, @Param("example") MualbumExample example);

    int updateByExample(@Param("record") Mualbum record, @Param("example") MualbumExample example);

    int updateByPrimaryKeySelective(Mualbum record);

    int updateByPrimaryKeyWithBLOBs(Mualbum record);

    int updateByPrimaryKey(Mualbum record);
}