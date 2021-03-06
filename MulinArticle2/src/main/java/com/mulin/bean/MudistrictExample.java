package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MudistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MudistrictExample() {
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

        public Criteria andDistrictidIsNull() {
            addCriterion("districtId is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("districtId is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(Long value) {
            addCriterion("districtId =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(Long value) {
            addCriterion("districtId <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(Long value) {
            addCriterion("districtId >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(Long value) {
            addCriterion("districtId >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(Long value) {
            addCriterion("districtId <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(Long value) {
            addCriterion("districtId <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<Long> values) {
            addCriterion("districtId in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<Long> values) {
            addCriterion("districtId not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(Long value1, Long value2) {
            addCriterion("districtId between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(Long value1, Long value2) {
            addCriterion("districtId not between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNull() {
            addCriterion("districtName is null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNotNull() {
            addCriterion("districtName is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameEqualTo(String value) {
            addCriterion("districtName =", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotEqualTo(String value) {
            addCriterion("districtName <>", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThan(String value) {
            addCriterion("districtName >", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThanOrEqualTo(String value) {
            addCriterion("districtName >=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThan(String value) {
            addCriterion("districtName <", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThanOrEqualTo(String value) {
            addCriterion("districtName <=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLike(String value) {
            addCriterion("districtName like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotLike(String value) {
            addCriterion("districtName not like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIn(List<String> values) {
            addCriterion("districtName in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotIn(List<String> values) {
            addCriterion("districtName not in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameBetween(String value1, String value2) {
            addCriterion("districtName between", value1, value2, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotBetween(String value1, String value2) {
            addCriterion("districtName not between", value1, value2, "districtname");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Long value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Long value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Long value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Long value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Long value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Long> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Long> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Long value1, Long value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Long value1, Long value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
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