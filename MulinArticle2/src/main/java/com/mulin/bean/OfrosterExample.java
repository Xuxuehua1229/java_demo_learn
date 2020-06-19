package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class OfrosterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfrosterExample() {
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

        public Criteria andRosteridIsNull() {
            addCriterion("rosterID is null");
            return (Criteria) this;
        }

        public Criteria andRosteridIsNotNull() {
            addCriterion("rosterID is not null");
            return (Criteria) this;
        }

        public Criteria andRosteridEqualTo(Long value) {
            addCriterion("rosterID =", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridNotEqualTo(Long value) {
            addCriterion("rosterID <>", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridGreaterThan(Long value) {
            addCriterion("rosterID >", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridGreaterThanOrEqualTo(Long value) {
            addCriterion("rosterID >=", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridLessThan(Long value) {
            addCriterion("rosterID <", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridLessThanOrEqualTo(Long value) {
            addCriterion("rosterID <=", value, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridIn(List<Long> values) {
            addCriterion("rosterID in", values, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridNotIn(List<Long> values) {
            addCriterion("rosterID not in", values, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridBetween(Long value1, Long value2) {
            addCriterion("rosterID between", value1, value2, "rosterid");
            return (Criteria) this;
        }

        public Criteria andRosteridNotBetween(Long value1, Long value2) {
            addCriterion("rosterID not between", value1, value2, "rosterid");
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

        public Criteria andSubIsNull() {
            addCriterion("sub is null");
            return (Criteria) this;
        }

        public Criteria andSubIsNotNull() {
            addCriterion("sub is not null");
            return (Criteria) this;
        }

        public Criteria andSubEqualTo(Byte value) {
            addCriterion("sub =", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubNotEqualTo(Byte value) {
            addCriterion("sub <>", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubGreaterThan(Byte value) {
            addCriterion("sub >", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubGreaterThanOrEqualTo(Byte value) {
            addCriterion("sub >=", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubLessThan(Byte value) {
            addCriterion("sub <", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubLessThanOrEqualTo(Byte value) {
            addCriterion("sub <=", value, "sub");
            return (Criteria) this;
        }

        public Criteria andSubIn(List<Byte> values) {
            addCriterion("sub in", values, "sub");
            return (Criteria) this;
        }

        public Criteria andSubNotIn(List<Byte> values) {
            addCriterion("sub not in", values, "sub");
            return (Criteria) this;
        }

        public Criteria andSubBetween(Byte value1, Byte value2) {
            addCriterion("sub between", value1, value2, "sub");
            return (Criteria) this;
        }

        public Criteria andSubNotBetween(Byte value1, Byte value2) {
            addCriterion("sub not between", value1, value2, "sub");
            return (Criteria) this;
        }

        public Criteria andAskIsNull() {
            addCriterion("ask is null");
            return (Criteria) this;
        }

        public Criteria andAskIsNotNull() {
            addCriterion("ask is not null");
            return (Criteria) this;
        }

        public Criteria andAskEqualTo(Byte value) {
            addCriterion("ask =", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotEqualTo(Byte value) {
            addCriterion("ask <>", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThan(Byte value) {
            addCriterion("ask >", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThanOrEqualTo(Byte value) {
            addCriterion("ask >=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThan(Byte value) {
            addCriterion("ask <", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThanOrEqualTo(Byte value) {
            addCriterion("ask <=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskIn(List<Byte> values) {
            addCriterion("ask in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotIn(List<Byte> values) {
            addCriterion("ask not in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskBetween(Byte value1, Byte value2) {
            addCriterion("ask between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotBetween(Byte value1, Byte value2) {
            addCriterion("ask not between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andRecvIsNull() {
            addCriterion("recv is null");
            return (Criteria) this;
        }

        public Criteria andRecvIsNotNull() {
            addCriterion("recv is not null");
            return (Criteria) this;
        }

        public Criteria andRecvEqualTo(Byte value) {
            addCriterion("recv =", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotEqualTo(Byte value) {
            addCriterion("recv <>", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvGreaterThan(Byte value) {
            addCriterion("recv >", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvGreaterThanOrEqualTo(Byte value) {
            addCriterion("recv >=", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvLessThan(Byte value) {
            addCriterion("recv <", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvLessThanOrEqualTo(Byte value) {
            addCriterion("recv <=", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvIn(List<Byte> values) {
            addCriterion("recv in", values, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotIn(List<Byte> values) {
            addCriterion("recv not in", values, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvBetween(Byte value1, Byte value2) {
            addCriterion("recv between", value1, value2, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotBetween(Byte value1, Byte value2) {
            addCriterion("recv not between", value1, value2, "recv");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andMarknameIsNull() {
            addCriterion("markname is null");
            return (Criteria) this;
        }

        public Criteria andMarknameIsNotNull() {
            addCriterion("markname is not null");
            return (Criteria) this;
        }

        public Criteria andMarknameEqualTo(String value) {
            addCriterion("markname =", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotEqualTo(String value) {
            addCriterion("markname <>", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameGreaterThan(String value) {
            addCriterion("markname >", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameGreaterThanOrEqualTo(String value) {
            addCriterion("markname >=", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLessThan(String value) {
            addCriterion("markname <", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLessThanOrEqualTo(String value) {
            addCriterion("markname <=", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLike(String value) {
            addCriterion("markname like", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotLike(String value) {
            addCriterion("markname not like", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameIn(List<String> values) {
            addCriterion("markname in", values, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotIn(List<String> values) {
            addCriterion("markname not in", values, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameBetween(String value1, String value2) {
            addCriterion("markname between", value1, value2, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotBetween(String value1, String value2) {
            addCriterion("markname not between", value1, value2, "markname");
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