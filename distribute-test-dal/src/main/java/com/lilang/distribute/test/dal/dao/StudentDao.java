package com.lilang.distribute.test.dal.dao;

import com.lilang.distribute.test.dal.model.StudentDO;

public interface StudentDao {
    int deleteByPrimaryKey(String studentId);

    int insert(StudentDO record);

    int insertSelective(StudentDO record);

    StudentDO selectByPrimaryKey(String studentId);

    int updateByPrimaryKeySelective(StudentDO record);

    int updateByPrimaryKey(StudentDO record);
}