package com.lilang.distribute.test.dal.dao;

import com.lilang.distribute.test.dal.model.CustomerDO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerDO record);

    int insertSelective(CustomerDO record);

    CustomerDO selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerDO record);

    int updateByPrimaryKey(CustomerDO record);
}