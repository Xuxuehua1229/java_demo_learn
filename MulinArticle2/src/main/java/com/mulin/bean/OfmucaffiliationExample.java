package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class OfmucaffiliationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfmucaffiliationExample() {
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

        public Criteria andRoomidIsNull() {
            addCriterion("roomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Long value) {
            addCriterion("roomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Long value) {
            addCriterion("roomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Long value) {
            addCriterion("roomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Long value) {
            addCriterion("roomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Long value) {
            addCriterion("roomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Long value) {
            addCriterion("roomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Long> values) {
            addCriterion("roomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Long> values) {
            addCriterion("roomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Long value1, Long value2) {
            addCriterion("roomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Long value1, Long value2) {
            addCriterion("roomID not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(String value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(String value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(String value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(String value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(String value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(String value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLike(String value) {
            addCriterion("jid like", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotLike(String value) {
            addCriterion("jid not like", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<String> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<String> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(String value1, String value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(String value1, String value2) {
            addCriterion("jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNull() {
            addCriterion("affiliation is null");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNotNull() {
            addCriterion("affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliationEqualTo(Byte value) {
            addCriterion("affiliation =", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotEqualTo(Byte value) {
            addCriterion("affiliation <>", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThan(Byte value) {
            addCriterion("affiliation >", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThanOrEqualTo(Byte value) {
            addCriterion("affiliation >=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThan(Byte value) {
            addCriterion("affiliation <", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThanOrEqualTo(Byte value) {
            addCriterion("affiliation <=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationIn(List<Byte> values) {
            addCriterion("affiliation in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotIn(List<Byte> values) {
            addCriterion("affiliation not in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationBetween(Byte value1, Byte value2) {
            addCriterion("affiliation between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotBetween(Byte value1, Byte value2) {
            addCriterion("affiliation not between", value1, value2, "affiliation");
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