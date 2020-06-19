package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MuactivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuactivityExample() {
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

        public Criteria andActivityidIsNull() {
            addCriterion("activityID is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityID =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityID <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityID >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityID >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityID <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityID <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityID in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityID not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityID between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityID not between", value1, value2, "activityid");
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

        public Criteria andCreationdateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(String value) {
            addCriterion("creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(String value) {
            addCriterion("creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(String value) {
            addCriterion("creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(String value) {
            addCriterion("creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(String value) {
            addCriterion("creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(String value) {
            addCriterion("creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLike(String value) {
            addCriterion("creationDate like", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotLike(String value) {
            addCriterion("creationDate not like", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<String> values) {
            addCriterion("creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<String> values) {
            addCriterion("creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(String value1, String value2) {
            addCriterion("creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(String value1, String value2) {
            addCriterion("creationDate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomID not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNull() {
            addCriterion("roomName is null");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNotNull() {
            addCriterion("roomName is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnameEqualTo(String value) {
            addCriterion("roomName =", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotEqualTo(String value) {
            addCriterion("roomName <>", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThan(String value) {
            addCriterion("roomName >", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("roomName >=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThan(String value) {
            addCriterion("roomName <", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThanOrEqualTo(String value) {
            addCriterion("roomName <=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLike(String value) {
            addCriterion("roomName like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotLike(String value) {
            addCriterion("roomName not like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameIn(List<String> values) {
            addCriterion("roomName in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotIn(List<String> values) {
            addCriterion("roomName not in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameBetween(String value1, String value2) {
            addCriterion("roomName between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotBetween(String value1, String value2) {
            addCriterion("roomName not between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("activityType is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("activityType is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(String value) {
            addCriterion("activityType =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(String value) {
            addCriterion("activityType <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(String value) {
            addCriterion("activityType >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("activityType >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(String value) {
            addCriterion("activityType <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(String value) {
            addCriterion("activityType <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLike(String value) {
            addCriterion("activityType like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotLike(String value) {
            addCriterion("activityType not like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<String> values) {
            addCriterion("activityType in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<String> values) {
            addCriterion("activityType not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(String value1, String value2) {
            addCriterion("activityType between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(String value1, String value2) {
            addCriterion("activityType not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andLastauthorIsNull() {
            addCriterion("lastAuthor is null");
            return (Criteria) this;
        }

        public Criteria andLastauthorIsNotNull() {
            addCriterion("lastAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andLastauthorEqualTo(String value) {
            addCriterion("lastAuthor =", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorNotEqualTo(String value) {
            addCriterion("lastAuthor <>", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorGreaterThan(String value) {
            addCriterion("lastAuthor >", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorGreaterThanOrEqualTo(String value) {
            addCriterion("lastAuthor >=", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorLessThan(String value) {
            addCriterion("lastAuthor <", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorLessThanOrEqualTo(String value) {
            addCriterion("lastAuthor <=", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorLike(String value) {
            addCriterion("lastAuthor like", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorNotLike(String value) {
            addCriterion("lastAuthor not like", value, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorIn(List<String> values) {
            addCriterion("lastAuthor in", values, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorNotIn(List<String> values) {
            addCriterion("lastAuthor not in", values, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorBetween(String value1, String value2) {
            addCriterion("lastAuthor between", value1, value2, "lastauthor");
            return (Criteria) this;
        }

        public Criteria andLastauthorNotBetween(String value1, String value2) {
            addCriterion("lastAuthor not between", value1, value2, "lastauthor");
            return (Criteria) this;
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

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("isTop not between", value1, value2, "istop");
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