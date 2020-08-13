package com.demo.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EcifTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcifTaskExample() {
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

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
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

        public Criteria andPromoterUserIsNull() {
            addCriterion("PROMOTER_USER is null");
            return (Criteria) this;
        }

        public Criteria andPromoterUserIsNotNull() {
            addCriterion("PROMOTER_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPromoterUserEqualTo(String value) {
            addCriterion("PROMOTER_USER =", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserNotEqualTo(String value) {
            addCriterion("PROMOTER_USER <>", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserGreaterThan(String value) {
            addCriterion("PROMOTER_USER >", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTER_USER >=", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserLessThan(String value) {
            addCriterion("PROMOTER_USER <", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserLessThanOrEqualTo(String value) {
            addCriterion("PROMOTER_USER <=", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserLike(String value) {
            addCriterion("PROMOTER_USER like", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserNotLike(String value) {
            addCriterion("PROMOTER_USER not like", value, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserIn(List<String> values) {
            addCriterion("PROMOTER_USER in", values, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserNotIn(List<String> values) {
            addCriterion("PROMOTER_USER not in", values, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserBetween(String value1, String value2) {
            addCriterion("PROMOTER_USER between", value1, value2, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andPromoterUserNotBetween(String value1, String value2) {
            addCriterion("PROMOTER_USER not between", value1, value2, "promoterUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeIsNull() {
            addCriterion("UNTIL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUntilTimeIsNotNull() {
            addCriterion("UNTIL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUntilTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME =", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME <>", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME >", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME >=", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeLessThan(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME <", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UNTIL_TIME <=", value, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UNTIL_TIME in", values, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UNTIL_TIME not in", values, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UNTIL_TIME between", value1, value2, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUntilTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UNTIL_TIME not between", value1, value2, "untilTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdIsNull() {
            addCriterion("TASK_RULES_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdIsNotNull() {
            addCriterion("TASK_RULES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdEqualTo(String value) {
            addCriterion("TASK_RULES_ID =", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdNotEqualTo(String value) {
            addCriterion("TASK_RULES_ID <>", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdGreaterThan(String value) {
            addCriterion("TASK_RULES_ID >", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RULES_ID >=", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdLessThan(String value) {
            addCriterion("TASK_RULES_ID <", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_RULES_ID <=", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdLike(String value) {
            addCriterion("TASK_RULES_ID like", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdNotLike(String value) {
            addCriterion("TASK_RULES_ID not like", value, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdIn(List<String> values) {
            addCriterion("TASK_RULES_ID in", values, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdNotIn(List<String> values) {
            addCriterion("TASK_RULES_ID not in", values, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdBetween(String value1, String value2) {
            addCriterion("TASK_RULES_ID between", value1, value2, "taskRulesId");
            return (Criteria) this;
        }

        public Criteria andTaskRulesIdNotBetween(String value1, String value2) {
            addCriterion("TASK_RULES_ID not between", value1, value2, "taskRulesId");
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