package com.demo.generator;

import com.demo.generator.TaskRec;
import com.demo.generator.TaskRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskRecDao {
    long countByExample(TaskRecExample example);

    int deleteByExample(TaskRecExample example);

    int insert(TaskRec record);

    int insertSelective(TaskRec record);

    List<TaskRec> selectByExample(TaskRecExample example);

    List<TaskRec> selectByTaskId(String taskId);

    int updateByExampleSelective(@Param("record") TaskRec record, @Param("example") TaskRecExample example);

    int updateByExample(@Param("record") TaskRec record, @Param("example") TaskRecExample example);
}