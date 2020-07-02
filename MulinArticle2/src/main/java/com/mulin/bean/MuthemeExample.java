package com.mulin.bean;

import java.util.ArrayList;
import java.util.List;

public class MuthemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuthemeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andThemedescIsNull() {
            addCriterion("themeDesc is null");
            return (Criteria) this;
        }

        public Criteria andThemedescIsNotNull() {
            addCriterion("themeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andThemedescEqualTo(String value) {
            addCriterion("themeDesc =", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescNotEqualTo(String value) {
            addCriterion("themeDesc <>", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescGreaterThan(String value) {
            addCriterion("themeDesc >", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescGreaterThanOrEqualTo(String value) {
            addCriterion("themeDesc >=", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescLessThan(String value) {
            addCriterion("themeDesc <", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescLessThanOrEqualTo(String value) {
            addCriterion("themeDesc <=", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescLike(String value) {
            addCriterion("themeDesc like", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescNotLike(String value) {
            addCriterion("themeDesc not like", value, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescIn(List<String> values) {
            addCriterion("themeDesc in", values, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescNotIn(List<String> values) {
            addCriterion("themeDesc not in", values, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescBetween(String value1, String value2) {
            addCriterion("themeDesc between", value1, value2, "themedesc");
            return (Criteria) this;
        }

        public Criteria andThemedescNotBetween(String value1, String value2) {
            addCriterion("themeDesc not between", value1, value2, "themedesc");
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