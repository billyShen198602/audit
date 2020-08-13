package com.demo.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * TASK_REC
 * @author 
 */
public class TaskRec implements Serializable {
    private String taskRecId;

    private String taskId;

    private String taskName;

    private String promoterUser;

    private String taskAssign;

    private Date createTime;

    private Date untilTime;

    private String taskStatusChangeBefore;

    private String taskStatusChangeAfter;

    private Date taskStatusChangeTime;

    private static final long serialVersionUID = 1L;

    public String getTaskRecId() {
        return taskRecId;
    }

    public void setTaskRecId(String taskRecId) {
        this.taskRecId = taskRecId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPromoterUser() {
        return promoterUser;
    }

    public void setPromoterUser(String promoterUser) {
        this.promoterUser = promoterUser;
    }

    public String getTaskAssign() {
        return taskAssign;
    }

    public void setTaskAssign(String taskAssign) {
        this.taskAssign = taskAssign;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUntilTime() {
        return untilTime;
    }

    public void setUntilTime(Date untilTime) {
        this.untilTime = untilTime;
    }

    public String getTaskStatusChangeBefore() {
        return taskStatusChangeBefore;
    }

    public void setTaskStatusChangeBefore(String taskStatusChangeBefore) {
        this.taskStatusChangeBefore = taskStatusChangeBefore;
    }

    public String getTaskStatusChangeAfter() {
        return taskStatusChangeAfter;
    }

    public void setTaskStatusChangeAfter(String taskStatusChangeAfter) {
        this.taskStatusChangeAfter = taskStatusChangeAfter;
    }

    public Date getTaskStatusChangeTime() {
        return taskStatusChangeTime;
    }

    public void setTaskStatusChangeTime(Date taskStatusChangeTime) {
        this.taskStatusChangeTime = taskStatusChangeTime;
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
        TaskRec other = (TaskRec) that;
        return (this.getTaskRecId() == null ? other.getTaskRecId() == null : this.getTaskRecId().equals(other.getTaskRecId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getPromoterUser() == null ? other.getPromoterUser() == null : this.getPromoterUser().equals(other.getPromoterUser()))
            && (this.getTaskAssign() == null ? other.getTaskAssign() == null : this.getTaskAssign().equals(other.getTaskAssign()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUntilTime() == null ? other.getUntilTime() == null : this.getUntilTime().equals(other.getUntilTime()))
            && (this.getTaskStatusChangeBefore() == null ? other.getTaskStatusChangeBefore() == null : this.getTaskStatusChangeBefore().equals(other.getTaskStatusChangeBefore()))
            && (this.getTaskStatusChangeAfter() == null ? other.getTaskStatusChangeAfter() == null : this.getTaskStatusChangeAfter().equals(other.getTaskStatusChangeAfter()))
            && (this.getTaskStatusChangeTime() == null ? other.getTaskStatusChangeTime() == null : this.getTaskStatusChangeTime().equals(other.getTaskStatusChangeTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskRecId() == null) ? 0 : getTaskRecId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getPromoterUser() == null) ? 0 : getPromoterUser().hashCode());
        result = prime * result + ((getTaskAssign() == null) ? 0 : getTaskAssign().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUntilTime() == null) ? 0 : getUntilTime().hashCode());
        result = prime * result + ((getTaskStatusChangeBefore() == null) ? 0 : getTaskStatusChangeBefore().hashCode());
        result = prime * result + ((getTaskStatusChangeAfter() == null) ? 0 : getTaskStatusChangeAfter().hashCode());
        result = prime * result + ((getTaskStatusChangeTime() == null) ? 0 : getTaskStatusChangeTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskRecId=").append(taskRecId);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", promoterUser=").append(promoterUser);
        sb.append(", taskAssign=").append(taskAssign);
        sb.append(", createTime=").append(createTime);
        sb.append(", untilTime=").append(untilTime);
        sb.append(", taskStatusChangeBefore=").append(taskStatusChangeBefore);
        sb.append(", taskStatusChangeAfter=").append(taskStatusChangeAfter);
        sb.append(", taskStatusChangeTime=").append(taskStatusChangeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}