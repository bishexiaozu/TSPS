package com.tsps.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class DriverInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverInformationExample() {
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

        public Criteria andDriverAccountIsNull() {
            addCriterion("driver_account is null");
            return (Criteria) this;
        }

        public Criteria andDriverAccountIsNotNull() {
            addCriterion("driver_account is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAccountEqualTo(String value) {
            addCriterion("driver_account =", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountNotEqualTo(String value) {
            addCriterion("driver_account <>", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountGreaterThan(String value) {
            addCriterion("driver_account >", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountGreaterThanOrEqualTo(String value) {
            addCriterion("driver_account >=", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountLessThan(String value) {
            addCriterion("driver_account <", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountLessThanOrEqualTo(String value) {
            addCriterion("driver_account <=", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountLike(String value) {
            addCriterion("driver_account like", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountNotLike(String value) {
            addCriterion("driver_account not like", value, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountIn(List<String> values) {
            addCriterion("driver_account in", values, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountNotIn(List<String> values) {
            addCriterion("driver_account not in", values, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountBetween(String value1, String value2) {
            addCriterion("driver_account between", value1, value2, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverAccountNotBetween(String value1, String value2) {
            addCriterion("driver_account not between", value1, value2, "driverAccount");
            return (Criteria) this;
        }

        public Criteria andDriverPwdIsNull() {
            addCriterion("driver_pwd is null");
            return (Criteria) this;
        }

        public Criteria andDriverPwdIsNotNull() {
            addCriterion("driver_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPwdEqualTo(String value) {
            addCriterion("driver_pwd =", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdNotEqualTo(String value) {
            addCriterion("driver_pwd <>", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdGreaterThan(String value) {
            addCriterion("driver_pwd >", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_pwd >=", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdLessThan(String value) {
            addCriterion("driver_pwd <", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdLessThanOrEqualTo(String value) {
            addCriterion("driver_pwd <=", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdLike(String value) {
            addCriterion("driver_pwd like", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdNotLike(String value) {
            addCriterion("driver_pwd not like", value, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdIn(List<String> values) {
            addCriterion("driver_pwd in", values, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdNotIn(List<String> values) {
            addCriterion("driver_pwd not in", values, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdBetween(String value1, String value2) {
            addCriterion("driver_pwd between", value1, value2, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverPwdNotBetween(String value1, String value2) {
            addCriterion("driver_pwd not between", value1, value2, "driverPwd");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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