package com.demo.generator;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskStatusDao {
    long countByExample(TaskStatusExample example);

    int deleteByExample(TaskStatusExample example);

    int deleteByPrimaryKey(String taskStatusCode);

    int insert(TaskStatus record);

    int insertSelective(TaskStatus record);

    List<TaskStatus> selectByExample(TaskStatusExample example);

    TaskStatus selectByPrimaryKey(String taskStatusCode);

    int updateByExampleSelective(@Param("record") TaskStatus record, @Param("example") TaskStatusExample example);

    int updateByExample(@Param("record") TaskStatus record, @Param("example") TaskStatusExample example);

    int updateByPrimaryKeySelective(TaskStatus record);

    int updateByPrimaryKey(TaskStatus record);
}