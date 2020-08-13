package com.demo.generator;

import java.io.Serializable;

/**
 * TASK_STATUS
 * @author 
 */
public class TaskStatus implements Serializable {
    private String taskStatusCode;

    private String taskStatusName;

    private static final long serialVersionUID = 1L;

    public String getTaskStatusCode() {
        return taskStatusCode;
    }

    public void setTaskStatusCode(String taskStatusCode) {
        this.taskStatusCode = taskStatusCode;
    }

    public String getTaskStatusName() {
        return taskStatusName;
    }

    public void setTaskStatusName(String taskStatusName) {
        this.taskStatusName = taskStatusName;
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
        TaskStatus other = (TaskStatus) that;
        return (this.getTaskStatusCode() == null ? other.getTaskStatusCode() == null : this.getTaskStatusCode().equals(other.getTaskStatusCode()))
            && (this.getTaskStatusName() == null ? other.getTaskStatusName() == null : this.getTaskStatusName().equals(other.getTaskStatusName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskStatusCode() == null) ? 0 : getTaskStatusCode().hashCode());
        result = prime * result + ((getTaskStatusName() == null) ? 0 : getTaskStatusName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskStatusCode=").append(taskStatusCode);
        sb.append(", taskStatusName=").append(taskStatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}