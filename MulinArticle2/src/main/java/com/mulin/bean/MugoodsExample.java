package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MugoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MugoodsExample() {
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

        public Criteria andGoodsreleaseidIsNull() {
            addCriterion("goodsReleaseID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidIsNotNull() {
            addCriterion("goodsReleaseID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidEqualTo(Integer value) {
            addCriterion("goodsReleaseID =", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidNotEqualTo(Integer value) {
            addCriterion("goodsReleaseID <>", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidGreaterThan(Integer value) {
            addCriterion("goodsReleaseID >", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsReleaseID >=", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidLessThan(Integer value) {
            addCriterion("goodsReleaseID <", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsReleaseID <=", value, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidIn(List<Integer> values) {
            addCriterion("goodsReleaseID in", values, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidNotIn(List<Integer> values) {
            addCriterion("goodsReleaseID not in", values, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidBetween(Integer value1, Integer value2) {
            addCriterion("goodsReleaseID between", value1, value2, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsreleaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsReleaseID not between", value1, value2, "goodsreleaseid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsID not between", value1, value2, "goodsid");
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

        public Criteria andFamilynameIsNull() {
            addCriterion("familyName is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNotNull() {
            addCriterion("familyName is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameEqualTo(String value) {
            addCriterion("familyName =", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotEqualTo(String value) {
            addCriterion("familyName <>", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThan(String value) {
            addCriterion("familyName >", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThanOrEqualTo(String value) {
            addCriterion("familyName >=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThan(String value) {
            addCriterion("familyName <", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThanOrEqualTo(String value) {
            addCriterion("familyName <=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLike(String value) {
            addCriterion("familyName like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotLike(String value) {
            addCriterion("familyName not like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameIn(List<String> values) {
            addCriterion("familyName in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotIn(List<String> values) {
            addCriterion("familyName not in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameBetween(String value1, String value2) {
            addCriterion("familyName between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotBetween(String value1, String value2) {
            addCriterion("familyName not between", value1, value2, "familyname");
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("salesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("salesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(String value) {
            addCriterion("salesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(String value) {
            addCriterion("salesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(String value) {
            addCriterion("salesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(String value) {
            addCriterion("salesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(String value) {
            addCriterion("salesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(String value) {
            addCriterion("salesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLike(String value) {
            addCriterion("salesPrice like", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotLike(String value) {
            addCriterion("salesPrice not like", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<String> values) {
            addCriterion("salesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<String> values) {
            addCriterion("salesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(String value1, String value2) {
            addCriterion("salesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(String value1, String value2) {
            addCriterion("salesPrice not between", value1, value2, "salesprice");
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

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("isTop not between", value1, value2, "istop");
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