package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MufamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MufamilyExample() {
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

        public Criteria andFamilytypeIsNull() {
            addCriterion("familyType is null");
            return (Criteria) this;
        }

        public Criteria andFamilytypeIsNotNull() {
            addCriterion("familyType is not null");
            return (Criteria) this;
        }

        public Criteria andFamilytypeEqualTo(String value) {
            addCriterion("familyType =", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeNotEqualTo(String value) {
            addCriterion("familyType <>", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeGreaterThan(String value) {
            addCriterion("familyType >", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeGreaterThanOrEqualTo(String value) {
            addCriterion("familyType >=", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeLessThan(String value) {
            addCriterion("familyType <", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeLessThanOrEqualTo(String value) {
            addCriterion("familyType <=", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeLike(String value) {
            addCriterion("familyType like", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeNotLike(String value) {
            addCriterion("familyType not like", value, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeIn(List<String> values) {
            addCriterion("familyType in", values, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeNotIn(List<String> values) {
            addCriterion("familyType not in", values, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeBetween(String value1, String value2) {
            addCriterion("familyType between", value1, value2, "familytype");
            return (Criteria) this;
        }

        public Criteria andFamilytypeNotBetween(String value1, String value2) {
            addCriterion("familyType not between", value1, value2, "familytype");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
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

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andCommunityidIsNull() {
            addCriterion("communityID is null");
            return (Criteria) this;
        }

        public Criteria andCommunityidIsNotNull() {
            addCriterion("communityID is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityidEqualTo(String value) {
            addCriterion("communityID =", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotEqualTo(String value) {
            addCriterion("communityID <>", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidGreaterThan(String value) {
            addCriterion("communityID >", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidGreaterThanOrEqualTo(String value) {
            addCriterion("communityID >=", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLessThan(String value) {
            addCriterion("communityID <", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLessThanOrEqualTo(String value) {
            addCriterion("communityID <=", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLike(String value) {
            addCriterion("communityID like", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotLike(String value) {
            addCriterion("communityID not like", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidIn(List<String> values) {
            addCriterion("communityID in", values, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotIn(List<String> values) {
            addCriterion("communityID not in", values, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidBetween(String value1, String value2) {
            addCriterion("communityID between", value1, value2, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotBetween(String value1, String value2) {
            addCriterion("communityID not between", value1, value2, "communityid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNull() {
            addCriterion("isSpecial is null");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNotNull() {
            addCriterion("isSpecial is not null");
            return (Criteria) this;
        }

        public Criteria andIsspecialEqualTo(Integer value) {
            addCriterion("isSpecial =", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotEqualTo(Integer value) {
            addCriterion("isSpecial <>", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThan(Integer value) {
            addCriterion("isSpecial >", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSpecial >=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThan(Integer value) {
            addCriterion("isSpecial <", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThanOrEqualTo(Integer value) {
            addCriterion("isSpecial <=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialIn(List<Integer> values) {
            addCriterion("isSpecial in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotIn(List<Integer> values) {
            addCriterion("isSpecial not in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialBetween(Integer value1, Integer value2) {
            addCriterion("isSpecial between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotBetween(Integer value1, Integer value2) {
            addCriterion("isSpecial not between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10IsNull() {
            addCriterion("open_only_10 is null");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10IsNotNull() {
            addCriterion("open_only_10 is not null");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10EqualTo(Integer value) {
            addCriterion("open_only_10 =", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10NotEqualTo(Integer value) {
            addCriterion("open_only_10 <>", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10GreaterThan(Integer value) {
            addCriterion("open_only_10 >", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10GreaterThanOrEqualTo(Integer value) {
            addCriterion("open_only_10 >=", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10LessThan(Integer value) {
            addCriterion("open_only_10 <", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10LessThanOrEqualTo(Integer value) {
            addCriterion("open_only_10 <=", value, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10In(List<Integer> values) {
            addCriterion("open_only_10 in", values, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10NotIn(List<Integer> values) {
            addCriterion("open_only_10 not in", values, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10Between(Integer value1, Integer value2) {
            addCriterion("open_only_10 between", value1, value2, "openOnly10");
            return (Criteria) this;
        }

        public Criteria andOpenOnly10NotBetween(Integer value1, Integer value2) {
            addCriterion("open_only_10 not between", value1, value2, "openOnly10");
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