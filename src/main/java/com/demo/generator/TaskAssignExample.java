package com.demo.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskAssignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskAssignExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTaskAssignIdIsNull() {
            addCriterion("TASK_ASSIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdIsNotNull() {
            addCriterion("TASK_ASSIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdEqualTo(String value) {
            addCriterion("TASK_ASSIGN_ID =", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdNotEqualTo(String value) {
            addCriterion("TASK_ASSIGN_ID <>", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdGreaterThan(String value) {
            addCriterion("TASK_ASSIGN_ID >", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ASSIGN_ID >=", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdLessThan(String value) {
            addCriterion("TASK_ASSIGN_ID <", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ASSIGN_ID <=", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdLike(String value) {
            addCriterion("TASK_ASSIGN_ID like", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdNotLike(String value) {
            addCriterion("TASK_ASSIGN_ID not like", value, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdIn(List<String> values) {
            addCriterion("TASK_ASSIGN_ID in", values, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdNotIn(List<String> values) {
            addCriterion("TASK_ASSIGN_ID not in", values, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdBetween(String value1, String value2) {
            addCriterion("TASK_ASSIGN_ID between", value1, value2, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ASSIGN_ID not between", value1, value2, "taskAssignId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIsNull() {
            addCriterion("TASK_ASSIGN is null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIsNotNull() {
            addCriterion("TASK_ASSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAssignEqualTo(String value) {
            addCriterion("TASK_ASSIGN =", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignNotEqualTo(String value) {
            addCriterion("TASK_ASSIGN <>", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignGreaterThan(String value) {
            addCriterion("TASK_ASSIGN >", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ASSIGN >=", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignLessThan(String value) {
            addCriterion("TASK_ASSIGN <", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignLessThanOrEqualTo(String value) {
            addCriterion("TASK_ASSIGN <=", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignLike(String value) {
            addCriterion("TASK_ASSIGN like", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignNotLike(String value) {
            addCriterion("TASK_ASSIGN not like", value, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignIn(List<String> values) {
            addCriterion("TASK_ASSIGN in", values, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignNotIn(List<String> values) {
            addCriterion("TASK_ASSIGN not in", values, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignBetween(String value1, String value2) {
            addCriterion("TASK_ASSIGN between", value1, value2, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskAssignNotBetween(String value1, String value2) {
            addCriterion("TASK_ASSIGN not between", value1, value2, "taskAssign");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeIsNull() {
            addCriterion("TASK_COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeIsNotNull() {
            addCriterion("TASK_COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME =", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME <>", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME >", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME >=", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeLessThan(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME <", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME <=", value, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME in", values, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME not in", values, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME between", value1, value2, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_COMPLETE_TIME not between", value1, value2, "taskCompleteTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeIsNull() {
            addCriterion("TASK_STATUS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeIsNotNull() {
            addCriterion("TASK_STATUS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeEqualTo(String value) {
            addCriterion("TASK_STATUS_CODE =", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeNotEqualTo(String value) {
            addCriterion("TASK_STATUS_CODE <>", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeGreaterThan(String value) {
            addCriterion("TASK_STATUS_CODE >", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CODE >=", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeLessThan(String value) {
            addCriterion("TASK_STATUS_CODE <", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CODE <=", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeLike(String value) {
            addCriterion("TASK_STATUS_CODE like", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeNotLike(String value) {
            addCriterion("TASK_STATUS_CODE not like", value, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeIn(List<String> values) {
            addCriterion("TASK_STATUS_CODE in", values, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeNotIn(List<String> values) {
            addCriterion("TASK_STATUS_CODE not in", values, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CODE between", value1, value2, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andTaskStatusCodeNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CODE not between", value1, value2, "taskStatusCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}