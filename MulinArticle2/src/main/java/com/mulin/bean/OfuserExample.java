package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class OfuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfuserExample() {
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

        public Criteria andPlainpasswordIsNull() {
            addCriterion("plainPassword is null");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordIsNotNull() {
            addCriterion("plainPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordEqualTo(String value) {
            addCriterion("plainPassword =", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordNotEqualTo(String value) {
            addCriterion("plainPassword <>", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordGreaterThan(String value) {
            addCriterion("plainPassword >", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("plainPassword >=", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordLessThan(String value) {
            addCriterion("plainPassword <", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordLessThanOrEqualTo(String value) {
            addCriterion("plainPassword <=", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordLike(String value) {
            addCriterion("plainPassword like", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordNotLike(String value) {
            addCriterion("plainPassword not like", value, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordIn(List<String> values) {
            addCriterion("plainPassword in", values, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordNotIn(List<String> values) {
            addCriterion("plainPassword not in", values, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordBetween(String value1, String value2) {
            addCriterion("plainPassword between", value1, value2, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andPlainpasswordNotBetween(String value1, String value2) {
            addCriterion("plainPassword not between", value1, value2, "plainpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordIsNull() {
            addCriterion("encryptedPassword is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordIsNotNull() {
            addCriterion("encryptedPassword is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordEqualTo(String value) {
            addCriterion("encryptedPassword =", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordNotEqualTo(String value) {
            addCriterion("encryptedPassword <>", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordGreaterThan(String value) {
            addCriterion("encryptedPassword >", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("encryptedPassword >=", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordLessThan(String value) {
            addCriterion("encryptedPassword <", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordLessThanOrEqualTo(String value) {
            addCriterion("encryptedPassword <=", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordLike(String value) {
            addCriterion("encryptedPassword like", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordNotLike(String value) {
            addCriterion("encryptedPassword not like", value, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordIn(List<String> values) {
            addCriterion("encryptedPassword in", values, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordNotIn(List<String> values) {
            addCriterion("encryptedPassword not in", values, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordBetween(String value1, String value2) {
            addCriterion("encryptedPassword between", value1, value2, "encryptedpassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedpasswordNotBetween(String value1, String value2) {
            addCriterion("encryptedPassword not between", value1, value2, "encryptedpassword");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andModificationdateIsNull() {
            addCriterion("modificationDate is null");
            return (Criteria) this;
        }

        public Criteria andModificationdateIsNotNull() {
            addCriterion("modificationDate is not null");
            return (Criteria) this;
        }

        public Criteria andModificationdateEqualTo(String value) {
            addCriterion("modificationDate =", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotEqualTo(String value) {
            addCriterion("modificationDate <>", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateGreaterThan(String value) {
            addCriterion("modificationDate >", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateGreaterThanOrEqualTo(String value) {
            addCriterion("modificationDate >=", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateLessThan(String value) {
            addCriterion("modificationDate <", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateLessThanOrEqualTo(String value) {
            addCriterion("modificationDate <=", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateLike(String value) {
            addCriterion("modificationDate like", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotLike(String value) {
            addCriterion("modificationDate not like", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateIn(List<String> values) {
            addCriterion("modificationDate in", values, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotIn(List<String> values) {
            addCriterion("modificationDate not in", values, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateBetween(String value1, String value2) {
            addCriterion("modificationDate between", value1, value2, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotBetween(String value1, String value2) {
            addCriterion("modificationDate not between", value1, value2, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andStoredkeyIsNull() {
            addCriterion("storedKey is null");
            return (Criteria) this;
        }

        public Criteria andStoredkeyIsNotNull() {
            addCriterion("storedKey is not null");
            return (Criteria) this;
        }

        public Criteria andStoredkeyEqualTo(String value) {
            addCriterion("storedKey =", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyNotEqualTo(String value) {
            addCriterion("storedKey <>", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyGreaterThan(String value) {
            addCriterion("storedKey >", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyGreaterThanOrEqualTo(String value) {
            addCriterion("storedKey >=", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyLessThan(String value) {
            addCriterion("storedKey <", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyLessThanOrEqualTo(String value) {
            addCriterion("storedKey <=", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyLike(String value) {
            addCriterion("storedKey like", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyNotLike(String value) {
            addCriterion("storedKey not like", value, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyIn(List<String> values) {
            addCriterion("storedKey in", values, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyNotIn(List<String> values) {
            addCriterion("storedKey not in", values, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyBetween(String value1, String value2) {
            addCriterion("storedKey between", value1, value2, "storedkey");
            return (Criteria) this;
        }

        public Criteria andStoredkeyNotBetween(String value1, String value2) {
            addCriterion("storedKey not between", value1, value2, "storedkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyIsNull() {
            addCriterion("serverKey is null");
            return (Criteria) this;
        }

        public Criteria andServerkeyIsNotNull() {
            addCriterion("serverKey is not null");
            return (Criteria) this;
        }

        public Criteria andServerkeyEqualTo(String value) {
            addCriterion("serverKey =", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyNotEqualTo(String value) {
            addCriterion("serverKey <>", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyGreaterThan(String value) {
            addCriterion("serverKey >", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyGreaterThanOrEqualTo(String value) {
            addCriterion("serverKey >=", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyLessThan(String value) {
            addCriterion("serverKey <", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyLessThanOrEqualTo(String value) {
            addCriterion("serverKey <=", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyLike(String value) {
            addCriterion("serverKey like", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyNotLike(String value) {
            addCriterion("serverKey not like", value, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyIn(List<String> values) {
            addCriterion("serverKey in", values, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyNotIn(List<String> values) {
            addCriterion("serverKey not in", values, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyBetween(String value1, String value2) {
            addCriterion("serverKey between", value1, value2, "serverkey");
            return (Criteria) this;
        }

        public Criteria andServerkeyNotBetween(String value1, String value2) {
            addCriterion("serverKey not between", value1, value2, "serverkey");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andIterationsIsNull() {
            addCriterion("iterations is null");
            return (Criteria) this;
        }

        public Criteria andIterationsIsNotNull() {
            addCriterion("iterations is not null");
            return (Criteria) this;
        }

        public Criteria andIterationsEqualTo(Integer value) {
            addCriterion("iterations =", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsNotEqualTo(Integer value) {
            addCriterion("iterations <>", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsGreaterThan(Integer value) {
            addCriterion("iterations >", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsGreaterThanOrEqualTo(Integer value) {
            addCriterion("iterations >=", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsLessThan(Integer value) {
            addCriterion("iterations <", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsLessThanOrEqualTo(Integer value) {
            addCriterion("iterations <=", value, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsIn(List<Integer> values) {
            addCriterion("iterations in", values, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsNotIn(List<Integer> values) {
            addCriterion("iterations not in", values, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsBetween(Integer value1, Integer value2) {
            addCriterion("iterations between", value1, value2, "iterations");
            return (Criteria) this;
        }

        public Criteria andIterationsNotBetween(Integer value1, Integer value2) {
            addCriterion("iterations not between", value1, value2, "iterations");
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