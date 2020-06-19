package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class OfmucroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfmucroomExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("serviceID is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Long value) {
            addCriterion("serviceID =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Long value) {
            addCriterion("serviceID <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Long value) {
            addCriterion("serviceID >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Long value) {
            addCriterion("serviceID >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Long value) {
            addCriterion("serviceID <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Long value) {
            addCriterion("serviceID <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Long> values) {
            addCriterion("serviceID in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Long> values) {
            addCriterion("serviceID not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Long value1, Long value2) {
            addCriterion("serviceID between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Long value1, Long value2) {
            addCriterion("serviceID not between", value1, value2, "serviceid");
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

        public Criteria andNaturalnameIsNull() {
            addCriterion("naturalName is null");
            return (Criteria) this;
        }

        public Criteria andNaturalnameIsNotNull() {
            addCriterion("naturalName is not null");
            return (Criteria) this;
        }

        public Criteria andNaturalnameEqualTo(String value) {
            addCriterion("naturalName =", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameNotEqualTo(String value) {
            addCriterion("naturalName <>", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameGreaterThan(String value) {
            addCriterion("naturalName >", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameGreaterThanOrEqualTo(String value) {
            addCriterion("naturalName >=", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameLessThan(String value) {
            addCriterion("naturalName <", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameLessThanOrEqualTo(String value) {
            addCriterion("naturalName <=", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameLike(String value) {
            addCriterion("naturalName like", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameNotLike(String value) {
            addCriterion("naturalName not like", value, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameIn(List<String> values) {
            addCriterion("naturalName in", values, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameNotIn(List<String> values) {
            addCriterion("naturalName not in", values, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameBetween(String value1, String value2) {
            addCriterion("naturalName between", value1, value2, "naturalname");
            return (Criteria) this;
        }

        public Criteria andNaturalnameNotBetween(String value1, String value2) {
            addCriterion("naturalName not between", value1, value2, "naturalname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLockeddateIsNull() {
            addCriterion("lockedDate is null");
            return (Criteria) this;
        }

        public Criteria andLockeddateIsNotNull() {
            addCriterion("lockedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLockeddateEqualTo(String value) {
            addCriterion("lockedDate =", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateNotEqualTo(String value) {
            addCriterion("lockedDate <>", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateGreaterThan(String value) {
            addCriterion("lockedDate >", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateGreaterThanOrEqualTo(String value) {
            addCriterion("lockedDate >=", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateLessThan(String value) {
            addCriterion("lockedDate <", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateLessThanOrEqualTo(String value) {
            addCriterion("lockedDate <=", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateLike(String value) {
            addCriterion("lockedDate like", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateNotLike(String value) {
            addCriterion("lockedDate not like", value, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateIn(List<String> values) {
            addCriterion("lockedDate in", values, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateNotIn(List<String> values) {
            addCriterion("lockedDate not in", values, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateBetween(String value1, String value2) {
            addCriterion("lockedDate between", value1, value2, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andLockeddateNotBetween(String value1, String value2) {
            addCriterion("lockedDate not between", value1, value2, "lockeddate");
            return (Criteria) this;
        }

        public Criteria andEmptydateIsNull() {
            addCriterion("emptyDate is null");
            return (Criteria) this;
        }

        public Criteria andEmptydateIsNotNull() {
            addCriterion("emptyDate is not null");
            return (Criteria) this;
        }

        public Criteria andEmptydateEqualTo(String value) {
            addCriterion("emptyDate =", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateNotEqualTo(String value) {
            addCriterion("emptyDate <>", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateGreaterThan(String value) {
            addCriterion("emptyDate >", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateGreaterThanOrEqualTo(String value) {
            addCriterion("emptyDate >=", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateLessThan(String value) {
            addCriterion("emptyDate <", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateLessThanOrEqualTo(String value) {
            addCriterion("emptyDate <=", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateLike(String value) {
            addCriterion("emptyDate like", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateNotLike(String value) {
            addCriterion("emptyDate not like", value, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateIn(List<String> values) {
            addCriterion("emptyDate in", values, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateNotIn(List<String> values) {
            addCriterion("emptyDate not in", values, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateBetween(String value1, String value2) {
            addCriterion("emptyDate between", value1, value2, "emptydate");
            return (Criteria) this;
        }

        public Criteria andEmptydateNotBetween(String value1, String value2) {
            addCriterion("emptyDate not between", value1, value2, "emptydate");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectIsNull() {
            addCriterion("canChangeSubject is null");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectIsNotNull() {
            addCriterion("canChangeSubject is not null");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectEqualTo(Byte value) {
            addCriterion("canChangeSubject =", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectNotEqualTo(Byte value) {
            addCriterion("canChangeSubject <>", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectGreaterThan(Byte value) {
            addCriterion("canChangeSubject >", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectGreaterThanOrEqualTo(Byte value) {
            addCriterion("canChangeSubject >=", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectLessThan(Byte value) {
            addCriterion("canChangeSubject <", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectLessThanOrEqualTo(Byte value) {
            addCriterion("canChangeSubject <=", value, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectIn(List<Byte> values) {
            addCriterion("canChangeSubject in", values, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectNotIn(List<Byte> values) {
            addCriterion("canChangeSubject not in", values, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectBetween(Byte value1, Byte value2) {
            addCriterion("canChangeSubject between", value1, value2, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andCanchangesubjectNotBetween(Byte value1, Byte value2) {
            addCriterion("canChangeSubject not between", value1, value2, "canchangesubject");
            return (Criteria) this;
        }

        public Criteria andMaxusersIsNull() {
            addCriterion("maxUsers is null");
            return (Criteria) this;
        }

        public Criteria andMaxusersIsNotNull() {
            addCriterion("maxUsers is not null");
            return (Criteria) this;
        }

        public Criteria andMaxusersEqualTo(Integer value) {
            addCriterion("maxUsers =", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotEqualTo(Integer value) {
            addCriterion("maxUsers <>", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersGreaterThan(Integer value) {
            addCriterion("maxUsers >", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxUsers >=", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersLessThan(Integer value) {
            addCriterion("maxUsers <", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersLessThanOrEqualTo(Integer value) {
            addCriterion("maxUsers <=", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersIn(List<Integer> values) {
            addCriterion("maxUsers in", values, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotIn(List<Integer> values) {
            addCriterion("maxUsers not in", values, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersBetween(Integer value1, Integer value2) {
            addCriterion("maxUsers between", value1, value2, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotBetween(Integer value1, Integer value2) {
            addCriterion("maxUsers not between", value1, value2, "maxusers");
            return (Criteria) this;
        }

        public Criteria andPublicroomIsNull() {
            addCriterion("publicRoom is null");
            return (Criteria) this;
        }

        public Criteria andPublicroomIsNotNull() {
            addCriterion("publicRoom is not null");
            return (Criteria) this;
        }

        public Criteria andPublicroomEqualTo(Byte value) {
            addCriterion("publicRoom =", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomNotEqualTo(Byte value) {
            addCriterion("publicRoom <>", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomGreaterThan(Byte value) {
            addCriterion("publicRoom >", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomGreaterThanOrEqualTo(Byte value) {
            addCriterion("publicRoom >=", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomLessThan(Byte value) {
            addCriterion("publicRoom <", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomLessThanOrEqualTo(Byte value) {
            addCriterion("publicRoom <=", value, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomIn(List<Byte> values) {
            addCriterion("publicRoom in", values, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomNotIn(List<Byte> values) {
            addCriterion("publicRoom not in", values, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomBetween(Byte value1, Byte value2) {
            addCriterion("publicRoom between", value1, value2, "publicroom");
            return (Criteria) this;
        }

        public Criteria andPublicroomNotBetween(Byte value1, Byte value2) {
            addCriterion("publicRoom not between", value1, value2, "publicroom");
            return (Criteria) this;
        }

        public Criteria andModeratedIsNull() {
            addCriterion("moderated is null");
            return (Criteria) this;
        }

        public Criteria andModeratedIsNotNull() {
            addCriterion("moderated is not null");
            return (Criteria) this;
        }

        public Criteria andModeratedEqualTo(Byte value) {
            addCriterion("moderated =", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedNotEqualTo(Byte value) {
            addCriterion("moderated <>", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedGreaterThan(Byte value) {
            addCriterion("moderated >", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedGreaterThanOrEqualTo(Byte value) {
            addCriterion("moderated >=", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedLessThan(Byte value) {
            addCriterion("moderated <", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedLessThanOrEqualTo(Byte value) {
            addCriterion("moderated <=", value, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedIn(List<Byte> values) {
            addCriterion("moderated in", values, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedNotIn(List<Byte> values) {
            addCriterion("moderated not in", values, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedBetween(Byte value1, Byte value2) {
            addCriterion("moderated between", value1, value2, "moderated");
            return (Criteria) this;
        }

        public Criteria andModeratedNotBetween(Byte value1, Byte value2) {
            addCriterion("moderated not between", value1, value2, "moderated");
            return (Criteria) this;
        }

        public Criteria andMembersonlyIsNull() {
            addCriterion("membersOnly is null");
            return (Criteria) this;
        }

        public Criteria andMembersonlyIsNotNull() {
            addCriterion("membersOnly is not null");
            return (Criteria) this;
        }

        public Criteria andMembersonlyEqualTo(Byte value) {
            addCriterion("membersOnly =", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyNotEqualTo(Byte value) {
            addCriterion("membersOnly <>", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyGreaterThan(Byte value) {
            addCriterion("membersOnly >", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyGreaterThanOrEqualTo(Byte value) {
            addCriterion("membersOnly >=", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyLessThan(Byte value) {
            addCriterion("membersOnly <", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyLessThanOrEqualTo(Byte value) {
            addCriterion("membersOnly <=", value, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyIn(List<Byte> values) {
            addCriterion("membersOnly in", values, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyNotIn(List<Byte> values) {
            addCriterion("membersOnly not in", values, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyBetween(Byte value1, Byte value2) {
            addCriterion("membersOnly between", value1, value2, "membersonly");
            return (Criteria) this;
        }

        public Criteria andMembersonlyNotBetween(Byte value1, Byte value2) {
            addCriterion("membersOnly not between", value1, value2, "membersonly");
            return (Criteria) this;
        }

        public Criteria andCaninviteIsNull() {
            addCriterion("canInvite is null");
            return (Criteria) this;
        }

        public Criteria andCaninviteIsNotNull() {
            addCriterion("canInvite is not null");
            return (Criteria) this;
        }

        public Criteria andCaninviteEqualTo(Byte value) {
            addCriterion("canInvite =", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteNotEqualTo(Byte value) {
            addCriterion("canInvite <>", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteGreaterThan(Byte value) {
            addCriterion("canInvite >", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteGreaterThanOrEqualTo(Byte value) {
            addCriterion("canInvite >=", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteLessThan(Byte value) {
            addCriterion("canInvite <", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteLessThanOrEqualTo(Byte value) {
            addCriterion("canInvite <=", value, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteIn(List<Byte> values) {
            addCriterion("canInvite in", values, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteNotIn(List<Byte> values) {
            addCriterion("canInvite not in", values, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteBetween(Byte value1, Byte value2) {
            addCriterion("canInvite between", value1, value2, "caninvite");
            return (Criteria) this;
        }

        public Criteria andCaninviteNotBetween(Byte value1, Byte value2) {
            addCriterion("canInvite not between", value1, value2, "caninvite");
            return (Criteria) this;
        }

        public Criteria andRoompasswordIsNull() {
            addCriterion("roomPassword is null");
            return (Criteria) this;
        }

        public Criteria andRoompasswordIsNotNull() {
            addCriterion("roomPassword is not null");
            return (Criteria) this;
        }

        public Criteria andRoompasswordEqualTo(String value) {
            addCriterion("roomPassword =", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordNotEqualTo(String value) {
            addCriterion("roomPassword <>", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordGreaterThan(String value) {
            addCriterion("roomPassword >", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordGreaterThanOrEqualTo(String value) {
            addCriterion("roomPassword >=", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordLessThan(String value) {
            addCriterion("roomPassword <", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordLessThanOrEqualTo(String value) {
            addCriterion("roomPassword <=", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordLike(String value) {
            addCriterion("roomPassword like", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordNotLike(String value) {
            addCriterion("roomPassword not like", value, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordIn(List<String> values) {
            addCriterion("roomPassword in", values, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordNotIn(List<String> values) {
            addCriterion("roomPassword not in", values, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordBetween(String value1, String value2) {
            addCriterion("roomPassword between", value1, value2, "roompassword");
            return (Criteria) this;
        }

        public Criteria andRoompasswordNotBetween(String value1, String value2) {
            addCriterion("roomPassword not between", value1, value2, "roompassword");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidIsNull() {
            addCriterion("canDiscoverJID is null");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidIsNotNull() {
            addCriterion("canDiscoverJID is not null");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidEqualTo(Byte value) {
            addCriterion("canDiscoverJID =", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidNotEqualTo(Byte value) {
            addCriterion("canDiscoverJID <>", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidGreaterThan(Byte value) {
            addCriterion("canDiscoverJID >", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidGreaterThanOrEqualTo(Byte value) {
            addCriterion("canDiscoverJID >=", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidLessThan(Byte value) {
            addCriterion("canDiscoverJID <", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidLessThanOrEqualTo(Byte value) {
            addCriterion("canDiscoverJID <=", value, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidIn(List<Byte> values) {
            addCriterion("canDiscoverJID in", values, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidNotIn(List<Byte> values) {
            addCriterion("canDiscoverJID not in", values, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidBetween(Byte value1, Byte value2) {
            addCriterion("canDiscoverJID between", value1, value2, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andCandiscoverjidNotBetween(Byte value1, Byte value2) {
            addCriterion("canDiscoverJID not between", value1, value2, "candiscoverjid");
            return (Criteria) this;
        }

        public Criteria andLogenabledIsNull() {
            addCriterion("logEnabled is null");
            return (Criteria) this;
        }

        public Criteria andLogenabledIsNotNull() {
            addCriterion("logEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andLogenabledEqualTo(Byte value) {
            addCriterion("logEnabled =", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledNotEqualTo(Byte value) {
            addCriterion("logEnabled <>", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledGreaterThan(Byte value) {
            addCriterion("logEnabled >", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("logEnabled >=", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledLessThan(Byte value) {
            addCriterion("logEnabled <", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledLessThanOrEqualTo(Byte value) {
            addCriterion("logEnabled <=", value, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledIn(List<Byte> values) {
            addCriterion("logEnabled in", values, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledNotIn(List<Byte> values) {
            addCriterion("logEnabled not in", values, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledBetween(Byte value1, Byte value2) {
            addCriterion("logEnabled between", value1, value2, "logenabled");
            return (Criteria) this;
        }

        public Criteria andLogenabledNotBetween(Byte value1, Byte value2) {
            addCriterion("logEnabled not between", value1, value2, "logenabled");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastIsNull() {
            addCriterion("rolesToBroadcast is null");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastIsNotNull() {
            addCriterion("rolesToBroadcast is not null");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastEqualTo(Byte value) {
            addCriterion("rolesToBroadcast =", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastNotEqualTo(Byte value) {
            addCriterion("rolesToBroadcast <>", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastGreaterThan(Byte value) {
            addCriterion("rolesToBroadcast >", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastGreaterThanOrEqualTo(Byte value) {
            addCriterion("rolesToBroadcast >=", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastLessThan(Byte value) {
            addCriterion("rolesToBroadcast <", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastLessThanOrEqualTo(Byte value) {
            addCriterion("rolesToBroadcast <=", value, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastIn(List<Byte> values) {
            addCriterion("rolesToBroadcast in", values, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastNotIn(List<Byte> values) {
            addCriterion("rolesToBroadcast not in", values, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastBetween(Byte value1, Byte value2) {
            addCriterion("rolesToBroadcast between", value1, value2, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andRolestobroadcastNotBetween(Byte value1, Byte value2) {
            addCriterion("rolesToBroadcast not between", value1, value2, "rolestobroadcast");
            return (Criteria) this;
        }

        public Criteria andUsereservednickIsNull() {
            addCriterion("useReservedNick is null");
            return (Criteria) this;
        }

        public Criteria andUsereservednickIsNotNull() {
            addCriterion("useReservedNick is not null");
            return (Criteria) this;
        }

        public Criteria andUsereservednickEqualTo(Byte value) {
            addCriterion("useReservedNick =", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickNotEqualTo(Byte value) {
            addCriterion("useReservedNick <>", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickGreaterThan(Byte value) {
            addCriterion("useReservedNick >", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickGreaterThanOrEqualTo(Byte value) {
            addCriterion("useReservedNick >=", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickLessThan(Byte value) {
            addCriterion("useReservedNick <", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickLessThanOrEqualTo(Byte value) {
            addCriterion("useReservedNick <=", value, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickIn(List<Byte> values) {
            addCriterion("useReservedNick in", values, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickNotIn(List<Byte> values) {
            addCriterion("useReservedNick not in", values, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickBetween(Byte value1, Byte value2) {
            addCriterion("useReservedNick between", value1, value2, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andUsereservednickNotBetween(Byte value1, Byte value2) {
            addCriterion("useReservedNick not between", value1, value2, "usereservednick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickIsNull() {
            addCriterion("canChangeNick is null");
            return (Criteria) this;
        }

        public Criteria andCanchangenickIsNotNull() {
            addCriterion("canChangeNick is not null");
            return (Criteria) this;
        }

        public Criteria andCanchangenickEqualTo(Byte value) {
            addCriterion("canChangeNick =", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickNotEqualTo(Byte value) {
            addCriterion("canChangeNick <>", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickGreaterThan(Byte value) {
            addCriterion("canChangeNick >", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickGreaterThanOrEqualTo(Byte value) {
            addCriterion("canChangeNick >=", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickLessThan(Byte value) {
            addCriterion("canChangeNick <", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickLessThanOrEqualTo(Byte value) {
            addCriterion("canChangeNick <=", value, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickIn(List<Byte> values) {
            addCriterion("canChangeNick in", values, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickNotIn(List<Byte> values) {
            addCriterion("canChangeNick not in", values, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickBetween(Byte value1, Byte value2) {
            addCriterion("canChangeNick between", value1, value2, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanchangenickNotBetween(Byte value1, Byte value2) {
            addCriterion("canChangeNick not between", value1, value2, "canchangenick");
            return (Criteria) this;
        }

        public Criteria andCanregisterIsNull() {
            addCriterion("canRegister is null");
            return (Criteria) this;
        }

        public Criteria andCanregisterIsNotNull() {
            addCriterion("canRegister is not null");
            return (Criteria) this;
        }

        public Criteria andCanregisterEqualTo(Byte value) {
            addCriterion("canRegister =", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterNotEqualTo(Byte value) {
            addCriterion("canRegister <>", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterGreaterThan(Byte value) {
            addCriterion("canRegister >", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterGreaterThanOrEqualTo(Byte value) {
            addCriterion("canRegister >=", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterLessThan(Byte value) {
            addCriterion("canRegister <", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterLessThanOrEqualTo(Byte value) {
            addCriterion("canRegister <=", value, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterIn(List<Byte> values) {
            addCriterion("canRegister in", values, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterNotIn(List<Byte> values) {
            addCriterion("canRegister not in", values, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterBetween(Byte value1, Byte value2) {
            addCriterion("canRegister between", value1, value2, "canregister");
            return (Criteria) this;
        }

        public Criteria andCanregisterNotBetween(Byte value1, Byte value2) {
            addCriterion("canRegister not between", value1, value2, "canregister");
            return (Criteria) this;
        }

        public Criteria andAllowpmIsNull() {
            addCriterion("allowpm is null");
            return (Criteria) this;
        }

        public Criteria andAllowpmIsNotNull() {
            addCriterion("allowpm is not null");
            return (Criteria) this;
        }

        public Criteria andAllowpmEqualTo(Byte value) {
            addCriterion("allowpm =", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmNotEqualTo(Byte value) {
            addCriterion("allowpm <>", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmGreaterThan(Byte value) {
            addCriterion("allowpm >", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmGreaterThanOrEqualTo(Byte value) {
            addCriterion("allowpm >=", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmLessThan(Byte value) {
            addCriterion("allowpm <", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmLessThanOrEqualTo(Byte value) {
            addCriterion("allowpm <=", value, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmIn(List<Byte> values) {
            addCriterion("allowpm in", values, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmNotIn(List<Byte> values) {
            addCriterion("allowpm not in", values, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmBetween(Byte value1, Byte value2) {
            addCriterion("allowpm between", value1, value2, "allowpm");
            return (Criteria) this;
        }

        public Criteria andAllowpmNotBetween(Byte value1, Byte value2) {
            addCriterion("allowpm not between", value1, value2, "allowpm");
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