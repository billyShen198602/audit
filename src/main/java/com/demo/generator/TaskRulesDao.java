package com.demo.generator;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskRulesDao {
    long countByExample(TaskRulesExample example);

    int deleteByExample(TaskRulesExample example);

    int deleteByPrimaryKey(String taskRulesId);

    int insert(TaskRules record);

    int insertSelective(TaskRules record);

    List<TaskRules> selectByExample(TaskRulesExample example);

    TaskRules selectByPrimaryKey(String taskRulesId);

    int updateByExampleSelective(@Param("record") TaskRules record, @Param("example") TaskRulesExample example);

    int updateByExample(@Param("record") TaskRules record, @Param("example") TaskRulesExample example);

    int updateByPrimaryKeySelective(TaskRules record);

    int updateByPrimaryKey(TaskRules record);

}