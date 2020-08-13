package com.demo.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * TASK_ASSIGN
 * @author 
 */
public class TaskAssign implements Serializable {
    private String taskAssignId;

    private String taskId;

    private String taskAssign;

    private Date taskCompleteTime;

    private String taskStatusCode;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getTaskAssignId() {
        return taskAssignId;
    }

    public void setTaskAssignId(String taskAssignId) {
        this.taskAssignId = taskAssignId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskAssign() {
        return taskAssign;
    }

    public void setTaskAssign(String taskAssign) {
        this.taskAssign = taskAssign;
    }

    public Date getTaskCompleteTime() {
        return taskCompleteTime;
    }

    public void setTaskCompleteTime(Date taskCompleteTime) {
        this.taskCompleteTime = taskCompleteTime;
    }

    public String getTaskStatusCode() {
        return taskStatusCode;
    }

    public void setTaskStatusCode(String taskStatusCode) {
        this.taskStatusCode = taskStatusCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TaskAssign other = (TaskAssign) that;
        return (this.getTaskAssignId() == null ? other.getTaskAssignId() == null : this.getTaskAssignId().equals(other.getTaskAssignId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskAssign() == null ? other.getTaskAssign() == null : this.getTaskAssign().equals(other.getTaskAssign()))
            && (this.getTaskCompleteTime() == null ? other.getTaskCompleteTime() == null : this.getTaskCompleteTime().equals(other.getTaskCompleteTime()))
            && (this.getTaskStatusCode() == null ? other.getTaskStatusCode() == null : this.getTaskStatusCode().equals(other.getTaskStatusCode()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskAssignId() == null) ? 0 : getTaskAssignId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskAssign() == null) ? 0 : getTaskAssign().hashCode());
        result = prime * result + ((getTaskCompleteTime() == null) ? 0 : getTaskCompleteTime().hashCode());
        result = prime * result + ((getTaskStatusCode() == null) ? 0 : getTaskStatusCode().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskAssignId=").append(taskAssignId);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskAssign=").append(taskAssign);
        sb.append(", taskCompleteTime=").append(taskCompleteTime);
        sb.append(", taskStatusCode=").append(taskStatusCode);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}