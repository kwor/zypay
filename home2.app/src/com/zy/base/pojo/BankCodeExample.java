package com.zy.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankCodeExample() {
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

        public Criteria andBkCodeIsNull() {
            addCriterion("bk_code is null");
            return (Criteria) this;
        }

        public Criteria andBkCodeIsNotNull() {
            addCriterion("bk_code is not null");
            return (Criteria) this;
        }

        public Criteria andBkCodeEqualTo(String value) {
            addCriterion("bk_code =", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeNotEqualTo(String value) {
            addCriterion("bk_code <>", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeGreaterThan(String value) {
            addCriterion("bk_code >", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bk_code >=", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeLessThan(String value) {
            addCriterion("bk_code <", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeLessThanOrEqualTo(String value) {
            addCriterion("bk_code <=", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeLike(String value) {
            addCriterion("bk_code like", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeNotLike(String value) {
            addCriterion("bk_code not like", value, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeIn(List<String> values) {
            addCriterion("bk_code in", values, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeNotIn(List<String> values) {
            addCriterion("bk_code not in", values, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeBetween(String value1, String value2) {
            addCriterion("bk_code between", value1, value2, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkCodeNotBetween(String value1, String value2) {
            addCriterion("bk_code not between", value1, value2, "bkCode");
            return (Criteria) this;
        }

        public Criteria andBkNameIsNull() {
            addCriterion("bk_name is null");
            return (Criteria) this;
        }

        public Criteria andBkNameIsNotNull() {
            addCriterion("bk_name is not null");
            return (Criteria) this;
        }

        public Criteria andBkNameEqualTo(String value) {
            addCriterion("bk_name =", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameNotEqualTo(String value) {
            addCriterion("bk_name <>", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameGreaterThan(String value) {
            addCriterion("bk_name >", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameGreaterThanOrEqualTo(String value) {
            addCriterion("bk_name >=", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameLessThan(String value) {
            addCriterion("bk_name <", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameLessThanOrEqualTo(String value) {
            addCriterion("bk_name <=", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameLike(String value) {
            addCriterion("bk_name like", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameNotLike(String value) {
            addCriterion("bk_name not like", value, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameIn(List<String> values) {
            addCriterion("bk_name in", values, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameNotIn(List<String> values) {
            addCriterion("bk_name not in", values, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameBetween(String value1, String value2) {
            addCriterion("bk_name between", value1, value2, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkNameNotBetween(String value1, String value2) {
            addCriterion("bk_name not between", value1, value2, "bkName");
            return (Criteria) this;
        }

        public Criteria andBkStatusIsNull() {
            addCriterion("bk_status is null");
            return (Criteria) this;
        }

        public Criteria andBkStatusIsNotNull() {
            addCriterion("bk_status is not null");
            return (Criteria) this;
        }

        public Criteria andBkStatusEqualTo(Byte value) {
            addCriterion("bk_status =", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusNotEqualTo(Byte value) {
            addCriterion("bk_status <>", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusGreaterThan(Byte value) {
            addCriterion("bk_status >", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bk_status >=", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusLessThan(Byte value) {
            addCriterion("bk_status <", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusLessThanOrEqualTo(Byte value) {
            addCriterion("bk_status <=", value, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusIn(List<Byte> values) {
            addCriterion("bk_status in", values, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusNotIn(List<Byte> values) {
            addCriterion("bk_status not in", values, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusBetween(Byte value1, Byte value2) {
            addCriterion("bk_status between", value1, value2, "bkStatus");
            return (Criteria) this;
        }

        public Criteria andBkStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("bk_status not between", value1, value2, "bkStatus");
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