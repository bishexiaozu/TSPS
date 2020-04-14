package com.tsps.content.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GovernmentFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GovernmentFileExample() {
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

        public Criteria andGovFileTypeIsNull() {
            addCriterion("gov_file_type is null");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeIsNotNull() {
            addCriterion("gov_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeEqualTo(String value) {
            addCriterion("gov_file_type =", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeNotEqualTo(String value) {
            addCriterion("gov_file_type <>", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeGreaterThan(String value) {
            addCriterion("gov_file_type >", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gov_file_type >=", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeLessThan(String value) {
            addCriterion("gov_file_type <", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeLessThanOrEqualTo(String value) {
            addCriterion("gov_file_type <=", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeLike(String value) {
            addCriterion("gov_file_type like", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeNotLike(String value) {
            addCriterion("gov_file_type not like", value, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeIn(List<String> values) {
            addCriterion("gov_file_type in", values, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeNotIn(List<String> values) {
            addCriterion("gov_file_type not in", values, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeBetween(String value1, String value2) {
            addCriterion("gov_file_type between", value1, value2, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTypeNotBetween(String value1, String value2) {
            addCriterion("gov_file_type not between", value1, value2, "govFileType");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleIsNull() {
            addCriterion("gov_file_title is null");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleIsNotNull() {
            addCriterion("gov_file_title is not null");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleEqualTo(String value) {
            addCriterion("gov_file_title =", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleNotEqualTo(String value) {
            addCriterion("gov_file_title <>", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleGreaterThan(String value) {
            addCriterion("gov_file_title >", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleGreaterThanOrEqualTo(String value) {
            addCriterion("gov_file_title >=", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleLessThan(String value) {
            addCriterion("gov_file_title <", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleLessThanOrEqualTo(String value) {
            addCriterion("gov_file_title <=", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleLike(String value) {
            addCriterion("gov_file_title like", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleNotLike(String value) {
            addCriterion("gov_file_title not like", value, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleIn(List<String> values) {
            addCriterion("gov_file_title in", values, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleNotIn(List<String> values) {
            addCriterion("gov_file_title not in", values, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleBetween(String value1, String value2) {
            addCriterion("gov_file_title between", value1, value2, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFileTitleNotBetween(String value1, String value2) {
            addCriterion("gov_file_title not between", value1, value2, "govFileTitle");
            return (Criteria) this;
        }

        public Criteria andGovFilePathIsNull() {
            addCriterion("gov_file_path is null");
            return (Criteria) this;
        }

        public Criteria andGovFilePathIsNotNull() {
            addCriterion("gov_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andGovFilePathEqualTo(String value) {
            addCriterion("gov_file_path =", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathNotEqualTo(String value) {
            addCriterion("gov_file_path <>", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathGreaterThan(String value) {
            addCriterion("gov_file_path >", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("gov_file_path >=", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathLessThan(String value) {
            addCriterion("gov_file_path <", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathLessThanOrEqualTo(String value) {
            addCriterion("gov_file_path <=", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathLike(String value) {
            addCriterion("gov_file_path like", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathNotLike(String value) {
            addCriterion("gov_file_path not like", value, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathIn(List<String> values) {
            addCriterion("gov_file_path in", values, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathNotIn(List<String> values) {
            addCriterion("gov_file_path not in", values, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathBetween(String value1, String value2) {
            addCriterion("gov_file_path between", value1, value2, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFilePathNotBetween(String value1, String value2) {
            addCriterion("gov_file_path not between", value1, value2, "govFilePath");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeIsNull() {
            addCriterion("gov_file_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeIsNotNull() {
            addCriterion("gov_file_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeEqualTo(Date value) {
            addCriterion("gov_file_upload_time =", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeNotEqualTo(Date value) {
            addCriterion("gov_file_upload_time <>", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeGreaterThan(Date value) {
            addCriterion("gov_file_upload_time >", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gov_file_upload_time >=", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeLessThan(Date value) {
            addCriterion("gov_file_upload_time <", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("gov_file_upload_time <=", value, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeIn(List<Date> values) {
            addCriterion("gov_file_upload_time in", values, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeNotIn(List<Date> values) {
            addCriterion("gov_file_upload_time not in", values, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeBetween(Date value1, Date value2) {
            addCriterion("gov_file_upload_time between", value1, value2, "govFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andGovFileUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("gov_file_upload_time not between", value1, value2, "govFileUploadTime");
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