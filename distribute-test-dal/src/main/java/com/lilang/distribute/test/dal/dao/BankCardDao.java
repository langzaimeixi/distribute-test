package com.lilang.distribute.test.dal.dao;

import com.lilang.distribute.test.dal.model.BankCardDO;

public interface BankCardDao {
    int deleteByPrimaryKey(Integer cardId);

    int insert(BankCardDO record);

    int insertSelective(BankCardDO record);

    BankCardDO selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(BankCardDO record);

    int updateByPrimaryKey(BankCardDO record);
}