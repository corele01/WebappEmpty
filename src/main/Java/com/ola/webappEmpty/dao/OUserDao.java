package com.ola.webappEmpty.dao;


import com.ola.webappEmpty.model.OUser;

public interface OUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OUser record);

    int insertSelective(OUser record);

    OUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OUser record);

    int updateByPrimaryKey(OUser record);

    OUser selectByOUser(OUser user);
}