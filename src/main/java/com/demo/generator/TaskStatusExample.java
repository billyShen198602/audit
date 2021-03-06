package com.demo.generator;

import java.util.ArrayList;
import java.util.List;

public class TaskStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskStatusExample() {
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

        public Criteria andTaskStatusNameIsNull() {
            addCriterion("TASK_STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameIsNotNull() {
            addCriterion("TASK_STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameEqualTo(String value) {
            addCriterion("TASK_STATUS_NAME =", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameNotEqualTo(String value) {
            addCriterion("TASK_STATUS_NAME <>", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameGreaterThan(String value) {
            addCriterion("TASK_STATUS_NAME >", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_NAME >=", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameLessThan(String value) {
            addCriterion("TASK_STATUS_NAME <", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_NAME <=", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameLike(String value) {
            addCriterion("TASK_STATUS_NAME like", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameNotLike(String value) {
            addCriterion("TASK_STATUS_NAME not like", value, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameIn(List<String> values) {
            addCriterion("TASK_STATUS_NAME in", values, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameNotIn(List<String> values) {
            addCriterion("TASK_STATUS_NAME not in", values, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_NAME between", value1, value2, "taskStatusName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNameNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_NAME not between", value1, value2, "taskStatusName");
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