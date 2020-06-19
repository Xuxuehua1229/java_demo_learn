package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MucommitteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MucommitteeExample() {
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

        public Criteria andCommitteeidIsNull() {
            addCriterion("committeeId is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeidIsNotNull() {
            addCriterion("committeeId is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeidEqualTo(Long value) {
            addCriterion("committeeId =", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidNotEqualTo(Long value) {
            addCriterion("committeeId <>", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidGreaterThan(Long value) {
            addCriterion("committeeId >", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidGreaterThanOrEqualTo(Long value) {
            addCriterion("committeeId >=", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidLessThan(Long value) {
            addCriterion("committeeId <", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidLessThanOrEqualTo(Long value) {
            addCriterion("committeeId <=", value, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidIn(List<Long> values) {
            addCriterion("committeeId in", values, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidNotIn(List<Long> values) {
            addCriterion("committeeId not in", values, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidBetween(Long value1, Long value2) {
            addCriterion("committeeId between", value1, value2, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteeidNotBetween(Long value1, Long value2) {
            addCriterion("committeeId not between", value1, value2, "committeeid");
            return (Criteria) this;
        }

        public Criteria andCommitteenameIsNull() {
            addCriterion("committeeName is null");
            return (Criteria) this;
        }

        public Criteria andCommitteenameIsNotNull() {
            addCriterion("committeeName is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteenameEqualTo(String value) {
            addCriterion("committeeName =", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameNotEqualTo(String value) {
            addCriterion("committeeName <>", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameGreaterThan(String value) {
            addCriterion("committeeName >", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameGreaterThanOrEqualTo(String value) {
            addCriterion("committeeName >=", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameLessThan(String value) {
            addCriterion("committeeName <", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameLessThanOrEqualTo(String value) {
            addCriterion("committeeName <=", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameLike(String value) {
            addCriterion("committeeName like", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameNotLike(String value) {
            addCriterion("committeeName not like", value, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameIn(List<String> values) {
            addCriterion("committeeName in", values, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameNotIn(List<String> values) {
            addCriterion("committeeName not in", values, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameBetween(String value1, String value2) {
            addCriterion("committeeName between", value1, value2, "committeename");
            return (Criteria) this;
        }

        public Criteria andCommitteenameNotBetween(String value1, String value2) {
            addCriterion("committeeName not between", value1, value2, "committeename");
            return (Criteria) this;
        }

        public Criteria andStreetidIsNull() {
            addCriterion("streetId is null");
            return (Criteria) this;
        }

        public Criteria andStreetidIsNotNull() {
            addCriterion("streetId is not null");
            return (Criteria) this;
        }

        public Criteria andStreetidEqualTo(Long value) {
            addCriterion("streetId =", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotEqualTo(Long value) {
            addCriterion("streetId <>", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidGreaterThan(Long value) {
            addCriterion("streetId >", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidGreaterThanOrEqualTo(Long value) {
            addCriterion("streetId >=", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidLessThan(Long value) {
            addCriterion("streetId <", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidLessThanOrEqualTo(Long value) {
            addCriterion("streetId <=", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidIn(List<Long> values) {
            addCriterion("streetId in", values, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotIn(List<Long> values) {
            addCriterion("streetId not in", values, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidBetween(Long value1, Long value2) {
            addCriterion("streetId between", value1, value2, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotBetween(Long value1, Long value2) {
            addCriterion("streetId not between", value1, value2, "streetid");
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