package com.demo.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * ECIF_TASK
 * @author 
 */
public class EcifTask implements Serializable {
    private String taskId;

    private String taskName;

    private String taskStatusCode;

    private String promoterUser;

    private Date createTime;

    private Date untilTime;

    private Date updateTime;

    private String taskRulesId;

    private static final long serialVersionUID = 1L;

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

    public String getTaskStatusCode() {
        return taskStatusCode;
    }

    public void setTaskStatusCode(String taskStatusCode) {
        this.taskStatusCode = taskStatusCode;
    }

    public String getPromoterUser() {
        return promoterUser;
    }

    public void setPromoterUser(String promoterUser) {
        this.promoterUser = promoterUser;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTaskRulesId() {
        return taskRulesId;
    }

    public void setTaskRulesId(String taskRulesId) {
        this.taskRulesId = taskRulesId;
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
        EcifTask other = (EcifTask) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getTaskStatusCode() == null ? other.getTaskStatusCode() == null : this.getTaskStatusCode().equals(other.getTaskStatusCode()))
            && (this.getPromoterUser() == null ? other.getPromoterUser() == null : this.getPromoterUser().equals(other.getPromoterUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUntilTime() == null ? other.getUntilTime() == null : this.getUntilTime().equals(other.getUntilTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getTaskRulesId() == null ? other.getTaskRulesId() == null : this.getTaskRulesId().equals(other.getTaskRulesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getTaskStatusCode() == null) ? 0 : getTaskStatusCode().hashCode());
        result = prime * result + ((getPromoterUser() == null) ? 0 : getPromoterUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUntilTime() == null) ? 0 : getUntilTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getTaskRulesId() == null) ? 0 : getTaskRulesId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskStatusCode=").append(taskStatusCode);
        sb.append(", promoterUser=").append(promoterUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", untilTime=").append(untilTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", taskRulesId=").append(taskRulesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}