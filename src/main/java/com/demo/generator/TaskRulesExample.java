package com.demo.generator;

import java.util.ArrayList;
import java.util.List;

public class TaskRulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskRulesExample() {
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

        public Criteria andFirstUserIdIsNull() {
            addCriterion("FIRST_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdIsNotNull() {
            addCriterion("FIRST_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdEqualTo(String value) {
            addCriterion("FIRST_USER_ID =", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotEqualTo(String value) {
            addCriterion("FIRST_USER_ID <>", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdGreaterThan(String value) {
            addCriterion("FIRST_USER_ID >", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_USER_ID >=", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdLessThan(String value) {
            addCriterion("FIRST_USER_ID <", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdLessThanOrEqualTo(String value) {
            addCriterion("FIRST_USER_ID <=", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdLike(String value) {
            addCriterion("FIRST_USER_ID like", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotLike(String value) {
            addCriterion("FIRST_USER_ID not like", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdIn(List<String> values) {
            addCriterion("FIRST_USER_ID in", values, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotIn(List<String> values) {
            addCriterion("FIRST_USER_ID not in", values, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdBetween(String value1, String value2) {
            addCriterion("FIRST_USER_ID between", value1, value2, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotBetween(String value1, String value2) {
            addCriterion("FIRST_USER_ID not between", value1, value2, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIsNull() {
            addCriterion("SECOND_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIsNotNull() {
            addCriterion("SECOND_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdEqualTo(String value) {
            addCriterion("SECOND_USER_ID =", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotEqualTo(String value) {
            addCriterion("SECOND_USER_ID <>", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdGreaterThan(String value) {
            addCriterion("SECOND_USER_ID >", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_USER_ID >=", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdLessThan(String value) {
            addCriterion("SECOND_USER_ID <", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdLessThanOrEqualTo(String value) {
            addCriterion("SECOND_USER_ID <=", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdLike(String value) {
            addCriterion("SECOND_USER_ID like", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotLike(String value) {
            addCriterion("SECOND_USER_ID not like", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIn(List<String> values) {
            addCriterion("SECOND_USER_ID in", values, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotIn(List<String> values) {
            addCriterion("SECOND_USER_ID not in", values, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdBetween(String value1, String value2) {
            addCriterion("SECOND_USER_ID between", value1, value2, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotBetween(String value1, String value2) {
            addCriterion("SECOND_USER_ID not between", value1, value2, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNull() {
            addCriterion("THIRD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNotNull() {
            addCriterion("THIRD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdEqualTo(String value) {
            addCriterion("THIRD_USER_ID =", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotEqualTo(String value) {
            addCriterion("THIRD_USER_ID <>", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThan(String value) {
            addCriterion("THIRD_USER_ID >", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_USER_ID >=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThan(String value) {
            addCriterion("THIRD_USER_ID <", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThanOrEqualTo(String value) {
            addCriterion("THIRD_USER_ID <=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLike(String value) {
            addCriterion("THIRD_USER_ID like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotLike(String value) {
            addCriterion("THIRD_USER_ID not like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIn(List<String> values) {
            addCriterion("THIRD_USER_ID in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotIn(List<String> values) {
            addCriterion("THIRD_USER_ID not in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdBetween(String value1, String value2) {
            addCriterion("THIRD_USER_ID between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotBetween(String value1, String value2) {
            addCriterion("THIRD_USER_ID not between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdIsNull() {
            addCriterion("FOURTH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdIsNotNull() {
            addCriterion("FOURTH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdEqualTo(String value) {
            addCriterion("FOURTH_USER_ID =", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdNotEqualTo(String value) {
            addCriterion("FOURTH_USER_ID <>", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdGreaterThan(String value) {
            addCriterion("FOURTH_USER_ID >", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOURTH_USER_ID >=", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdLessThan(String value) {
            addCriterion("FOURTH_USER_ID <", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdLessThanOrEqualTo(String value) {
            addCriterion("FOURTH_USER_ID <=", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdLike(String value) {
            addCriterion("FOURTH_USER_ID like", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdNotLike(String value) {
            addCriterion("FOURTH_USER_ID not like", value, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdIn(List<String> values) {
            addCriterion("FOURTH_USER_ID in", values, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdNotIn(List<String> values) {
            addCriterion("FOURTH_USER_ID not in", values, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdBetween(String value1, String value2) {
            addCriterion("FOURTH_USER_ID between", value1, value2, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFourthUserIdNotBetween(String value1, String value2) {
            addCriterion("FOURTH_USER_ID not between", value1, value2, "fourthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdIsNull() {
            addCriterion("FIFTH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdIsNotNull() {
            addCriterion("FIFTH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdEqualTo(String value) {
            addCriterion("FIFTH_USER_ID =", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdNotEqualTo(String value) {
            addCriterion("FIFTH_USER_ID <>", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdGreaterThan(String value) {
            addCriterion("FIFTH_USER_ID >", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIFTH_USER_ID >=", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdLessThan(String value) {
            addCriterion("FIFTH_USER_ID <", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdLessThanOrEqualTo(String value) {
            addCriterion("FIFTH_USER_ID <=", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdLike(String value) {
            addCriterion("FIFTH_USER_ID like", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdNotLike(String value) {
            addCriterion("FIFTH_USER_ID not like", value, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdIn(List<String> values) {
            addCriterion("FIFTH_USER_ID in", values, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdNotIn(List<String> values) {
            addCriterion("FIFTH_USER_ID not in", values, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdBetween(String value1, String value2) {
            addCriterion("FIFTH_USER_ID between", value1, value2, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andFifthUserIdNotBetween(String value1, String value2) {
            addCriterion("FIFTH_USER_ID not between", value1, value2, "fifthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdIsNull() {
            addCriterion("SIXTH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdIsNotNull() {
            addCriterion("SIXTH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdEqualTo(String value) {
            addCriterion("SIXTH_USER_ID =", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdNotEqualTo(String value) {
            addCriterion("SIXTH_USER_ID <>", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdGreaterThan(String value) {
            addCriterion("SIXTH_USER_ID >", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SIXTH_USER_ID >=", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdLessThan(String value) {
            addCriterion("SIXTH_USER_ID <", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdLessThanOrEqualTo(String value) {
            addCriterion("SIXTH_USER_ID <=", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdLike(String value) {
            addCriterion("SIXTH_USER_ID like", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdNotLike(String value) {
            addCriterion("SIXTH_USER_ID not like", value, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdIn(List<String> values) {
            addCriterion("SIXTH_USER_ID in", values, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdNotIn(List<String> values) {
            addCriterion("SIXTH_USER_ID not in", values, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdBetween(String value1, String value2) {
            addCriterion("SIXTH_USER_ID between", value1, value2, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSixthUserIdNotBetween(String value1, String value2) {
            addCriterion("SIXTH_USER_ID not between", value1, value2, "sixthUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdIsNull() {
            addCriterion("SEVENTH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdIsNotNull() {
            addCriterion("SEVENTH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdEqualTo(String value) {
            addCriterion("SEVENTH_USER_ID =", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdNotEqualTo(String value) {
            addCriterion("SEVENTH_USER_ID <>", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdGreaterThan(String value) {
            addCriterion("SEVENTH_USER_ID >", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEVENTH_USER_ID >=", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdLessThan(String value) {
            addCriterion("SEVENTH_USER_ID <", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdLessThanOrEqualTo(String value) {
            addCriterion("SEVENTH_USER_ID <=", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdLike(String value) {
            addCriterion("SEVENTH_USER_ID like", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdNotLike(String value) {
            addCriterion("SEVENTH_USER_ID not like", value, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdIn(List<String> values) {
            addCriterion("SEVENTH_USER_ID in", values, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdNotIn(List<String> values) {
            addCriterion("SEVENTH_USER_ID not in", values, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdBetween(String value1, String value2) {
            addCriterion("SEVENTH_USER_ID between", value1, value2, "seventhUserId");
            return (Criteria) this;
        }

        public Criteria andSeventhUserIdNotBetween(String value1, String value2) {
            addCriterion("SEVENTH_USER_ID not between", value1, value2, "seventhUserId");
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