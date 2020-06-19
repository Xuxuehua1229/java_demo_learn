package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MufamilyuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MufamilyuserExample() {
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

        public Criteria andFamilynameIsNull() {
            addCriterion("familyName is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNotNull() {
            addCriterion("familyName is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameEqualTo(String value) {
            addCriterion("familyName =", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotEqualTo(String value) {
            addCriterion("familyName <>", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThan(String value) {
            addCriterion("familyName >", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThanOrEqualTo(String value) {
            addCriterion("familyName >=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThan(String value) {
            addCriterion("familyName <", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThanOrEqualTo(String value) {
            addCriterion("familyName <=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLike(String value) {
            addCriterion("familyName like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotLike(String value) {
            addCriterion("familyName not like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameIn(List<String> values) {
            addCriterion("familyName in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotIn(List<String> values) {
            addCriterion("familyName not in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameBetween(String value1, String value2) {
            addCriterion("familyName between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotBetween(String value1, String value2) {
            addCriterion("familyName not between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andIsmasterIsNull() {
            addCriterion("isMaster is null");
            return (Criteria) this;
        }

        public Criteria andIsmasterIsNotNull() {
            addCriterion("isMaster is not null");
            return (Criteria) this;
        }

        public Criteria andIsmasterEqualTo(Integer value) {
            addCriterion("isMaster =", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterNotEqualTo(Integer value) {
            addCriterion("isMaster <>", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterGreaterThan(Integer value) {
            addCriterion("isMaster >", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMaster >=", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterLessThan(Integer value) {
            addCriterion("isMaster <", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterLessThanOrEqualTo(Integer value) {
            addCriterion("isMaster <=", value, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterIn(List<Integer> values) {
            addCriterion("isMaster in", values, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterNotIn(List<Integer> values) {
            addCriterion("isMaster not in", values, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterBetween(Integer value1, Integer value2) {
            addCriterion("isMaster between", value1, value2, "ismaster");
            return (Criteria) this;
        }

        public Criteria andIsmasterNotBetween(Integer value1, Integer value2) {
            addCriterion("isMaster not between", value1, value2, "ismaster");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateIsNull() {
            addCriterion("joinFamilyDate is null");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateIsNotNull() {
            addCriterion("joinFamilyDate is not null");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateEqualTo(String value) {
            addCriterion("joinFamilyDate =", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateNotEqualTo(String value) {
            addCriterion("joinFamilyDate <>", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateGreaterThan(String value) {
            addCriterion("joinFamilyDate >", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateGreaterThanOrEqualTo(String value) {
            addCriterion("joinFamilyDate >=", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateLessThan(String value) {
            addCriterion("joinFamilyDate <", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateLessThanOrEqualTo(String value) {
            addCriterion("joinFamilyDate <=", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateLike(String value) {
            addCriterion("joinFamilyDate like", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateNotLike(String value) {
            addCriterion("joinFamilyDate not like", value, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateIn(List<String> values) {
            addCriterion("joinFamilyDate in", values, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateNotIn(List<String> values) {
            addCriterion("joinFamilyDate not in", values, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateBetween(String value1, String value2) {
            addCriterion("joinFamilyDate between", value1, value2, "joinfamilydate");
            return (Criteria) this;
        }

        public Criteria andJoinfamilydateNotBetween(String value1, String value2) {
            addCriterion("joinFamilyDate not between", value1, value2, "joinfamilydate");
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