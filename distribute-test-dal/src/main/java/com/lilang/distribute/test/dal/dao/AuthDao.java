package com.lilang.distribute.test.dal.dao;

import com.lilang.distribute.test.dal.model.AuthDO;

public interface AuthDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthDO record);

    int insertSelective(AuthDO record);

    AuthDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthDO record);

    int updateByPrimaryKey(AuthDO record);
}