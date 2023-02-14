package com.cdt.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PunchRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PunchRecordExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPunchDateIsNull() {
            addCriterion("PUNCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPunchDateIsNotNull() {
            addCriterion("PUNCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPunchDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE =", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE <>", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE >", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE >=", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateLessThan(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE <", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_DATE <=", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_DATE in", values, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_DATE not in", values, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_DATE between", value1, value2, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_DATE not between", value1, value2, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeIsNull() {
            addCriterion("PUNCH_IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeIsNotNull() {
            addCriterion("PUNCH_IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME =", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME <>", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME >", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME >=", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeLessThan(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME <", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_IN_TIME <=", value, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeIn(List<Date> values) {
            addCriterionForJDBCTime("PUNCH_IN_TIME in", values, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("PUNCH_IN_TIME not in", values, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("PUNCH_IN_TIME between", value1, value2, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchInTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("PUNCH_IN_TIME not between", value1, value2, "punchInTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeIsNull() {
            addCriterion("PUNCH_OUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeIsNotNull() {
            addCriterion("PUNCH_OUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME =", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME <>", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME >", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME >=", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeLessThan(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME <", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME <=", value, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeIn(List<Date> values) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME in", values, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME not in", values, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME between", value1, value2, "punchOutTime");
            return (Criteria) this;
        }

        public Criteria andPunchOutTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("PUNCH_OUT_TIME not between", value1, value2, "punchOutTime");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPunchInDateIsNull() {
            addCriterion("PUNCH_IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPunchInDateIsNotNull() {
            addCriterion("PUNCH_IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPunchInDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE =", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE <>", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE >", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE >=", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateLessThan(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE <", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_IN_DATE <=", value, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_IN_DATE in", values, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_IN_DATE not in", values, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_IN_DATE between", value1, value2, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_IN_DATE not between", value1, value2, "punchInDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateIsNull() {
            addCriterion("PUNCH_OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateIsNotNull() {
            addCriterion("PUNCH_OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE =", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE <>", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE >", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE >=", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateLessThan(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE <", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE <=", value, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE in", values, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE not in", values, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE between", value1, value2, "punchOutDate");
            return (Criteria) this;
        }

        public Criteria andPunchOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUNCH_OUT_DATE not between", value1, value2, "punchOutDate");
            return (Criteria) this;
        }
    }

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