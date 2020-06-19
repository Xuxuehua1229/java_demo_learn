package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MuexampleroomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuexampleroomsExample() {
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

        public Criteria andExampleidIsNull() {
            addCriterion("exampleId is null");
            return (Criteria) this;
        }

        public Criteria andExampleidIsNotNull() {
            addCriterion("exampleId is not null");
            return (Criteria) this;
        }

        public Criteria andExampleidEqualTo(Integer value) {
            addCriterion("exampleId =", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidNotEqualTo(Integer value) {
            addCriterion("exampleId <>", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidGreaterThan(Integer value) {
            addCriterion("exampleId >", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampleId >=", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidLessThan(Integer value) {
            addCriterion("exampleId <", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidLessThanOrEqualTo(Integer value) {
            addCriterion("exampleId <=", value, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidIn(List<Integer> values) {
            addCriterion("exampleId in", values, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidNotIn(List<Integer> values) {
            addCriterion("exampleId not in", values, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidBetween(Integer value1, Integer value2) {
            addCriterion("exampleId between", value1, value2, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExampleidNotBetween(Integer value1, Integer value2) {
            addCriterion("exampleId not between", value1, value2, "exampleid");
            return (Criteria) this;
        }

        public Criteria andExamplenameIsNull() {
            addCriterion("exampleName is null");
            return (Criteria) this;
        }

        public Criteria andExamplenameIsNotNull() {
            addCriterion("exampleName is not null");
            return (Criteria) this;
        }

        public Criteria andExamplenameEqualTo(String value) {
            addCriterion("exampleName =", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameNotEqualTo(String value) {
            addCriterion("exampleName <>", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameGreaterThan(String value) {
            addCriterion("exampleName >", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameGreaterThanOrEqualTo(String value) {
            addCriterion("exampleName >=", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameLessThan(String value) {
            addCriterion("exampleName <", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameLessThanOrEqualTo(String value) {
            addCriterion("exampleName <=", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameLike(String value) {
            addCriterion("exampleName like", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameNotLike(String value) {
            addCriterion("exampleName not like", value, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameIn(List<String> values) {
            addCriterion("exampleName in", values, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameNotIn(List<String> values) {
            addCriterion("exampleName not in", values, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameBetween(String value1, String value2) {
            addCriterion("exampleName between", value1, value2, "examplename");
            return (Criteria) this;
        }

        public Criteria andExamplenameNotBetween(String value1, String value2) {
            addCriterion("exampleName not between", value1, value2, "examplename");
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

        public Criteria andExampletypeIsNull() {
            addCriterion("exampleType is null");
            return (Criteria) this;
        }

        public Criteria andExampletypeIsNotNull() {
            addCriterion("exampleType is not null");
            return (Criteria) this;
        }

        public Criteria andExampletypeEqualTo(Integer value) {
            addCriterion("exampleType =", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeNotEqualTo(Integer value) {
            addCriterion("exampleType <>", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeGreaterThan(Integer value) {
            addCriterion("exampleType >", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampleType >=", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeLessThan(Integer value) {
            addCriterion("exampleType <", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeLessThanOrEqualTo(Integer value) {
            addCriterion("exampleType <=", value, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeIn(List<Integer> values) {
            addCriterion("exampleType in", values, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeNotIn(List<Integer> values) {
            addCriterion("exampleType not in", values, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeBetween(Integer value1, Integer value2) {
            addCriterion("exampleType between", value1, value2, "exampletype");
            return (Criteria) this;
        }

        public Criteria andExampletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("exampleType not between", value1, value2, "exampletype");
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