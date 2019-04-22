package com.soft.ware.mapper;

import com.soft.ware.model.Programmer;

public interface ProgrammerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Programmer record);

    int insertSelective(Programmer record);

    Programmer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Programmer record);

    int updateByPrimaryKey(Programmer record);



}