package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MuactiveuserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuactiveuserinfoExample() {
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

        public Criteria andUserinfoidIsNull() {
            addCriterion("userinfoId is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoidIsNotNull() {
            addCriterion("userinfoId is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoidEqualTo(Integer value) {
            addCriterion("userinfoId =", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotEqualTo(Integer value) {
            addCriterion("userinfoId <>", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidGreaterThan(Integer value) {
            addCriterion("userinfoId >", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfoId >=", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidLessThan(Integer value) {
            addCriterion("userinfoId <", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("userinfoId <=", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidIn(List<Integer> values) {
            addCriterion("userinfoId in", values, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotIn(List<Integer> values) {
            addCriterion("userinfoId not in", values, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidBetween(Integer value1, Integer value2) {
            addCriterion("userinfoId between", value1, value2, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfoId not between", value1, value2, "userinfoid");
            return (Criteria) this;
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

        public Criteria andSigndateIsNull() {
            addCriterion("signDate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signDate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(String value) {
            addCriterion("signDate =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(String value) {
            addCriterion("signDate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(String value) {
            addCriterion("signDate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(String value) {
            addCriterion("signDate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(String value) {
            addCriterion("signDate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(String value) {
            addCriterion("signDate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLike(String value) {
            addCriterion("signDate like", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotLike(String value) {
            addCriterion("signDate not like", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<String> values) {
            addCriterion("signDate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<String> values) {
            addCriterion("signDate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(String value1, String value2) {
            addCriterion("signDate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(String value1, String value2) {
            addCriterion("signDate not between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andJoinnumIsNull() {
            addCriterion("joinnum is null");
            return (Criteria) this;
        }

        public Criteria andJoinnumIsNotNull() {
            addCriterion("joinnum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinnumEqualTo(String value) {
            addCriterion("joinnum =", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotEqualTo(String value) {
            addCriterion("joinnum <>", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThan(String value) {
            addCriterion("joinnum >", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThanOrEqualTo(String value) {
            addCriterion("joinnum >=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThan(String value) {
            addCriterion("joinnum <", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThanOrEqualTo(String value) {
            addCriterion("joinnum <=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLike(String value) {
            addCriterion("joinnum like", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotLike(String value) {
            addCriterion("joinnum not like", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumIn(List<String> values) {
            addCriterion("joinnum in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotIn(List<String> values) {
            addCriterion("joinnum not in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumBetween(String value1, String value2) {
            addCriterion("joinnum between", value1, value2, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotBetween(String value1, String value2) {
            addCriterion("joinnum not between", value1, value2, "joinnum");
            return (Criteria) this;
        }

        public Criteria andChildageIsNull() {
            addCriterion("childage is null");
            return (Criteria) this;
        }

        public Criteria andChildageIsNotNull() {
            addCriterion("childage is not null");
            return (Criteria) this;
        }

        public Criteria andChildageEqualTo(String value) {
            addCriterion("childage =", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageNotEqualTo(String value) {
            addCriterion("childage <>", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageGreaterThan(String value) {
            addCriterion("childage >", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageGreaterThanOrEqualTo(String value) {
            addCriterion("childage >=", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageLessThan(String value) {
            addCriterion("childage <", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageLessThanOrEqualTo(String value) {
            addCriterion("childage <=", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageLike(String value) {
            addCriterion("childage like", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageNotLike(String value) {
            addCriterion("childage not like", value, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageIn(List<String> values) {
            addCriterion("childage in", values, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageNotIn(List<String> values) {
            addCriterion("childage not in", values, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageBetween(String value1, String value2) {
            addCriterion("childage between", value1, value2, "childage");
            return (Criteria) this;
        }

        public Criteria andChildageNotBetween(String value1, String value2) {
            addCriterion("childage not between", value1, value2, "childage");
            return (Criteria) this;
        }

        public Criteria andChildsexIsNull() {
            addCriterion("childsex is null");
            return (Criteria) this;
        }

        public Criteria andChildsexIsNotNull() {
            addCriterion("childsex is not null");
            return (Criteria) this;
        }

        public Criteria andChildsexEqualTo(String value) {
            addCriterion("childsex =", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexNotEqualTo(String value) {
            addCriterion("childsex <>", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexGreaterThan(String value) {
            addCriterion("childsex >", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexGreaterThanOrEqualTo(String value) {
            addCriterion("childsex >=", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexLessThan(String value) {
            addCriterion("childsex <", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexLessThanOrEqualTo(String value) {
            addCriterion("childsex <=", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexLike(String value) {
            addCriterion("childsex like", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexNotLike(String value) {
            addCriterion("childsex not like", value, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexIn(List<String> values) {
            addCriterion("childsex in", values, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexNotIn(List<String> values) {
            addCriterion("childsex not in", values, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexBetween(String value1, String value2) {
            addCriterion("childsex between", value1, value2, "childsex");
            return (Criteria) this;
        }

        public Criteria andChildsexNotBetween(String value1, String value2) {
            addCriterion("childsex not between", value1, value2, "childsex");
            return (Criteria) this;
        }

        public Criteria andMark1IsNull() {
            addCriterion("mark1 is null");
            return (Criteria) this;
        }

        public Criteria andMark1IsNotNull() {
            addCriterion("mark1 is not null");
            return (Criteria) this;
        }

        public Criteria andMark1EqualTo(String value) {
            addCriterion("mark1 =", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotEqualTo(String value) {
            addCriterion("mark1 <>", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThan(String value) {
            addCriterion("mark1 >", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThanOrEqualTo(String value) {
            addCriterion("mark1 >=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThan(String value) {
            addCriterion("mark1 <", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThanOrEqualTo(String value) {
            addCriterion("mark1 <=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Like(String value) {
            addCriterion("mark1 like", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotLike(String value) {
            addCriterion("mark1 not like", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1In(List<String> values) {
            addCriterion("mark1 in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotIn(List<String> values) {
            addCriterion("mark1 not in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Between(String value1, String value2) {
            addCriterion("mark1 between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotBetween(String value1, String value2) {
            addCriterion("mark1 not between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark2IsNull() {
            addCriterion("mark2 is null");
            return (Criteria) this;
        }

        public Criteria andMark2IsNotNull() {
            addCriterion("mark2 is not null");
            return (Criteria) this;
        }

        public Criteria andMark2EqualTo(String value) {
            addCriterion("mark2 =", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotEqualTo(String value) {
            addCriterion("mark2 <>", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2GreaterThan(String value) {
            addCriterion("mark2 >", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2GreaterThanOrEqualTo(String value) {
            addCriterion("mark2 >=", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2LessThan(String value) {
            addCriterion("mark2 <", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2LessThanOrEqualTo(String value) {
            addCriterion("mark2 <=", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2Like(String value) {
            addCriterion("mark2 like", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotLike(String value) {
            addCriterion("mark2 not like", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2In(List<String> values) {
            addCriterion("mark2 in", values, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotIn(List<String> values) {
            addCriterion("mark2 not in", values, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2Between(String value1, String value2) {
            addCriterion("mark2 between", value1, value2, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotBetween(String value1, String value2) {
            addCriterion("mark2 not between", value1, value2, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark3IsNull() {
            addCriterion("mark3 is null");
            return (Criteria) this;
        }

        public Criteria andMark3IsNotNull() {
            addCriterion("mark3 is not null");
            return (Criteria) this;
        }

        public Criteria andMark3EqualTo(String value) {
            addCriterion("mark3 =", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotEqualTo(String value) {
            addCriterion("mark3 <>", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3GreaterThan(String value) {
            addCriterion("mark3 >", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3GreaterThanOrEqualTo(String value) {
            addCriterion("mark3 >=", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3LessThan(String value) {
            addCriterion("mark3 <", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3LessThanOrEqualTo(String value) {
            addCriterion("mark3 <=", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3Like(String value) {
            addCriterion("mark3 like", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotLike(String value) {
            addCriterion("mark3 not like", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3In(List<String> values) {
            addCriterion("mark3 in", values, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotIn(List<String> values) {
            addCriterion("mark3 not in", values, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3Between(String value1, String value2) {
            addCriterion("mark3 between", value1, value2, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotBetween(String value1, String value2) {
            addCriterion("mark3 not between", value1, value2, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark4IsNull() {
            addCriterion("mark4 is null");
            return (Criteria) this;
        }

        public Criteria andMark4IsNotNull() {
            addCriterion("mark4 is not null");
            return (Criteria) this;
        }

        public Criteria andMark4EqualTo(String value) {
            addCriterion("mark4 =", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4NotEqualTo(String value) {
            addCriterion("mark4 <>", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4GreaterThan(String value) {
            addCriterion("mark4 >", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4GreaterThanOrEqualTo(String value) {
            addCriterion("mark4 >=", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4LessThan(String value) {
            addCriterion("mark4 <", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4LessThanOrEqualTo(String value) {
            addCriterion("mark4 <=", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4Like(String value) {
            addCriterion("mark4 like", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4NotLike(String value) {
            addCriterion("mark4 not like", value, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4In(List<String> values) {
            addCriterion("mark4 in", values, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4NotIn(List<String> values) {
            addCriterion("mark4 not in", values, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4Between(String value1, String value2) {
            addCriterion("mark4 between", value1, value2, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark4NotBetween(String value1, String value2) {
            addCriterion("mark4 not between", value1, value2, "mark4");
            return (Criteria) this;
        }

        public Criteria andMark5IsNull() {
            addCriterion("mark5 is null");
            return (Criteria) this;
        }

        public Criteria andMark5IsNotNull() {
            addCriterion("mark5 is not null");
            return (Criteria) this;
        }

        public Criteria andMark5EqualTo(String value) {
            addCriterion("mark5 =", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5NotEqualTo(String value) {
            addCriterion("mark5 <>", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5GreaterThan(String value) {
            addCriterion("mark5 >", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5GreaterThanOrEqualTo(String value) {
            addCriterion("mark5 >=", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5LessThan(String value) {
            addCriterion("mark5 <", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5LessThanOrEqualTo(String value) {
            addCriterion("mark5 <=", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5Like(String value) {
            addCriterion("mark5 like", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5NotLike(String value) {
            addCriterion("mark5 not like", value, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5In(List<String> values) {
            addCriterion("mark5 in", values, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5NotIn(List<String> values) {
            addCriterion("mark5 not in", values, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5Between(String value1, String value2) {
            addCriterion("mark5 between", value1, value2, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark5NotBetween(String value1, String value2) {
            addCriterion("mark5 not between", value1, value2, "mark5");
            return (Criteria) this;
        }

        public Criteria andMark6IsNull() {
            addCriterion("mark6 is null");
            return (Criteria) this;
        }

        public Criteria andMark6IsNotNull() {
            addCriterion("mark6 is not null");
            return (Criteria) this;
        }

        public Criteria andMark6EqualTo(String value) {
            addCriterion("mark6 =", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6NotEqualTo(String value) {
            addCriterion("mark6 <>", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6GreaterThan(String value) {
            addCriterion("mark6 >", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6GreaterThanOrEqualTo(String value) {
            addCriterion("mark6 >=", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6LessThan(String value) {
            addCriterion("mark6 <", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6LessThanOrEqualTo(String value) {
            addCriterion("mark6 <=", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6Like(String value) {
            addCriterion("mark6 like", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6NotLike(String value) {
            addCriterion("mark6 not like", value, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6In(List<String> values) {
            addCriterion("mark6 in", values, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6NotIn(List<String> values) {
            addCriterion("mark6 not in", values, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6Between(String value1, String value2) {
            addCriterion("mark6 between", value1, value2, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark6NotBetween(String value1, String value2) {
            addCriterion("mark6 not between", value1, value2, "mark6");
            return (Criteria) this;
        }

        public Criteria andMark7IsNull() {
            addCriterion("mark7 is null");
            return (Criteria) this;
        }

        public Criteria andMark7IsNotNull() {
            addCriterion("mark7 is not null");
            return (Criteria) this;
        }

        public Criteria andMark7EqualTo(String value) {
            addCriterion("mark7 =", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7NotEqualTo(String value) {
            addCriterion("mark7 <>", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7GreaterThan(String value) {
            addCriterion("mark7 >", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7GreaterThanOrEqualTo(String value) {
            addCriterion("mark7 >=", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7LessThan(String value) {
            addCriterion("mark7 <", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7LessThanOrEqualTo(String value) {
            addCriterion("mark7 <=", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7Like(String value) {
            addCriterion("mark7 like", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7NotLike(String value) {
            addCriterion("mark7 not like", value, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7In(List<String> values) {
            addCriterion("mark7 in", values, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7NotIn(List<String> values) {
            addCriterion("mark7 not in", values, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7Between(String value1, String value2) {
            addCriterion("mark7 between", value1, value2, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark7NotBetween(String value1, String value2) {
            addCriterion("mark7 not between", value1, value2, "mark7");
            return (Criteria) this;
        }

        public Criteria andMark8IsNull() {
            addCriterion("mark8 is null");
            return (Criteria) this;
        }

        public Criteria andMark8IsNotNull() {
            addCriterion("mark8 is not null");
            return (Criteria) this;
        }

        public Criteria andMark8EqualTo(String value) {
            addCriterion("mark8 =", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8NotEqualTo(String value) {
            addCriterion("mark8 <>", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8GreaterThan(String value) {
            addCriterion("mark8 >", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8GreaterThanOrEqualTo(String value) {
            addCriterion("mark8 >=", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8LessThan(String value) {
            addCriterion("mark8 <", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8LessThanOrEqualTo(String value) {
            addCriterion("mark8 <=", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8Like(String value) {
            addCriterion("mark8 like", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8NotLike(String value) {
            addCriterion("mark8 not like", value, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8In(List<String> values) {
            addCriterion("mark8 in", values, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8NotIn(List<String> values) {
            addCriterion("mark8 not in", values, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8Between(String value1, String value2) {
            addCriterion("mark8 between", value1, value2, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark8NotBetween(String value1, String value2) {
            addCriterion("mark8 not between", value1, value2, "mark8");
            return (Criteria) this;
        }

        public Criteria andMark9IsNull() {
            addCriterion("mark9 is null");
            return (Criteria) this;
        }

        public Criteria andMark9IsNotNull() {
            addCriterion("mark9 is not null");
            return (Criteria) this;
        }

        public Criteria andMark9EqualTo(String value) {
            addCriterion("mark9 =", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9NotEqualTo(String value) {
            addCriterion("mark9 <>", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9GreaterThan(String value) {
            addCriterion("mark9 >", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9GreaterThanOrEqualTo(String value) {
            addCriterion("mark9 >=", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9LessThan(String value) {
            addCriterion("mark9 <", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9LessThanOrEqualTo(String value) {
            addCriterion("mark9 <=", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9Like(String value) {
            addCriterion("mark9 like", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9NotLike(String value) {
            addCriterion("mark9 not like", value, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9In(List<String> values) {
            addCriterion("mark9 in", values, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9NotIn(List<String> values) {
            addCriterion("mark9 not in", values, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9Between(String value1, String value2) {
            addCriterion("mark9 between", value1, value2, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark9NotBetween(String value1, String value2) {
            addCriterion("mark9 not between", value1, value2, "mark9");
            return (Criteria) this;
        }

        public Criteria andMark10IsNull() {
            addCriterion("mark10 is null");
            return (Criteria) this;
        }

        public Criteria andMark10IsNotNull() {
            addCriterion("mark10 is not null");
            return (Criteria) this;
        }

        public Criteria andMark10EqualTo(String value) {
            addCriterion("mark10 =", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10NotEqualTo(String value) {
            addCriterion("mark10 <>", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10GreaterThan(String value) {
            addCriterion("mark10 >", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10GreaterThanOrEqualTo(String value) {
            addCriterion("mark10 >=", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10LessThan(String value) {
            addCriterion("mark10 <", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10LessThanOrEqualTo(String value) {
            addCriterion("mark10 <=", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10Like(String value) {
            addCriterion("mark10 like", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10NotLike(String value) {
            addCriterion("mark10 not like", value, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10In(List<String> values) {
            addCriterion("mark10 in", values, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10NotIn(List<String> values) {
            addCriterion("mark10 not in", values, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10Between(String value1, String value2) {
            addCriterion("mark10 between", value1, value2, "mark10");
            return (Criteria) this;
        }

        public Criteria andMark10NotBetween(String value1, String value2) {
            addCriterion("mark10 not between", value1, value2, "mark10");
            return (Criteria) this;
        }

        public Criteria andIssignupIsNull() {
            addCriterion("issignup is null");
            return (Criteria) this;
        }

        public Criteria andIssignupIsNotNull() {
            addCriterion("issignup is not null");
            return (Criteria) this;
        }

        public Criteria andIssignupEqualTo(String value) {
            addCriterion("issignup =", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupNotEqualTo(String value) {
            addCriterion("issignup <>", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupGreaterThan(String value) {
            addCriterion("issignup >", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupGreaterThanOrEqualTo(String value) {
            addCriterion("issignup >=", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupLessThan(String value) {
            addCriterion("issignup <", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupLessThanOrEqualTo(String value) {
            addCriterion("issignup <=", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupLike(String value) {
            addCriterion("issignup like", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupNotLike(String value) {
            addCriterion("issignup not like", value, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupIn(List<String> values) {
            addCriterion("issignup in", values, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupNotIn(List<String> values) {
            addCriterion("issignup not in", values, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupBetween(String value1, String value2) {
            addCriterion("issignup between", value1, value2, "issignup");
            return (Criteria) this;
        }

        public Criteria andIssignupNotBetween(String value1, String value2) {
            addCriterion("issignup not between", value1, value2, "issignup");
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