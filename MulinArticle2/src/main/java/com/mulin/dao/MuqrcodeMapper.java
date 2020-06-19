package com.mulin.dao;

import com.mulin.bean.Muqrcode;
import com.mulin.bean.MuqrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuqrcodeMapper {
    long countByExample(MuqrcodeExample example);

    int deleteByExample(MuqrcodeExample example);

    int deleteByPrimaryKey(String qrcode);

    int insert(Muqrcode record);

    int insertSelective(Muqrcode record);

    List<Muqrcode> selectByExample(MuqrcodeExample example);

    Muqrcode selectByPrimaryKey(String qrcode);

    int updateByExampleSelective(@Param("record") Muqrcode record, @Param("example") MuqrcodeExample example);

    int updateByExample(@Param("record") Muqrcode record, @Param("example") MuqrcodeExample example);

    int updateByPrimaryKeySelective(Muqrcode record);

    int updateByPrimaryKey(Muqrcode record);
}