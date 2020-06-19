package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodidIsNull() {
            addCriterion("goodID is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodID =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodID <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodID >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodID >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodID <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodID <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodID in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodID not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodID between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodID not between", value1, value2, "goodid");
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

        public Criteria andGoodnameIsNull() {
            addCriterion("goodName is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodName =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodName <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodName >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodName >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodName <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodName <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodName like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodName not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodName in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodName not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodName between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodName not between", value1, value2, "goodname");
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
            addCriterion("salesprice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("salesprice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(String value) {
            addCriterion("salesprice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(String value) {
            addCriterion("salesprice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(String value) {
            addCriterion("salesprice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(String value) {
            addCriterion("salesprice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(String value) {
            addCriterion("salesprice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(String value) {
            addCriterion("salesprice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLike(String value) {
            addCriterion("salesprice like", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotLike(String value) {
            addCriterion("salesprice not like", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<String> values) {
            addCriterion("salesprice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<String> values) {
            addCriterion("salesprice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(String value1, String value2) {
            addCriterion("salesprice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(String value1, String value2) {
            addCriterion("salesprice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andGoodnumberIsNull() {
            addCriterion("goodnumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumberIsNotNull() {
            addCriterion("goodnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumberEqualTo(String value) {
            addCriterion("goodnumber =", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberNotEqualTo(String value) {
            addCriterion("goodnumber <>", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberGreaterThan(String value) {
            addCriterion("goodnumber >", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberGreaterThanOrEqualTo(String value) {
            addCriterion("goodnumber >=", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberLessThan(String value) {
            addCriterion("goodnumber <", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberLessThanOrEqualTo(String value) {
            addCriterion("goodnumber <=", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberLike(String value) {
            addCriterion("goodnumber like", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberNotLike(String value) {
            addCriterion("goodnumber not like", value, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberIn(List<String> values) {
            addCriterion("goodnumber in", values, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberNotIn(List<String> values) {
            addCriterion("goodnumber not in", values, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberBetween(String value1, String value2) {
            addCriterion("goodnumber between", value1, value2, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andGoodnumberNotBetween(String value1, String value2) {
            addCriterion("goodnumber not between", value1, value2, "goodnumber");
            return (Criteria) this;
        }

        public Criteria andCoupon1IsNull() {
            addCriterion("coupon1 is null");
            return (Criteria) this;
        }

        public Criteria andCoupon1IsNotNull() {
            addCriterion("coupon1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon1EqualTo(String value) {
            addCriterion("coupon1 =", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1NotEqualTo(String value) {
            addCriterion("coupon1 <>", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1GreaterThan(String value) {
            addCriterion("coupon1 >", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1GreaterThanOrEqualTo(String value) {
            addCriterion("coupon1 >=", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1LessThan(String value) {
            addCriterion("coupon1 <", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1LessThanOrEqualTo(String value) {
            addCriterion("coupon1 <=", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1Like(String value) {
            addCriterion("coupon1 like", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1NotLike(String value) {
            addCriterion("coupon1 not like", value, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1In(List<String> values) {
            addCriterion("coupon1 in", values, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1NotIn(List<String> values) {
            addCriterion("coupon1 not in", values, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1Between(String value1, String value2) {
            addCriterion("coupon1 between", value1, value2, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCoupon1NotBetween(String value1, String value2) {
            addCriterion("coupon1 not between", value1, value2, "coupon1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1IsNull() {
            addCriterion("couponrule1 is null");
            return (Criteria) this;
        }

        public Criteria andCouponrule1IsNotNull() {
            addCriterion("couponrule1 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponrule1EqualTo(String value) {
            addCriterion("couponrule1 =", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1NotEqualTo(String value) {
            addCriterion("couponrule1 <>", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1GreaterThan(String value) {
            addCriterion("couponrule1 >", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1GreaterThanOrEqualTo(String value) {
            addCriterion("couponrule1 >=", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1LessThan(String value) {
            addCriterion("couponrule1 <", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1LessThanOrEqualTo(String value) {
            addCriterion("couponrule1 <=", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1Like(String value) {
            addCriterion("couponrule1 like", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1NotLike(String value) {
            addCriterion("couponrule1 not like", value, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1In(List<String> values) {
            addCriterion("couponrule1 in", values, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1NotIn(List<String> values) {
            addCriterion("couponrule1 not in", values, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1Between(String value1, String value2) {
            addCriterion("couponrule1 between", value1, value2, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponrule1NotBetween(String value1, String value2) {
            addCriterion("couponrule1 not between", value1, value2, "couponrule1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1IsNull() {
            addCriterion("couponruleoff1 is null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1IsNotNull() {
            addCriterion("couponruleoff1 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1EqualTo(String value) {
            addCriterion("couponruleoff1 =", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1NotEqualTo(String value) {
            addCriterion("couponruleoff1 <>", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1GreaterThan(String value) {
            addCriterion("couponruleoff1 >", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1GreaterThanOrEqualTo(String value) {
            addCriterion("couponruleoff1 >=", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1LessThan(String value) {
            addCriterion("couponruleoff1 <", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1LessThanOrEqualTo(String value) {
            addCriterion("couponruleoff1 <=", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1Like(String value) {
            addCriterion("couponruleoff1 like", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1NotLike(String value) {
            addCriterion("couponruleoff1 not like", value, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1In(List<String> values) {
            addCriterion("couponruleoff1 in", values, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1NotIn(List<String> values) {
            addCriterion("couponruleoff1 not in", values, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1Between(String value1, String value2) {
            addCriterion("couponruleoff1 between", value1, value2, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff1NotBetween(String value1, String value2) {
            addCriterion("couponruleoff1 not between", value1, value2, "couponruleoff1");
            return (Criteria) this;
        }

        public Criteria andCoupon2IsNull() {
            addCriterion("coupon2 is null");
            return (Criteria) this;
        }

        public Criteria andCoupon2IsNotNull() {
            addCriterion("coupon2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon2EqualTo(String value) {
            addCriterion("coupon2 =", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2NotEqualTo(String value) {
            addCriterion("coupon2 <>", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2GreaterThan(String value) {
            addCriterion("coupon2 >", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2GreaterThanOrEqualTo(String value) {
            addCriterion("coupon2 >=", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2LessThan(String value) {
            addCriterion("coupon2 <", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2LessThanOrEqualTo(String value) {
            addCriterion("coupon2 <=", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2Like(String value) {
            addCriterion("coupon2 like", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2NotLike(String value) {
            addCriterion("coupon2 not like", value, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2In(List<String> values) {
            addCriterion("coupon2 in", values, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2NotIn(List<String> values) {
            addCriterion("coupon2 not in", values, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2Between(String value1, String value2) {
            addCriterion("coupon2 between", value1, value2, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCoupon2NotBetween(String value1, String value2) {
            addCriterion("coupon2 not between", value1, value2, "coupon2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2IsNull() {
            addCriterion("couponrule2 is null");
            return (Criteria) this;
        }

        public Criteria andCouponrule2IsNotNull() {
            addCriterion("couponrule2 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponrule2EqualTo(String value) {
            addCriterion("couponrule2 =", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2NotEqualTo(String value) {
            addCriterion("couponrule2 <>", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2GreaterThan(String value) {
            addCriterion("couponrule2 >", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2GreaterThanOrEqualTo(String value) {
            addCriterion("couponrule2 >=", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2LessThan(String value) {
            addCriterion("couponrule2 <", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2LessThanOrEqualTo(String value) {
            addCriterion("couponrule2 <=", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2Like(String value) {
            addCriterion("couponrule2 like", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2NotLike(String value) {
            addCriterion("couponrule2 not like", value, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2In(List<String> values) {
            addCriterion("couponrule2 in", values, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2NotIn(List<String> values) {
            addCriterion("couponrule2 not in", values, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2Between(String value1, String value2) {
            addCriterion("couponrule2 between", value1, value2, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponrule2NotBetween(String value1, String value2) {
            addCriterion("couponrule2 not between", value1, value2, "couponrule2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2IsNull() {
            addCriterion("couponruleoff2 is null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2IsNotNull() {
            addCriterion("couponruleoff2 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2EqualTo(String value) {
            addCriterion("couponruleoff2 =", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2NotEqualTo(String value) {
            addCriterion("couponruleoff2 <>", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2GreaterThan(String value) {
            addCriterion("couponruleoff2 >", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2GreaterThanOrEqualTo(String value) {
            addCriterion("couponruleoff2 >=", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2LessThan(String value) {
            addCriterion("couponruleoff2 <", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2LessThanOrEqualTo(String value) {
            addCriterion("couponruleoff2 <=", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2Like(String value) {
            addCriterion("couponruleoff2 like", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2NotLike(String value) {
            addCriterion("couponruleoff2 not like", value, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2In(List<String> values) {
            addCriterion("couponruleoff2 in", values, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2NotIn(List<String> values) {
            addCriterion("couponruleoff2 not in", values, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2Between(String value1, String value2) {
            addCriterion("couponruleoff2 between", value1, value2, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff2NotBetween(String value1, String value2) {
            addCriterion("couponruleoff2 not between", value1, value2, "couponruleoff2");
            return (Criteria) this;
        }

        public Criteria andCoupon3IsNull() {
            addCriterion("coupon3 is null");
            return (Criteria) this;
        }

        public Criteria andCoupon3IsNotNull() {
            addCriterion("coupon3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon3EqualTo(String value) {
            addCriterion("coupon3 =", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3NotEqualTo(String value) {
            addCriterion("coupon3 <>", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3GreaterThan(String value) {
            addCriterion("coupon3 >", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3GreaterThanOrEqualTo(String value) {
            addCriterion("coupon3 >=", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3LessThan(String value) {
            addCriterion("coupon3 <", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3LessThanOrEqualTo(String value) {
            addCriterion("coupon3 <=", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3Like(String value) {
            addCriterion("coupon3 like", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3NotLike(String value) {
            addCriterion("coupon3 not like", value, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3In(List<String> values) {
            addCriterion("coupon3 in", values, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3NotIn(List<String> values) {
            addCriterion("coupon3 not in", values, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3Between(String value1, String value2) {
            addCriterion("coupon3 between", value1, value2, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCoupon3NotBetween(String value1, String value2) {
            addCriterion("coupon3 not between", value1, value2, "coupon3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3IsNull() {
            addCriterion("couponrule3 is null");
            return (Criteria) this;
        }

        public Criteria andCouponrule3IsNotNull() {
            addCriterion("couponrule3 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponrule3EqualTo(String value) {
            addCriterion("couponrule3 =", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3NotEqualTo(String value) {
            addCriterion("couponrule3 <>", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3GreaterThan(String value) {
            addCriterion("couponrule3 >", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3GreaterThanOrEqualTo(String value) {
            addCriterion("couponrule3 >=", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3LessThan(String value) {
            addCriterion("couponrule3 <", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3LessThanOrEqualTo(String value) {
            addCriterion("couponrule3 <=", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3Like(String value) {
            addCriterion("couponrule3 like", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3NotLike(String value) {
            addCriterion("couponrule3 not like", value, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3In(List<String> values) {
            addCriterion("couponrule3 in", values, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3NotIn(List<String> values) {
            addCriterion("couponrule3 not in", values, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3Between(String value1, String value2) {
            addCriterion("couponrule3 between", value1, value2, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponrule3NotBetween(String value1, String value2) {
            addCriterion("couponrule3 not between", value1, value2, "couponrule3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3IsNull() {
            addCriterion("couponruleoff3 is null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3IsNotNull() {
            addCriterion("couponruleoff3 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3EqualTo(String value) {
            addCriterion("couponruleoff3 =", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3NotEqualTo(String value) {
            addCriterion("couponruleoff3 <>", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3GreaterThan(String value) {
            addCriterion("couponruleoff3 >", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3GreaterThanOrEqualTo(String value) {
            addCriterion("couponruleoff3 >=", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3LessThan(String value) {
            addCriterion("couponruleoff3 <", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3LessThanOrEqualTo(String value) {
            addCriterion("couponruleoff3 <=", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3Like(String value) {
            addCriterion("couponruleoff3 like", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3NotLike(String value) {
            addCriterion("couponruleoff3 not like", value, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3In(List<String> values) {
            addCriterion("couponruleoff3 in", values, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3NotIn(List<String> values) {
            addCriterion("couponruleoff3 not in", values, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3Between(String value1, String value2) {
            addCriterion("couponruleoff3 between", value1, value2, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff3NotBetween(String value1, String value2) {
            addCriterion("couponruleoff3 not between", value1, value2, "couponruleoff3");
            return (Criteria) this;
        }

        public Criteria andCoupon4IsNull() {
            addCriterion("coupon4 is null");
            return (Criteria) this;
        }

        public Criteria andCoupon4IsNotNull() {
            addCriterion("coupon4 is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon4EqualTo(String value) {
            addCriterion("coupon4 =", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4NotEqualTo(String value) {
            addCriterion("coupon4 <>", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4GreaterThan(String value) {
            addCriterion("coupon4 >", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4GreaterThanOrEqualTo(String value) {
            addCriterion("coupon4 >=", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4LessThan(String value) {
            addCriterion("coupon4 <", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4LessThanOrEqualTo(String value) {
            addCriterion("coupon4 <=", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4Like(String value) {
            addCriterion("coupon4 like", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4NotLike(String value) {
            addCriterion("coupon4 not like", value, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4In(List<String> values) {
            addCriterion("coupon4 in", values, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4NotIn(List<String> values) {
            addCriterion("coupon4 not in", values, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4Between(String value1, String value2) {
            addCriterion("coupon4 between", value1, value2, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCoupon4NotBetween(String value1, String value2) {
            addCriterion("coupon4 not between", value1, value2, "coupon4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4IsNull() {
            addCriterion("couponrule4 is null");
            return (Criteria) this;
        }

        public Criteria andCouponrule4IsNotNull() {
            addCriterion("couponrule4 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponrule4EqualTo(String value) {
            addCriterion("couponrule4 =", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4NotEqualTo(String value) {
            addCriterion("couponrule4 <>", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4GreaterThan(String value) {
            addCriterion("couponrule4 >", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4GreaterThanOrEqualTo(String value) {
            addCriterion("couponrule4 >=", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4LessThan(String value) {
            addCriterion("couponrule4 <", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4LessThanOrEqualTo(String value) {
            addCriterion("couponrule4 <=", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4Like(String value) {
            addCriterion("couponrule4 like", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4NotLike(String value) {
            addCriterion("couponrule4 not like", value, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4In(List<String> values) {
            addCriterion("couponrule4 in", values, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4NotIn(List<String> values) {
            addCriterion("couponrule4 not in", values, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4Between(String value1, String value2) {
            addCriterion("couponrule4 between", value1, value2, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponrule4NotBetween(String value1, String value2) {
            addCriterion("couponrule4 not between", value1, value2, "couponrule4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4IsNull() {
            addCriterion("couponruleoff4 is null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4IsNotNull() {
            addCriterion("couponruleoff4 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4EqualTo(String value) {
            addCriterion("couponruleoff4 =", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4NotEqualTo(String value) {
            addCriterion("couponruleoff4 <>", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4GreaterThan(String value) {
            addCriterion("couponruleoff4 >", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4GreaterThanOrEqualTo(String value) {
            addCriterion("couponruleoff4 >=", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4LessThan(String value) {
            addCriterion("couponruleoff4 <", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4LessThanOrEqualTo(String value) {
            addCriterion("couponruleoff4 <=", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4Like(String value) {
            addCriterion("couponruleoff4 like", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4NotLike(String value) {
            addCriterion("couponruleoff4 not like", value, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4In(List<String> values) {
            addCriterion("couponruleoff4 in", values, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4NotIn(List<String> values) {
            addCriterion("couponruleoff4 not in", values, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4Between(String value1, String value2) {
            addCriterion("couponruleoff4 between", value1, value2, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff4NotBetween(String value1, String value2) {
            addCriterion("couponruleoff4 not between", value1, value2, "couponruleoff4");
            return (Criteria) this;
        }

        public Criteria andCoupon5IsNull() {
            addCriterion("coupon5 is null");
            return (Criteria) this;
        }

        public Criteria andCoupon5IsNotNull() {
            addCriterion("coupon5 is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon5EqualTo(String value) {
            addCriterion("coupon5 =", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5NotEqualTo(String value) {
            addCriterion("coupon5 <>", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5GreaterThan(String value) {
            addCriterion("coupon5 >", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5GreaterThanOrEqualTo(String value) {
            addCriterion("coupon5 >=", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5LessThan(String value) {
            addCriterion("coupon5 <", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5LessThanOrEqualTo(String value) {
            addCriterion("coupon5 <=", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5Like(String value) {
            addCriterion("coupon5 like", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5NotLike(String value) {
            addCriterion("coupon5 not like", value, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5In(List<String> values) {
            addCriterion("coupon5 in", values, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5NotIn(List<String> values) {
            addCriterion("coupon5 not in", values, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5Between(String value1, String value2) {
            addCriterion("coupon5 between", value1, value2, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCoupon5NotBetween(String value1, String value2) {
            addCriterion("coupon5 not between", value1, value2, "coupon5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5IsNull() {
            addCriterion("couponrule5 is null");
            return (Criteria) this;
        }

        public Criteria andCouponrule5IsNotNull() {
            addCriterion("couponrule5 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponrule5EqualTo(String value) {
            addCriterion("couponrule5 =", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5NotEqualTo(String value) {
            addCriterion("couponrule5 <>", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5GreaterThan(String value) {
            addCriterion("couponrule5 >", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5GreaterThanOrEqualTo(String value) {
            addCriterion("couponrule5 >=", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5LessThan(String value) {
            addCriterion("couponrule5 <", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5LessThanOrEqualTo(String value) {
            addCriterion("couponrule5 <=", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5Like(String value) {
            addCriterion("couponrule5 like", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5NotLike(String value) {
            addCriterion("couponrule5 not like", value, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5In(List<String> values) {
            addCriterion("couponrule5 in", values, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5NotIn(List<String> values) {
            addCriterion("couponrule5 not in", values, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5Between(String value1, String value2) {
            addCriterion("couponrule5 between", value1, value2, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponrule5NotBetween(String value1, String value2) {
            addCriterion("couponrule5 not between", value1, value2, "couponrule5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5IsNull() {
            addCriterion("couponruleoff5 is null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5IsNotNull() {
            addCriterion("couponruleoff5 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5EqualTo(String value) {
            addCriterion("couponruleoff5 =", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5NotEqualTo(String value) {
            addCriterion("couponruleoff5 <>", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5GreaterThan(String value) {
            addCriterion("couponruleoff5 >", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5GreaterThanOrEqualTo(String value) {
            addCriterion("couponruleoff5 >=", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5LessThan(String value) {
            addCriterion("couponruleoff5 <", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5LessThanOrEqualTo(String value) {
            addCriterion("couponruleoff5 <=", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5Like(String value) {
            addCriterion("couponruleoff5 like", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5NotLike(String value) {
            addCriterion("couponruleoff5 not like", value, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5In(List<String> values) {
            addCriterion("couponruleoff5 in", values, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5NotIn(List<String> values) {
            addCriterion("couponruleoff5 not in", values, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5Between(String value1, String value2) {
            addCriterion("couponruleoff5 between", value1, value2, "couponruleoff5");
            return (Criteria) this;
        }

        public Criteria andCouponruleoff5NotBetween(String value1, String value2) {
            addCriterion("couponruleoff5 not between", value1, value2, "couponruleoff5");
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