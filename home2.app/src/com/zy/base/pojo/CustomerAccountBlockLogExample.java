package com.zy.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccountBlockLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerAccountBlockLogExample() {
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

        public Criteria andFromcustomerIsNull() {
            addCriterion("fromcustomer is null");
            return (Criteria) this;
        }

        public Criteria andFromcustomerIsNotNull() {
            addCriterion("fromcustomer is not null");
            return (Criteria) this;
        }

        public Criteria andFromcustomerEqualTo(String value) {
            addCriterion("fromcustomer =", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerNotEqualTo(String value) {
            addCriterion("fromcustomer <>", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerGreaterThan(String value) {
            addCriterion("fromcustomer >", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerGreaterThanOrEqualTo(String value) {
            addCriterion("fromcustomer >=", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerLessThan(String value) {
            addCriterion("fromcustomer <", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerLessThanOrEqualTo(String value) {
            addCriterion("fromcustomer <=", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerLike(String value) {
            addCriterion("fromcustomer like", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerNotLike(String value) {
            addCriterion("fromcustomer not like", value, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerIn(List<String> values) {
            addCriterion("fromcustomer in", values, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerNotIn(List<String> values) {
            addCriterion("fromcustomer not in", values, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerBetween(String value1, String value2) {
            addCriterion("fromcustomer between", value1, value2, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andFromcustomerNotBetween(String value1, String value2) {
            addCriterion("fromcustomer not between", value1, value2, "fromcustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerIsNull() {
            addCriterion("tocustomer is null");
            return (Criteria) this;
        }

        public Criteria andTocustomerIsNotNull() {
            addCriterion("tocustomer is not null");
            return (Criteria) this;
        }

        public Criteria andTocustomerEqualTo(String value) {
            addCriterion("tocustomer =", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerNotEqualTo(String value) {
            addCriterion("tocustomer <>", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerGreaterThan(String value) {
            addCriterion("tocustomer >", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerGreaterThanOrEqualTo(String value) {
            addCriterion("tocustomer >=", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerLessThan(String value) {
            addCriterion("tocustomer <", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerLessThanOrEqualTo(String value) {
            addCriterion("tocustomer <=", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerLike(String value) {
            addCriterion("tocustomer like", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerNotLike(String value) {
            addCriterion("tocustomer not like", value, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerIn(List<String> values) {
            addCriterion("tocustomer in", values, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerNotIn(List<String> values) {
            addCriterion("tocustomer not in", values, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerBetween(String value1, String value2) {
            addCriterion("tocustomer between", value1, value2, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andTocustomerNotBetween(String value1, String value2) {
            addCriterion("tocustomer not between", value1, value2, "tocustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerIsNull() {
            addCriterion("payfromcustomer is null");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerIsNotNull() {
            addCriterion("payfromcustomer is not null");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerEqualTo(Short value) {
            addCriterion("payfromcustomer =", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerNotEqualTo(Short value) {
            addCriterion("payfromcustomer <>", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerGreaterThan(Short value) {
            addCriterion("payfromcustomer >", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerGreaterThanOrEqualTo(Short value) {
            addCriterion("payfromcustomer >=", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerLessThan(Short value) {
            addCriterion("payfromcustomer <", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerLessThanOrEqualTo(Short value) {
            addCriterion("payfromcustomer <=", value, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerIn(List<Short> values) {
            addCriterion("payfromcustomer in", values, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerNotIn(List<Short> values) {
            addCriterion("payfromcustomer not in", values, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerBetween(Short value1, Short value2) {
            addCriterion("payfromcustomer between", value1, value2, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPayfromcustomerNotBetween(Short value1, Short value2) {
            addCriterion("payfromcustomer not between", value1, value2, "payfromcustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerIsNull() {
            addCriterion("paytocustomer is null");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerIsNotNull() {
            addCriterion("paytocustomer is not null");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerEqualTo(Short value) {
            addCriterion("paytocustomer =", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerNotEqualTo(Short value) {
            addCriterion("paytocustomer <>", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerGreaterThan(Short value) {
            addCriterion("paytocustomer >", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerGreaterThanOrEqualTo(Short value) {
            addCriterion("paytocustomer >=", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerLessThan(Short value) {
            addCriterion("paytocustomer <", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerLessThanOrEqualTo(Short value) {
            addCriterion("paytocustomer <=", value, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerIn(List<Short> values) {
            addCriterion("paytocustomer in", values, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerNotIn(List<Short> values) {
            addCriterion("paytocustomer not in", values, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerBetween(Short value1, Short value2) {
            addCriterion("paytocustomer between", value1, value2, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andPaytocustomerNotBetween(Short value1, Short value2) {
            addCriterion("paytocustomer not between", value1, value2, "paytocustomer");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNull() {
            addCriterion("block_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNotNull() {
            addCriterion("block_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockIdEqualTo(Integer value) {
            addCriterion("block_id =", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotEqualTo(Integer value) {
            addCriterion("block_id <>", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThan(Integer value) {
            addCriterion("block_id >", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("block_id >=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThan(Integer value) {
            addCriterion("block_id <", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThanOrEqualTo(Integer value) {
            addCriterion("block_id <=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdIn(List<Integer> values) {
            addCriterion("block_id in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotIn(List<Integer> values) {
            addCriterion("block_id not in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdBetween(Integer value1, Integer value2) {
            addCriterion("block_id between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("block_id not between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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