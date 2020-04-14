package com.tsps.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class RegulatorInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegulatorInformationExample() {
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

        public Criteria andRegulatorAccountIsNull() {
            addCriterion("regulator_account is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountIsNotNull() {
            addCriterion("regulator_account is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountEqualTo(String value) {
            addCriterion("regulator_account =", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountNotEqualTo(String value) {
            addCriterion("regulator_account <>", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountGreaterThan(String value) {
            addCriterion("regulator_account >", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_account >=", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountLessThan(String value) {
            addCriterion("regulator_account <", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountLessThanOrEqualTo(String value) {
            addCriterion("regulator_account <=", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountLike(String value) {
            addCriterion("regulator_account like", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountNotLike(String value) {
            addCriterion("regulator_account not like", value, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountIn(List<String> values) {
            addCriterion("regulator_account in", values, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountNotIn(List<String> values) {
            addCriterion("regulator_account not in", values, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountBetween(String value1, String value2) {
            addCriterion("regulator_account between", value1, value2, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorAccountNotBetween(String value1, String value2) {
            addCriterion("regulator_account not between", value1, value2, "regulatorAccount");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdIsNull() {
            addCriterion("regulator_pwd is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdIsNotNull() {
            addCriterion("regulator_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdEqualTo(String value) {
            addCriterion("regulator_pwd =", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdNotEqualTo(String value) {
            addCriterion("regulator_pwd <>", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdGreaterThan(String value) {
            addCriterion("regulator_pwd >", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_pwd >=", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdLessThan(String value) {
            addCriterion("regulator_pwd <", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdLessThanOrEqualTo(String value) {
            addCriterion("regulator_pwd <=", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdLike(String value) {
            addCriterion("regulator_pwd like", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdNotLike(String value) {
            addCriterion("regulator_pwd not like", value, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdIn(List<String> values) {
            addCriterion("regulator_pwd in", values, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdNotIn(List<String> values) {
            addCriterion("regulator_pwd not in", values, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdBetween(String value1, String value2) {
            addCriterion("regulator_pwd between", value1, value2, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRegulatorPwdNotBetween(String value1, String value2) {
            addCriterion("regulator_pwd not between", value1, value2, "regulatorPwd");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameIsNull() {
            addCriterion("ragulator_name is null");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameIsNotNull() {
            addCriterion("ragulator_name is not null");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameEqualTo(String value) {
            addCriterion("ragulator_name =", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameNotEqualTo(String value) {
            addCriterion("ragulator_name <>", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameGreaterThan(String value) {
            addCriterion("ragulator_name >", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("ragulator_name >=", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameLessThan(String value) {
            addCriterion("ragulator_name <", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameLessThanOrEqualTo(String value) {
            addCriterion("ragulator_name <=", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameLike(String value) {
            addCriterion("ragulator_name like", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameNotLike(String value) {
            addCriterion("ragulator_name not like", value, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameIn(List<String> values) {
            addCriterion("ragulator_name in", values, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameNotIn(List<String> values) {
            addCriterion("ragulator_name not in", values, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameBetween(String value1, String value2) {
            addCriterion("ragulator_name between", value1, value2, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRagulatorNameNotBetween(String value1, String value2) {
            addCriterion("ragulator_name not between", value1, value2, "ragulatorName");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelIsNull() {
            addCriterion("regulator_tel is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelIsNotNull() {
            addCriterion("regulator_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelEqualTo(String value) {
            addCriterion("regulator_tel =", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelNotEqualTo(String value) {
            addCriterion("regulator_tel <>", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelGreaterThan(String value) {
            addCriterion("regulator_tel >", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_tel >=", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelLessThan(String value) {
            addCriterion("regulator_tel <", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelLessThanOrEqualTo(String value) {
            addCriterion("regulator_tel <=", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelLike(String value) {
            addCriterion("regulator_tel like", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelNotLike(String value) {
            addCriterion("regulator_tel not like", value, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelIn(List<String> values) {
            addCriterion("regulator_tel in", values, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelNotIn(List<String> values) {
            addCriterion("regulator_tel not in", values, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelBetween(String value1, String value2) {
            addCriterion("regulator_tel between", value1, value2, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorTelNotBetween(String value1, String value2) {
            addCriterion("regulator_tel not between", value1, value2, "regulatorTel");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobIsNull() {
            addCriterion("regulator_mob is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobIsNotNull() {
            addCriterion("regulator_mob is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobEqualTo(String value) {
            addCriterion("regulator_mob =", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobNotEqualTo(String value) {
            addCriterion("regulator_mob <>", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobGreaterThan(String value) {
            addCriterion("regulator_mob >", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_mob >=", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobLessThan(String value) {
            addCriterion("regulator_mob <", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobLessThanOrEqualTo(String value) {
            addCriterion("regulator_mob <=", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobLike(String value) {
            addCriterion("regulator_mob like", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobNotLike(String value) {
            addCriterion("regulator_mob not like", value, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobIn(List<String> values) {
            addCriterion("regulator_mob in", values, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobNotIn(List<String> values) {
            addCriterion("regulator_mob not in", values, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobBetween(String value1, String value2) {
            addCriterion("regulator_mob between", value1, value2, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorMobNotBetween(String value1, String value2) {
            addCriterion("regulator_mob not between", value1, value2, "regulatorMob");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenIsNull() {
            addCriterion("regulator_address_shengfen is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenIsNotNull() {
            addCriterion("regulator_address_shengfen is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenEqualTo(String value) {
            addCriterion("regulator_address_shengfen =", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenNotEqualTo(String value) {
            addCriterion("regulator_address_shengfen <>", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenGreaterThan(String value) {
            addCriterion("regulator_address_shengfen >", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_address_shengfen >=", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenLessThan(String value) {
            addCriterion("regulator_address_shengfen <", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenLessThanOrEqualTo(String value) {
            addCriterion("regulator_address_shengfen <=", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenLike(String value) {
            addCriterion("regulator_address_shengfen like", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenNotLike(String value) {
            addCriterion("regulator_address_shengfen not like", value, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenIn(List<String> values) {
            addCriterion("regulator_address_shengfen in", values, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenNotIn(List<String> values) {
            addCriterion("regulator_address_shengfen not in", values, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenBetween(String value1, String value2) {
            addCriterion("regulator_address_shengfen between", value1, value2, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShengfenNotBetween(String value1, String value2) {
            addCriterion("regulator_address_shengfen not between", value1, value2, "regulatorAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquIsNull() {
            addCriterion("regulator_address_shiqu is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquIsNotNull() {
            addCriterion("regulator_address_shiqu is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquEqualTo(String value) {
            addCriterion("regulator_address_shiqu =", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquNotEqualTo(String value) {
            addCriterion("regulator_address_shiqu <>", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquGreaterThan(String value) {
            addCriterion("regulator_address_shiqu >", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_address_shiqu >=", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquLessThan(String value) {
            addCriterion("regulator_address_shiqu <", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquLessThanOrEqualTo(String value) {
            addCriterion("regulator_address_shiqu <=", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquLike(String value) {
            addCriterion("regulator_address_shiqu like", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquNotLike(String value) {
            addCriterion("regulator_address_shiqu not like", value, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquIn(List<String> values) {
            addCriterion("regulator_address_shiqu in", values, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquNotIn(List<String> values) {
            addCriterion("regulator_address_shiqu not in", values, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquBetween(String value1, String value2) {
            addCriterion("regulator_address_shiqu between", value1, value2, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressShiquNotBetween(String value1, String value2) {
            addCriterion("regulator_address_shiqu not between", value1, value2, "regulatorAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquIsNull() {
            addCriterion("regulator_address_xianqu is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquIsNotNull() {
            addCriterion("regulator_address_xianqu is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquEqualTo(String value) {
            addCriterion("regulator_address_xianqu =", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquNotEqualTo(String value) {
            addCriterion("regulator_address_xianqu <>", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquGreaterThan(String value) {
            addCriterion("regulator_address_xianqu >", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_address_xianqu >=", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquLessThan(String value) {
            addCriterion("regulator_address_xianqu <", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquLessThanOrEqualTo(String value) {
            addCriterion("regulator_address_xianqu <=", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquLike(String value) {
            addCriterion("regulator_address_xianqu like", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquNotLike(String value) {
            addCriterion("regulator_address_xianqu not like", value, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquIn(List<String> values) {
            addCriterion("regulator_address_xianqu in", values, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquNotIn(List<String> values) {
            addCriterion("regulator_address_xianqu not in", values, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquBetween(String value1, String value2) {
            addCriterion("regulator_address_xianqu between", value1, value2, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressXianquNotBetween(String value1, String value2) {
            addCriterion("regulator_address_xianqu not between", value1, value2, "regulatorAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressIsNull() {
            addCriterion("regulator_address is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressIsNotNull() {
            addCriterion("regulator_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressEqualTo(String value) {
            addCriterion("regulator_address =", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressNotEqualTo(String value) {
            addCriterion("regulator_address <>", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressGreaterThan(String value) {
            addCriterion("regulator_address >", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_address >=", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressLessThan(String value) {
            addCriterion("regulator_address <", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressLessThanOrEqualTo(String value) {
            addCriterion("regulator_address <=", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressLike(String value) {
            addCriterion("regulator_address like", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressNotLike(String value) {
            addCriterion("regulator_address not like", value, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressIn(List<String> values) {
            addCriterion("regulator_address in", values, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressNotIn(List<String> values) {
            addCriterion("regulator_address not in", values, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressBetween(String value1, String value2) {
            addCriterion("regulator_address between", value1, value2, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorAddressNotBetween(String value1, String value2) {
            addCriterion("regulator_address not between", value1, value2, "regulatorAddress");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteIsNull() {
            addCriterion("regulator_website is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteIsNotNull() {
            addCriterion("regulator_website is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteEqualTo(String value) {
            addCriterion("regulator_website =", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteNotEqualTo(String value) {
            addCriterion("regulator_website <>", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteGreaterThan(String value) {
            addCriterion("regulator_website >", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_website >=", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteLessThan(String value) {
            addCriterion("regulator_website <", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteLessThanOrEqualTo(String value) {
            addCriterion("regulator_website <=", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteLike(String value) {
            addCriterion("regulator_website like", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteNotLike(String value) {
            addCriterion("regulator_website not like", value, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteIn(List<String> values) {
            addCriterion("regulator_website in", values, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteNotIn(List<String> values) {
            addCriterion("regulator_website not in", values, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteBetween(String value1, String value2) {
            addCriterion("regulator_website between", value1, value2, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorWebsiteNotBetween(String value1, String value2) {
            addCriterion("regulator_website not between", value1, value2, "regulatorWebsite");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailIsNull() {
            addCriterion("regulator_email is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailIsNotNull() {
            addCriterion("regulator_email is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailEqualTo(String value) {
            addCriterion("regulator_email =", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailNotEqualTo(String value) {
            addCriterion("regulator_email <>", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailGreaterThan(String value) {
            addCriterion("regulator_email >", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("regulator_email >=", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailLessThan(String value) {
            addCriterion("regulator_email <", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailLessThanOrEqualTo(String value) {
            addCriterion("regulator_email <=", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailLike(String value) {
            addCriterion("regulator_email like", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailNotLike(String value) {
            addCriterion("regulator_email not like", value, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailIn(List<String> values) {
            addCriterion("regulator_email in", values, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailNotIn(List<String> values) {
            addCriterion("regulator_email not in", values, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailBetween(String value1, String value2) {
            addCriterion("regulator_email between", value1, value2, "regulatorEmail");
            return (Criteria) this;
        }

        public Criteria andRegulatorEmailNotBetween(String value1, String value2) {
            addCriterion("regulator_email not between", value1, value2, "regulatorEmail");
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