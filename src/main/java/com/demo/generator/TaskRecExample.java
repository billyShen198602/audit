package com.demo.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskRecExample() {
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

        public Criteria andTaskRecIdIsNull() {
            addCriterion("TASK_REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdIsNotNull() {
            addCriterion("TASK_REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdEqualTo(String value) {
            addCriterion("TASK_REC_ID =", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdNotEqualTo(String value) {
            addCriterion("TASK_REC_ID <>", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdGreaterThan(String value) {
            addCriterion("TASK_REC_ID >", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_REC_ID >=", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdLessThan(String value) {
            addCriterion("TASK_REC_ID <", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_REC_ID <=", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdLike(String value) {
            addCriterion("TASK_REC_ID like", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdNotLike(String value) {
            addCriterion("TASK_REC_ID not like", value, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdIn(List<String> values) {
            addCriterion("TASK_REC_ID in", values, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdNotIn(List<String> values) {
            addCriterion("TASK_REC_ID not in", values, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdBetween(String value1, String value2) {
            addCriterion("TASK_REC_ID between", value1, value2, "taskRecId");
            return (Criteria) this;
        }

        public Criteria andTaskRecIdNotBetween(String value1, String value2) {
            addCriterion("TASK_REC_ID not between", value1, value2, "taskRecId");
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

        public Criteria andTaskStatusChangeBeforeIsNull() {
            addCriterion("TASK_STATUS_CHANGE_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeIsNotNull() {
            addCriterion("TASK_STATUS_CHANGE_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE =", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeNotEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE <>", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeGreaterThan(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE >", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE >=", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeLessThan(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE <", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE <=", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeLike(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE like", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeNotLike(String value) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE not like", value, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeIn(List<String> values) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE in", values, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeNotIn(List<String> values) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE not in", values, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE between", value1, value2, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeBeforeNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CHANGE_BEFORE not between", value1, value2, "taskStatusChangeBefore");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterIsNull() {
            addCriterion("TASK_STATUS_CHANGE_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterIsNotNull() {
            addCriterion("TASK_STATUS_CHANGE_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER =", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterNotEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER <>", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterGreaterThan(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER >", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER >=", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterLessThan(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER <", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER <=", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterLike(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER like", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterNotLike(String value) {
            addCriterion("TASK_STATUS_CHANGE_AFTER not like", value, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterIn(List<String> values) {
            addCriterion("TASK_STATUS_CHANGE_AFTER in", values, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterNotIn(List<String> values) {
            addCriterion("TASK_STATUS_CHANGE_AFTER not in", values, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CHANGE_AFTER between", value1, value2, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeAfterNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS_CHANGE_AFTER not between", value1, value2, "taskStatusChangeAfter");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeIsNull() {
            addCriterion("TASK_STATUS_CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeIsNotNull() {
            addCriterion("TASK_STATUS_CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME =", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME <>", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME >", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME >=", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeLessThan(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME <", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME <=", value, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME in", values, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME not in", values, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME between", value1, value2, "taskStatusChangeTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusChangeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_STATUS_CHANGE_TIME not between", value1, value2, "taskStatusChangeTime");
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