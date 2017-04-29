package com.lilang.distribute.test.dal.dao;

import com.lilang.distribute.test.dal.model.CustomerDO;

public interface CustomerDao {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerDO record);

    int insertSelective(CustomerDO record);

    CustomerDO selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerDO record);

    int updateByPrimaryKey(CustomerDO record);
}