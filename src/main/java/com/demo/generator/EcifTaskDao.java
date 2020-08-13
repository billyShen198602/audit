package com.demo.generator;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EcifTaskDao {
    long countByExample(EcifTaskExample example);

    int deleteByExample(EcifTaskExample example);

    int deleteByPrimaryKey(String taskId);

    int insert(EcifTask record);

    int insertSelective(EcifTask record);

    List<EcifTask> selectByExample(EcifTaskExample example);

    EcifTask selectByPrimaryKey(String taskId);

    EcifTask selectPreTaskByPrimaryKey(String taskId);

    int updateByExampleSelective(@Param("record") EcifTask record, @Param("example") EcifTaskExample example);

    int updateByExample(@Param("record") EcifTask record, @Param("example") EcifTaskExample example);

    int updateByPrimaryKeySelective(EcifTask record);

    int updateByPrimaryKey(EcifTask record);

    EcifTask selectLatest();

}