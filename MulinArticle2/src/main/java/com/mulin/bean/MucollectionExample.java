package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MucollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MucollectionExample() {
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

        public Criteria andCollectidIsNull() {
            addCriterion("collectId is null");
            return (Criteria) this;
        }

        public Criteria andCollectidIsNotNull() {
            addCriterion("collectId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectidEqualTo(Integer value) {
            addCriterion("collectId =", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotEqualTo(Integer value) {
            addCriterion("collectId <>", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThan(Integer value) {
            addCriterion("collectId >", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectId >=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThan(Integer value) {
            addCriterion("collectId <", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThanOrEqualTo(Integer value) {
            addCriterion("collectId <=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidIn(List<Integer> values) {
            addCriterion("collectId in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotIn(List<Integer> values) {
            addCriterion("collectId not in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidBetween(Integer value1, Integer value2) {
            addCriterion("collectId between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotBetween(Integer value1, Integer value2) {
            addCriterion("collectId not between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityId not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andCollectnameIsNull() {
            addCriterion("collectName is null");
            return (Criteria) this;
        }

        public Criteria andCollectnameIsNotNull() {
            addCriterion("collectName is not null");
            return (Criteria) this;
        }

        public Criteria andCollectnameEqualTo(String value) {
            addCriterion("collectName =", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameNotEqualTo(String value) {
            addCriterion("collectName <>", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameGreaterThan(String value) {
            addCriterion("collectName >", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameGreaterThanOrEqualTo(String value) {
            addCriterion("collectName >=", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameLessThan(String value) {
            addCriterion("collectName <", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameLessThanOrEqualTo(String value) {
            addCriterion("collectName <=", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameLike(String value) {
            addCriterion("collectName like", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameNotLike(String value) {
            addCriterion("collectName not like", value, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameIn(List<String> values) {
            addCriterion("collectName in", values, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameNotIn(List<String> values) {
            addCriterion("collectName not in", values, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameBetween(String value1, String value2) {
            addCriterion("collectName between", value1, value2, "collectname");
            return (Criteria) this;
        }

        public Criteria andCollectnameNotBetween(String value1, String value2) {
            addCriterion("collectName not between", value1, value2, "collectname");
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomType is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomType is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("roomType =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("roomType <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("roomType >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roomType >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("roomType <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("roomType <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("roomType like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("roomType not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("roomType in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("roomType not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("roomType between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("roomType not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andContexttypeIsNull() {
            addCriterion("contextType is null");
            return (Criteria) this;
        }

        public Criteria andContexttypeIsNotNull() {
            addCriterion("contextType is not null");
            return (Criteria) this;
        }

        public Criteria andContexttypeEqualTo(String value) {
            addCriterion("contextType =", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeNotEqualTo(String value) {
            addCriterion("contextType <>", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeGreaterThan(String value) {
            addCriterion("contextType >", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contextType >=", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeLessThan(String value) {
            addCriterion("contextType <", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeLessThanOrEqualTo(String value) {
            addCriterion("contextType <=", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeLike(String value) {
            addCriterion("contextType like", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeNotLike(String value) {
            addCriterion("contextType not like", value, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeIn(List<String> values) {
            addCriterion("contextType in", values, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeNotIn(List<String> values) {
            addCriterion("contextType not in", values, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeBetween(String value1, String value2) {
            addCriterion("contextType between", value1, value2, "contexttype");
            return (Criteria) this;
        }

        public Criteria andContexttypeNotBetween(String value1, String value2) {
            addCriterion("contextType not between", value1, value2, "contexttype");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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