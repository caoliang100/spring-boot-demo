package com.imooc.mapper;

import com.imooc.pojo.TApiUser;
import com.imooc.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TApiUserMapperCustom {
    List<TApiUser> queryUserCustom(String qq);
}