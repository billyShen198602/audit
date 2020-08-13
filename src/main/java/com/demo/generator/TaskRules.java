package com.demo.generator;

import java.io.Serializable;

/**
 * TASK_RULES
 * @author 
 */
public class TaskRules implements Serializable {
    private String taskRulesId;

    private String firstUserId;

    private String secondUserId;

    private String thirdUserId;

    private String fourthUserId;

    private String fifthUserId;

    private String sixthUserId;

    private String seventhUserId;

    public String getTaskRulesId() {
        return taskRulesId;
    }

    public void setTaskRulesId(String taskRulesId) {
        this.taskRulesId = taskRulesId;
    }

    public String getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(String firstUserId) {
        this.firstUserId = firstUserId;
    }

    public String getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(String secondUserId) {
        this.secondUserId = secondUserId;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getFourthUserId() {
        return fourthUserId;
    }

    public void setFourthUserId(String fourthUserId) {
        this.fourthUserId = fourthUserId;
    }

    public String getFifthUserId() {
        return fifthUserId;
    }

    public void setFifthUserId(String fifthUserId) {
        this.fifthUserId = fifthUserId;
    }

    public String getSixthUserId() {
        return sixthUserId;
    }

    public void setSixthUserId(String sixthUserId) {
        this.sixthUserId = sixthUserId;
    }

    public String getSeventhUserId() {
        return seventhUserId;
    }

    public void setSeventhUserId(String seventhUserId) {
        this.seventhUserId = seventhUserId;
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
        TaskRules other = (TaskRules) that;
        return (this.getTaskRulesId() == null ? other.getTaskRulesId() == null : this.getTaskRulesId().equals(other.getTaskRulesId()))
            && (this.getFirstUserId() == null ? other.getFirstUserId() == null : this.getFirstUserId().equals(other.getFirstUserId()))
            && (this.getSecondUserId() == null ? other.getSecondUserId() == null : this.getSecondUserId().equals(other.getSecondUserId()))
            && (this.getThirdUserId() == null ? other.getThirdUserId() == null : this.getThirdUserId().equals(other.getThirdUserId()))
            && (this.getFourthUserId() == null ? other.getFourthUserId() == null : this.getFourthUserId().equals(other.getFourthUserId()))
            && (this.getFifthUserId() == null ? other.getFifthUserId() == null : this.getFifthUserId().equals(other.getFifthUserId()))
            && (this.getSixthUserId() == null ? other.getSixthUserId() == null : this.getSixthUserId().equals(other.getSixthUserId()))
            && (this.getSeventhUserId() == null ? other.getSeventhUserId() == null : this.getSeventhUserId().equals(other.getSeventhUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskRulesId() == null) ? 0 : getTaskRulesId().hashCode());
        result = prime * result + ((getFirstUserId() == null) ? 0 : getFirstUserId().hashCode());
        result = prime * result + ((getSecondUserId() == null) ? 0 : getSecondUserId().hashCode());
        result = prime * result + ((getThirdUserId() == null) ? 0 : getThirdUserId().hashCode());
        result = prime * result + ((getFourthUserId() == null) ? 0 : getFourthUserId().hashCode());
        result = prime * result + ((getFifthUserId() == null) ? 0 : getFifthUserId().hashCode());
        result = prime * result + ((getSixthUserId() == null) ? 0 : getSixthUserId().hashCode());
        result = prime * result + ((getSeventhUserId() == null) ? 0 : getSeventhUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskRulesId=").append(taskRulesId);
        sb.append(", firstUserId=").append(firstUserId);
        sb.append(", secondUserId=").append(secondUserId);
        sb.append(", thirdUserId=").append(thirdUserId);
        sb.append(", fourthUserId=").append(fourthUserId);
        sb.append(", fifthUserId=").append(fifthUserId);
        sb.append(", sixthUserId=").append(sixthUserId);
        sb.append(", seventhUserId=").append(seventhUserId);
        sb.append("]");
        return sb.toString();
    }
}