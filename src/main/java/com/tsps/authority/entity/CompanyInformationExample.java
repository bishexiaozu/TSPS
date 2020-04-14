package com.tsps.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInformationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCompanyAccountIsNull() {
            addCriterion("company_account is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountIsNotNull() {
            addCriterion("company_account is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountEqualTo(String value) {
            addCriterion("company_account =", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNotEqualTo(String value) {
            addCriterion("company_account <>", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountGreaterThan(String value) {
            addCriterion("company_account >", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountGreaterThanOrEqualTo(String value) {
            addCriterion("company_account >=", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountLessThan(String value) {
            addCriterion("company_account <", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountLessThanOrEqualTo(String value) {
            addCriterion("company_account <=", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountLike(String value) {
            addCriterion("company_account like", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNotLike(String value) {
            addCriterion("company_account not like", value, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountIn(List<String> values) {
            addCriterion("company_account in", values, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNotIn(List<String> values) {
            addCriterion("company_account not in", values, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountBetween(String value1, String value2) {
            addCriterion("company_account between", value1, value2, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNotBetween(String value1, String value2) {
            addCriterion("company_account not between", value1, value2, "companyAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdIsNull() {
            addCriterion("company_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdIsNotNull() {
            addCriterion("company_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdEqualTo(String value) {
            addCriterion("company_pwd =", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdNotEqualTo(String value) {
            addCriterion("company_pwd <>", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdGreaterThan(String value) {
            addCriterion("company_pwd >", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdGreaterThanOrEqualTo(String value) {
            addCriterion("company_pwd >=", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdLessThan(String value) {
            addCriterion("company_pwd <", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdLessThanOrEqualTo(String value) {
            addCriterion("company_pwd <=", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdLike(String value) {
            addCriterion("company_pwd like", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdNotLike(String value) {
            addCriterion("company_pwd not like", value, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdIn(List<String> values) {
            addCriterion("company_pwd in", values, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdNotIn(List<String> values) {
            addCriterion("company_pwd not in", values, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdBetween(String value1, String value2) {
            addCriterion("company_pwd between", value1, value2, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyPwdNotBetween(String value1, String value2) {
            addCriterion("company_pwd not between", value1, value2, "companyPwd");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIsNull() {
            addCriterion("company_full_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIsNotNull() {
            addCriterion("company_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameEqualTo(String value) {
            addCriterion("company_full_name =", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotEqualTo(String value) {
            addCriterion("company_full_name <>", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameGreaterThan(String value) {
            addCriterion("company_full_name >", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_full_name >=", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLessThan(String value) {
            addCriterion("company_full_name <", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLessThanOrEqualTo(String value) {
            addCriterion("company_full_name <=", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLike(String value) {
            addCriterion("company_full_name like", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotLike(String value) {
            addCriterion("company_full_name not like", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIn(List<String> values) {
            addCriterion("company_full_name in", values, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotIn(List<String> values) {
            addCriterion("company_full_name not in", values, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameBetween(String value1, String value2) {
            addCriterion("company_full_name between", value1, value2, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotBetween(String value1, String value2) {
            addCriterion("company_full_name not between", value1, value2, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIsNull() {
            addCriterion("company_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIsNotNull() {
            addCriterion("company_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationEqualTo(String value) {
            addCriterion("company_abbreviation =", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("company_abbreviation <>", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationGreaterThan(String value) {
            addCriterion("company_abbreviation >", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("company_abbreviation >=", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLessThan(String value) {
            addCriterion("company_abbreviation <", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("company_abbreviation <=", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLike(String value) {
            addCriterion("company_abbreviation like", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotLike(String value) {
            addCriterion("company_abbreviation not like", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIn(List<String> values) {
            addCriterion("company_abbreviation in", values, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("company_abbreviation not in", values, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("company_abbreviation between", value1, value2, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("company_abbreviation not between", value1, value2, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyIsNull() {
            addCriterion("company_parent_body is null");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyIsNotNull() {
            addCriterion("company_parent_body is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyEqualTo(String value) {
            addCriterion("company_parent_body =", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyNotEqualTo(String value) {
            addCriterion("company_parent_body <>", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyGreaterThan(String value) {
            addCriterion("company_parent_body >", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyGreaterThanOrEqualTo(String value) {
            addCriterion("company_parent_body >=", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyLessThan(String value) {
            addCriterion("company_parent_body <", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyLessThanOrEqualTo(String value) {
            addCriterion("company_parent_body <=", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyLike(String value) {
            addCriterion("company_parent_body like", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyNotLike(String value) {
            addCriterion("company_parent_body not like", value, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyIn(List<String> values) {
            addCriterion("company_parent_body in", values, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyNotIn(List<String> values) {
            addCriterion("company_parent_body not in", values, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyBetween(String value1, String value2) {
            addCriterion("company_parent_body between", value1, value2, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyParentBodyNotBetween(String value1, String value2) {
            addCriterion("company_parent_body not between", value1, value2, "companyParentBody");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonIsNull() {
            addCriterion("company_contact_person is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonIsNotNull() {
            addCriterion("company_contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonEqualTo(String value) {
            addCriterion("company_contact_person =", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonNotEqualTo(String value) {
            addCriterion("company_contact_person <>", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonGreaterThan(String value) {
            addCriterion("company_contact_person >", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_person >=", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonLessThan(String value) {
            addCriterion("company_contact_person <", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonLessThanOrEqualTo(String value) {
            addCriterion("company_contact_person <=", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonLike(String value) {
            addCriterion("company_contact_person like", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonNotLike(String value) {
            addCriterion("company_contact_person not like", value, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonIn(List<String> values) {
            addCriterion("company_contact_person in", values, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonNotIn(List<String> values) {
            addCriterion("company_contact_person not in", values, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonBetween(String value1, String value2) {
            addCriterion("company_contact_person between", value1, value2, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactPersonNotBetween(String value1, String value2) {
            addCriterion("company_contact_person not between", value1, value2, "companyContactPerson");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIsNull() {
            addCriterion("company_contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIsNotNull() {
            addCriterion("company_contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelEqualTo(String value) {
            addCriterion("company_contact_tel =", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotEqualTo(String value) {
            addCriterion("company_contact_tel <>", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelGreaterThan(String value) {
            addCriterion("company_contact_tel >", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_tel >=", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLessThan(String value) {
            addCriterion("company_contact_tel <", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLessThanOrEqualTo(String value) {
            addCriterion("company_contact_tel <=", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLike(String value) {
            addCriterion("company_contact_tel like", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotLike(String value) {
            addCriterion("company_contact_tel not like", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIn(List<String> values) {
            addCriterion("company_contact_tel in", values, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotIn(List<String> values) {
            addCriterion("company_contact_tel not in", values, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelBetween(String value1, String value2) {
            addCriterion("company_contact_tel between", value1, value2, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotBetween(String value1, String value2) {
            addCriterion("company_contact_tel not between", value1, value2, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobIsNull() {
            addCriterion("company_contact_mob is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobIsNotNull() {
            addCriterion("company_contact_mob is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobEqualTo(String value) {
            addCriterion("company_contact_mob =", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobNotEqualTo(String value) {
            addCriterion("company_contact_mob <>", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobGreaterThan(String value) {
            addCriterion("company_contact_mob >", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_mob >=", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobLessThan(String value) {
            addCriterion("company_contact_mob <", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobLessThanOrEqualTo(String value) {
            addCriterion("company_contact_mob <=", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobLike(String value) {
            addCriterion("company_contact_mob like", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobNotLike(String value) {
            addCriterion("company_contact_mob not like", value, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobIn(List<String> values) {
            addCriterion("company_contact_mob in", values, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobNotIn(List<String> values) {
            addCriterion("company_contact_mob not in", values, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobBetween(String value1, String value2) {
            addCriterion("company_contact_mob between", value1, value2, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactMobNotBetween(String value1, String value2) {
            addCriterion("company_contact_mob not between", value1, value2, "companyContactMob");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberIsNull() {
            addCriterion("company_contact_identity_number is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberIsNotNull() {
            addCriterion("company_contact_identity_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberEqualTo(String value) {
            addCriterion("company_contact_identity_number =", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberNotEqualTo(String value) {
            addCriterion("company_contact_identity_number <>", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberGreaterThan(String value) {
            addCriterion("company_contact_identity_number >", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_number >=", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberLessThan(String value) {
            addCriterion("company_contact_identity_number <", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_number <=", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberLike(String value) {
            addCriterion("company_contact_identity_number like", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberNotLike(String value) {
            addCriterion("company_contact_identity_number not like", value, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberIn(List<String> values) {
            addCriterion("company_contact_identity_number in", values, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberNotIn(List<String> values) {
            addCriterion("company_contact_identity_number not in", values, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberBetween(String value1, String value2) {
            addCriterion("company_contact_identity_number between", value1, value2, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("company_contact_identity_number not between", value1, value2, "companyContactIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathIsNull() {
            addCriterion("company_contact_identity_photo_back_path is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathIsNotNull() {
            addCriterion("company_contact_identity_photo_back_path is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathEqualTo(String value) {
            addCriterion("company_contact_identity_photo_back_path =", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathNotEqualTo(String value) {
            addCriterion("company_contact_identity_photo_back_path <>", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathGreaterThan(String value) {
            addCriterion("company_contact_identity_photo_back_path >", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_photo_back_path >=", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathLessThan(String value) {
            addCriterion("company_contact_identity_photo_back_path <", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathLessThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_photo_back_path <=", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathLike(String value) {
            addCriterion("company_contact_identity_photo_back_path like", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathNotLike(String value) {
            addCriterion("company_contact_identity_photo_back_path not like", value, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathIn(List<String> values) {
            addCriterion("company_contact_identity_photo_back_path in", values, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathNotIn(List<String> values) {
            addCriterion("company_contact_identity_photo_back_path not in", values, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathBetween(String value1, String value2) {
            addCriterion("company_contact_identity_photo_back_path between", value1, value2, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoBackPathNotBetween(String value1, String value2) {
            addCriterion("company_contact_identity_photo_back_path not between", value1, value2, "companyContactIdentityPhotoBackPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathIsNull() {
            addCriterion("company_contact_identity_photo_front_path is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathIsNotNull() {
            addCriterion("company_contact_identity_photo_front_path is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathEqualTo(String value) {
            addCriterion("company_contact_identity_photo_front_path =", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathNotEqualTo(String value) {
            addCriterion("company_contact_identity_photo_front_path <>", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathGreaterThan(String value) {
            addCriterion("company_contact_identity_photo_front_path >", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_photo_front_path >=", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathLessThan(String value) {
            addCriterion("company_contact_identity_photo_front_path <", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathLessThanOrEqualTo(String value) {
            addCriterion("company_contact_identity_photo_front_path <=", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathLike(String value) {
            addCriterion("company_contact_identity_photo_front_path like", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathNotLike(String value) {
            addCriterion("company_contact_identity_photo_front_path not like", value, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathIn(List<String> values) {
            addCriterion("company_contact_identity_photo_front_path in", values, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathNotIn(List<String> values) {
            addCriterion("company_contact_identity_photo_front_path not in", values, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathBetween(String value1, String value2) {
            addCriterion("company_contact_identity_photo_front_path between", value1, value2, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyContactIdentityPhotoFrontPathNotBetween(String value1, String value2) {
            addCriterion("company_contact_identity_photo_front_path not between", value1, value2, "companyContactIdentityPhotoFrontPath");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenIsNull() {
            addCriterion("company_address_shengfen is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenIsNotNull() {
            addCriterion("company_address_shengfen is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenEqualTo(String value) {
            addCriterion("company_address_shengfen =", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenNotEqualTo(String value) {
            addCriterion("company_address_shengfen <>", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenGreaterThan(String value) {
            addCriterion("company_address_shengfen >", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_shengfen >=", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenLessThan(String value) {
            addCriterion("company_address_shengfen <", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenLessThanOrEqualTo(String value) {
            addCriterion("company_address_shengfen <=", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenLike(String value) {
            addCriterion("company_address_shengfen like", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenNotLike(String value) {
            addCriterion("company_address_shengfen not like", value, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenIn(List<String> values) {
            addCriterion("company_address_shengfen in", values, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenNotIn(List<String> values) {
            addCriterion("company_address_shengfen not in", values, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenBetween(String value1, String value2) {
            addCriterion("company_address_shengfen between", value1, value2, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShengfenNotBetween(String value1, String value2) {
            addCriterion("company_address_shengfen not between", value1, value2, "companyAddressShengfen");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquIsNull() {
            addCriterion("company_address_shiqu is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquIsNotNull() {
            addCriterion("company_address_shiqu is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquEqualTo(String value) {
            addCriterion("company_address_shiqu =", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquNotEqualTo(String value) {
            addCriterion("company_address_shiqu <>", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquGreaterThan(String value) {
            addCriterion("company_address_shiqu >", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_shiqu >=", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquLessThan(String value) {
            addCriterion("company_address_shiqu <", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquLessThanOrEqualTo(String value) {
            addCriterion("company_address_shiqu <=", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquLike(String value) {
            addCriterion("company_address_shiqu like", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquNotLike(String value) {
            addCriterion("company_address_shiqu not like", value, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquIn(List<String> values) {
            addCriterion("company_address_shiqu in", values, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquNotIn(List<String> values) {
            addCriterion("company_address_shiqu not in", values, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquBetween(String value1, String value2) {
            addCriterion("company_address_shiqu between", value1, value2, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressShiquNotBetween(String value1, String value2) {
            addCriterion("company_address_shiqu not between", value1, value2, "companyAddressShiqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquIsNull() {
            addCriterion("company_address_xianqu is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquIsNotNull() {
            addCriterion("company_address_xianqu is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquEqualTo(String value) {
            addCriterion("company_address_xianqu =", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquNotEqualTo(String value) {
            addCriterion("company_address_xianqu <>", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquGreaterThan(String value) {
            addCriterion("company_address_xianqu >", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_xianqu >=", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquLessThan(String value) {
            addCriterion("company_address_xianqu <", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquLessThanOrEqualTo(String value) {
            addCriterion("company_address_xianqu <=", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquLike(String value) {
            addCriterion("company_address_xianqu like", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquNotLike(String value) {
            addCriterion("company_address_xianqu not like", value, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquIn(List<String> values) {
            addCriterion("company_address_xianqu in", values, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquNotIn(List<String> values) {
            addCriterion("company_address_xianqu not in", values, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquBetween(String value1, String value2) {
            addCriterion("company_address_xianqu between", value1, value2, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressXianquNotBetween(String value1, String value2) {
            addCriterion("company_address_xianqu not between", value1, value2, "companyAddressXianqu");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseIsNull() {
            addCriterion("company_operating_license is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseIsNotNull() {
            addCriterion("company_operating_license is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseEqualTo(String value) {
            addCriterion("company_operating_license =", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseNotEqualTo(String value) {
            addCriterion("company_operating_license <>", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseGreaterThan(String value) {
            addCriterion("company_operating_license >", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("company_operating_license >=", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseLessThan(String value) {
            addCriterion("company_operating_license <", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseLessThanOrEqualTo(String value) {
            addCriterion("company_operating_license <=", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseLike(String value) {
            addCriterion("company_operating_license like", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseNotLike(String value) {
            addCriterion("company_operating_license not like", value, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseIn(List<String> values) {
            addCriterion("company_operating_license in", values, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseNotIn(List<String> values) {
            addCriterion("company_operating_license not in", values, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseBetween(String value1, String value2) {
            addCriterion("company_operating_license between", value1, value2, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseNotBetween(String value1, String value2) {
            addCriterion("company_operating_license not between", value1, value2, "companyOperatingLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityIsNull() {
            addCriterion("company_operating_license_validity is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityIsNotNull() {
            addCriterion("company_operating_license_validity is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityEqualTo(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity =", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity <>", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityGreaterThan(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity >", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity >=", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityLessThan(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity <", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_operating_license_validity <=", value, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityIn(List<Date> values) {
            addCriterionForJDBCDate("company_operating_license_validity in", values, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("company_operating_license_validity not in", values, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_operating_license_validity between", value1, value2, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyOperatingLicenseValidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_operating_license_validity not between", value1, value2, "companyOperatingLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseIsNull() {
            addCriterion("company_business_license is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseIsNotNull() {
            addCriterion("company_business_license is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseEqualTo(String value) {
            addCriterion("company_business_license =", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseNotEqualTo(String value) {
            addCriterion("company_business_license <>", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseGreaterThan(String value) {
            addCriterion("company_business_license >", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("company_business_license >=", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseLessThan(String value) {
            addCriterion("company_business_license <", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("company_business_license <=", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseLike(String value) {
            addCriterion("company_business_license like", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseNotLike(String value) {
            addCriterion("company_business_license not like", value, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseIn(List<String> values) {
            addCriterion("company_business_license in", values, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseNotIn(List<String> values) {
            addCriterion("company_business_license not in", values, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseBetween(String value1, String value2) {
            addCriterion("company_business_license between", value1, value2, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("company_business_license not between", value1, value2, "companyBusinessLicense");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityIsNull() {
            addCriterion("company_business_license_validity is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityIsNotNull() {
            addCriterion("company_business_license_validity is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityEqualTo(Date value) {
            addCriterionForJDBCDate("company_business_license_validity =", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("company_business_license_validity <>", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityGreaterThan(Date value) {
            addCriterionForJDBCDate("company_business_license_validity >", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_business_license_validity >=", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityLessThan(Date value) {
            addCriterionForJDBCDate("company_business_license_validity <", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_business_license_validity <=", value, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityIn(List<Date> values) {
            addCriterionForJDBCDate("company_business_license_validity in", values, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("company_business_license_validity not in", values, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_business_license_validity between", value1, value2, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicenseValidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_business_license_validity not between", value1, value2, "companyBusinessLicenseValidity");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNull() {
            addCriterion("company_nature is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNotNull() {
            addCriterion("company_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureEqualTo(String value) {
            addCriterion("company_nature =", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotEqualTo(String value) {
            addCriterion("company_nature <>", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThan(String value) {
            addCriterion("company_nature >", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThanOrEqualTo(String value) {
            addCriterion("company_nature >=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThan(String value) {
            addCriterion("company_nature <", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThanOrEqualTo(String value) {
            addCriterion("company_nature <=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLike(String value) {
            addCriterion("company_nature like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotLike(String value) {
            addCriterion("company_nature not like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIn(List<String> values) {
            addCriterion("company_nature in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotIn(List<String> values) {
            addCriterion("company_nature not in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureBetween(String value1, String value2) {
            addCriterion("company_nature between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotBetween(String value1, String value2) {
            addCriterion("company_nature not between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNull() {
            addCriterion("company_industry is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNotNull() {
            addCriterion("company_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryEqualTo(String value) {
            addCriterion("company_industry =", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotEqualTo(String value) {
            addCriterion("company_industry <>", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThan(String value) {
            addCriterion("company_industry >", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("company_industry >=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThan(String value) {
            addCriterion("company_industry <", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThanOrEqualTo(String value) {
            addCriterion("company_industry <=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLike(String value) {
            addCriterion("company_industry like", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotLike(String value) {
            addCriterion("company_industry not like", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIn(List<String> values) {
            addCriterion("company_industry in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotIn(List<String> values) {
            addCriterion("company_industry not in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryBetween(String value1, String value2) {
            addCriterion("company_industry between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotBetween(String value1, String value2) {
            addCriterion("company_industry not between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathIsNull() {
            addCriterion("company_signature_path is null");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathIsNotNull() {
            addCriterion("company_signature_path is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathEqualTo(String value) {
            addCriterion("company_signature_path =", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathNotEqualTo(String value) {
            addCriterion("company_signature_path <>", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathGreaterThan(String value) {
            addCriterion("company_signature_path >", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathGreaterThanOrEqualTo(String value) {
            addCriterion("company_signature_path >=", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathLessThan(String value) {
            addCriterion("company_signature_path <", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathLessThanOrEqualTo(String value) {
            addCriterion("company_signature_path <=", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathLike(String value) {
            addCriterion("company_signature_path like", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathNotLike(String value) {
            addCriterion("company_signature_path not like", value, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathIn(List<String> values) {
            addCriterion("company_signature_path in", values, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathNotIn(List<String> values) {
            addCriterion("company_signature_path not in", values, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathBetween(String value1, String value2) {
            addCriterion("company_signature_path between", value1, value2, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanySignaturePathNotBetween(String value1, String value2) {
            addCriterion("company_signature_path not between", value1, value2, "companySignaturePath");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeIsNull() {
            addCriterion("company_creditcode is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeIsNotNull() {
            addCriterion("company_creditcode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeEqualTo(String value) {
            addCriterion("company_creditcode =", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeNotEqualTo(String value) {
            addCriterion("company_creditcode <>", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeGreaterThan(String value) {
            addCriterion("company_creditcode >", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_creditcode >=", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeLessThan(String value) {
            addCriterion("company_creditcode <", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("company_creditcode <=", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeLike(String value) {
            addCriterion("company_creditcode like", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeNotLike(String value) {
            addCriterion("company_creditcode not like", value, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeIn(List<String> values) {
            addCriterion("company_creditcode in", values, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeNotIn(List<String> values) {
            addCriterion("company_creditcode not in", values, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeBetween(String value1, String value2) {
            addCriterion("company_creditcode between", value1, value2, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditcodeNotBetween(String value1, String value2) {
            addCriterion("company_creditcode not between", value1, value2, "companyCreditcode");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathIsNull() {
            addCriterion("company_business_license_photo_path is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathIsNotNull() {
            addCriterion("company_business_license_photo_path is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathEqualTo(String value) {
            addCriterion("company_business_license_photo_path =", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathNotEqualTo(String value) {
            addCriterion("company_business_license_photo_path <>", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathGreaterThan(String value) {
            addCriterion("company_business_license_photo_path >", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathGreaterThanOrEqualTo(String value) {
            addCriterion("company_business_license_photo_path >=", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathLessThan(String value) {
            addCriterion("company_business_license_photo_path <", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathLessThanOrEqualTo(String value) {
            addCriterion("company_business_license_photo_path <=", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathLike(String value) {
            addCriterion("company_business_license_photo_path like", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathNotLike(String value) {
            addCriterion("company_business_license_photo_path not like", value, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathIn(List<String> values) {
            addCriterion("company_business_license_photo_path in", values, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathNotIn(List<String> values) {
            addCriterion("company_business_license_photo_path not in", values, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathBetween(String value1, String value2) {
            addCriterion("company_business_license_photo_path between", value1, value2, "companyBusinessLicensePhotoPath");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLicensePhotoPathNotBetween(String value1, String value2) {
            addCriterion("company_business_license_photo_path not between", value1, value2, "companyBusinessLicensePhotoPath");
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