package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MucommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MucommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
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

        public Criteria andActivityidEqualTo(String value) {
            addCriterion("activityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(String value) {
            addCriterion("activityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(String value) {
            addCriterion("activityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(String value) {
            addCriterion("activityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(String value) {
            addCriterion("activityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(String value) {
            addCriterion("activityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLike(String value) {
            addCriterion("activityId like", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotLike(String value) {
            addCriterion("activityId not like", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<String> values) {
            addCriterion("activityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<String> values) {
            addCriterion("activityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(String value1, String value2) {
            addCriterion("activityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(String value1, String value2) {
            addCriterion("activityId not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andCommentnameIsNull() {
            addCriterion("commentName is null");
            return (Criteria) this;
        }

        public Criteria andCommentnameIsNotNull() {
            addCriterion("commentName is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnameEqualTo(String value) {
            addCriterion("commentName =", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameNotEqualTo(String value) {
            addCriterion("commentName <>", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameGreaterThan(String value) {
            addCriterion("commentName >", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameGreaterThanOrEqualTo(String value) {
            addCriterion("commentName >=", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameLessThan(String value) {
            addCriterion("commentName <", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameLessThanOrEqualTo(String value) {
            addCriterion("commentName <=", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameLike(String value) {
            addCriterion("commentName like", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameNotLike(String value) {
            addCriterion("commentName not like", value, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameIn(List<String> values) {
            addCriterion("commentName in", values, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameNotIn(List<String> values) {
            addCriterion("commentName not in", values, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameBetween(String value1, String value2) {
            addCriterion("commentName between", value1, value2, "commentname");
            return (Criteria) this;
        }

        public Criteria andCommentnameNotBetween(String value1, String value2) {
            addCriterion("commentName not between", value1, value2, "commentname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameIsNull() {
            addCriterion("writeBackName is null");
            return (Criteria) this;
        }

        public Criteria andWritebacknameIsNotNull() {
            addCriterion("writeBackName is not null");
            return (Criteria) this;
        }

        public Criteria andWritebacknameEqualTo(String value) {
            addCriterion("writeBackName =", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameNotEqualTo(String value) {
            addCriterion("writeBackName <>", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameGreaterThan(String value) {
            addCriterion("writeBackName >", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameGreaterThanOrEqualTo(String value) {
            addCriterion("writeBackName >=", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameLessThan(String value) {
            addCriterion("writeBackName <", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameLessThanOrEqualTo(String value) {
            addCriterion("writeBackName <=", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameLike(String value) {
            addCriterion("writeBackName like", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameNotLike(String value) {
            addCriterion("writeBackName not like", value, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameIn(List<String> values) {
            addCriterion("writeBackName in", values, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameNotIn(List<String> values) {
            addCriterion("writeBackName not in", values, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameBetween(String value1, String value2) {
            addCriterion("writeBackName between", value1, value2, "writebackname");
            return (Criteria) this;
        }

        public Criteria andWritebacknameNotBetween(String value1, String value2) {
            addCriterion("writeBackName not between", value1, value2, "writebackname");
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

        public Criteria andWritebacktypeIsNull() {
            addCriterion("writeBackType is null");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeIsNotNull() {
            addCriterion("writeBackType is not null");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeEqualTo(Integer value) {
            addCriterion("writeBackType =", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeNotEqualTo(Integer value) {
            addCriterion("writeBackType <>", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeGreaterThan(Integer value) {
            addCriterion("writeBackType >", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("writeBackType >=", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeLessThan(Integer value) {
            addCriterion("writeBackType <", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeLessThanOrEqualTo(Integer value) {
            addCriterion("writeBackType <=", value, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeIn(List<Integer> values) {
            addCriterion("writeBackType in", values, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeNotIn(List<Integer> values) {
            addCriterion("writeBackType not in", values, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeBetween(Integer value1, Integer value2) {
            addCriterion("writeBackType between", value1, value2, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andWritebacktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("writeBackType not between", value1, value2, "writebacktype");
            return (Criteria) this;
        }

        public Criteria andSaygoodIsNull() {
            addCriterion("sayGood is null");
            return (Criteria) this;
        }

        public Criteria andSaygoodIsNotNull() {
            addCriterion("sayGood is not null");
            return (Criteria) this;
        }

        public Criteria andSaygoodEqualTo(Integer value) {
            addCriterion("sayGood =", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodNotEqualTo(Integer value) {
            addCriterion("sayGood <>", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodGreaterThan(Integer value) {
            addCriterion("sayGood >", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("sayGood >=", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodLessThan(Integer value) {
            addCriterion("sayGood <", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodLessThanOrEqualTo(Integer value) {
            addCriterion("sayGood <=", value, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodIn(List<Integer> values) {
            addCriterion("sayGood in", values, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodNotIn(List<Integer> values) {
            addCriterion("sayGood not in", values, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodBetween(Integer value1, Integer value2) {
            addCriterion("sayGood between", value1, value2, "saygood");
            return (Criteria) this;
        }

        public Criteria andSaygoodNotBetween(Integer value1, Integer value2) {
            addCriterion("sayGood not between", value1, value2, "saygood");
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