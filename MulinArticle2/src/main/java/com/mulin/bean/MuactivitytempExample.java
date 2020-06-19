package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MuactivitytempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuactivitytempExample() {
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

        public Criteria andZongjieactivityidIsNull() {
            addCriterion("zongJieActivityID is null");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidIsNotNull() {
            addCriterion("zongJieActivityID is not null");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidEqualTo(Integer value) {
            addCriterion("zongJieActivityID =", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidNotEqualTo(Integer value) {
            addCriterion("zongJieActivityID <>", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidGreaterThan(Integer value) {
            addCriterion("zongJieActivityID >", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zongJieActivityID >=", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidLessThan(Integer value) {
            addCriterion("zongJieActivityID <", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidLessThanOrEqualTo(Integer value) {
            addCriterion("zongJieActivityID <=", value, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidIn(List<Integer> values) {
            addCriterion("zongJieActivityID in", values, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidNotIn(List<Integer> values) {
            addCriterion("zongJieActivityID not in", values, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidBetween(Integer value1, Integer value2) {
            addCriterion("zongJieActivityID between", value1, value2, "zongjieactivityid");
            return (Criteria) this;
        }

        public Criteria andZongjieactivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("zongJieActivityID not between", value1, value2, "zongjieactivityid");
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

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(String value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(String value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(String value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(String value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(String value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(String value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLike(String value) {
            addCriterion("updateDate like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotLike(String value) {
            addCriterion("updateDate not like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<String> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<String> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(String value1, String value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(String value1, String value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andDeldateIsNull() {
            addCriterion("delDate is null");
            return (Criteria) this;
        }

        public Criteria andDeldateIsNotNull() {
            addCriterion("delDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeldateEqualTo(String value) {
            addCriterion("delDate =", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateNotEqualTo(String value) {
            addCriterion("delDate <>", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateGreaterThan(String value) {
            addCriterion("delDate >", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateGreaterThanOrEqualTo(String value) {
            addCriterion("delDate >=", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateLessThan(String value) {
            addCriterion("delDate <", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateLessThanOrEqualTo(String value) {
            addCriterion("delDate <=", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateLike(String value) {
            addCriterion("delDate like", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateNotLike(String value) {
            addCriterion("delDate not like", value, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateIn(List<String> values) {
            addCriterion("delDate in", values, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateNotIn(List<String> values) {
            addCriterion("delDate not in", values, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateBetween(String value1, String value2) {
            addCriterion("delDate between", value1, value2, "deldate");
            return (Criteria) this;
        }

        public Criteria andDeldateNotBetween(String value1, String value2) {
            addCriterion("delDate not between", value1, value2, "deldate");
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

        public Criteria andIsdelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectID is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectID is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("subjectID =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("subjectID <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("subjectID >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectID >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("subjectID <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("subjectID <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("subjectID in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("subjectID not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("subjectID between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectID not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNull() {
            addCriterion("favorite is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNotNull() {
            addCriterion("favorite is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteEqualTo(String value) {
            addCriterion("favorite =", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotEqualTo(String value) {
            addCriterion("favorite <>", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThan(String value) {
            addCriterion("favorite >", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThanOrEqualTo(String value) {
            addCriterion("favorite >=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThan(String value) {
            addCriterion("favorite <", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThanOrEqualTo(String value) {
            addCriterion("favorite <=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLike(String value) {
            addCriterion("favorite like", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotLike(String value) {
            addCriterion("favorite not like", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteIn(List<String> values) {
            addCriterion("favorite in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotIn(List<String> values) {
            addCriterion("favorite not in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteBetween(String value1, String value2) {
            addCriterion("favorite between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotBetween(String value1, String value2) {
            addCriterion("favorite not between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("signtype is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("signtype is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(String value) {
            addCriterion("signtype =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(String value) {
            addCriterion("signtype <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(String value) {
            addCriterion("signtype >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("signtype >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(String value) {
            addCriterion("signtype <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(String value) {
            addCriterion("signtype <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLike(String value) {
            addCriterion("signtype like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotLike(String value) {
            addCriterion("signtype not like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<String> values) {
            addCriterion("signtype in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<String> values) {
            addCriterion("signtype not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(String value1, String value2) {
            addCriterion("signtype between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(String value1, String value2) {
            addCriterion("signtype not between", value1, value2, "signtype");
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

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startDate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startDate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("endDate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("endDate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
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

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
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

        public Criteria andActtypeIsNull() {
            addCriterion("actType is null");
            return (Criteria) this;
        }

        public Criteria andActtypeIsNotNull() {
            addCriterion("actType is not null");
            return (Criteria) this;
        }

        public Criteria andActtypeEqualTo(String value) {
            addCriterion("actType =", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeNotEqualTo(String value) {
            addCriterion("actType <>", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeGreaterThan(String value) {
            addCriterion("actType >", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeGreaterThanOrEqualTo(String value) {
            addCriterion("actType >=", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeLessThan(String value) {
            addCriterion("actType <", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeLessThanOrEqualTo(String value) {
            addCriterion("actType <=", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeLike(String value) {
            addCriterion("actType like", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeNotLike(String value) {
            addCriterion("actType not like", value, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeIn(List<String> values) {
            addCriterion("actType in", values, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeNotIn(List<String> values) {
            addCriterion("actType not in", values, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeBetween(String value1, String value2) {
            addCriterion("actType between", value1, value2, "acttype");
            return (Criteria) this;
        }

        public Criteria andActtypeNotBetween(String value1, String value2) {
            addCriterion("actType not between", value1, value2, "acttype");
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