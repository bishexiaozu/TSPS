package com.tsps.training.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExerciseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExerciseExample() {
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

        public Criteria andExerciseContentIsNull() {
            addCriterion("exercise_content is null");
            return (Criteria) this;
        }

        public Criteria andExerciseContentIsNotNull() {
            addCriterion("exercise_content is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseContentEqualTo(String value) {
            addCriterion("exercise_content =", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentNotEqualTo(String value) {
            addCriterion("exercise_content <>", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentGreaterThan(String value) {
            addCriterion("exercise_content >", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_content >=", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentLessThan(String value) {
            addCriterion("exercise_content <", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentLessThanOrEqualTo(String value) {
            addCriterion("exercise_content <=", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentLike(String value) {
            addCriterion("exercise_content like", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentNotLike(String value) {
            addCriterion("exercise_content not like", value, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentIn(List<String> values) {
            addCriterion("exercise_content in", values, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentNotIn(List<String> values) {
            addCriterion("exercise_content not in", values, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentBetween(String value1, String value2) {
            addCriterion("exercise_content between", value1, value2, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseContentNotBetween(String value1, String value2) {
            addCriterion("exercise_content not between", value1, value2, "exerciseContent");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaIsNull() {
            addCriterion("exercise_optionA is null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaIsNotNull() {
            addCriterion("exercise_optionA is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaEqualTo(String value) {
            addCriterion("exercise_optionA =", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaNotEqualTo(String value) {
            addCriterion("exercise_optionA <>", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaGreaterThan(String value) {
            addCriterion("exercise_optionA >", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_optionA >=", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaLessThan(String value) {
            addCriterion("exercise_optionA <", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaLessThanOrEqualTo(String value) {
            addCriterion("exercise_optionA <=", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaLike(String value) {
            addCriterion("exercise_optionA like", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaNotLike(String value) {
            addCriterion("exercise_optionA not like", value, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaIn(List<String> values) {
            addCriterion("exercise_optionA in", values, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaNotIn(List<String> values) {
            addCriterion("exercise_optionA not in", values, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaBetween(String value1, String value2) {
            addCriterion("exercise_optionA between", value1, value2, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionaNotBetween(String value1, String value2) {
            addCriterion("exercise_optionA not between", value1, value2, "exerciseOptiona");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbIsNull() {
            addCriterion("exercise_optionB is null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbIsNotNull() {
            addCriterion("exercise_optionB is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbEqualTo(String value) {
            addCriterion("exercise_optionB =", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbNotEqualTo(String value) {
            addCriterion("exercise_optionB <>", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbGreaterThan(String value) {
            addCriterion("exercise_optionB >", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_optionB >=", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbLessThan(String value) {
            addCriterion("exercise_optionB <", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbLessThanOrEqualTo(String value) {
            addCriterion("exercise_optionB <=", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbLike(String value) {
            addCriterion("exercise_optionB like", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbNotLike(String value) {
            addCriterion("exercise_optionB not like", value, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbIn(List<String> values) {
            addCriterion("exercise_optionB in", values, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbNotIn(List<String> values) {
            addCriterion("exercise_optionB not in", values, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbBetween(String value1, String value2) {
            addCriterion("exercise_optionB between", value1, value2, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptionbNotBetween(String value1, String value2) {
            addCriterion("exercise_optionB not between", value1, value2, "exerciseOptionb");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncIsNull() {
            addCriterion("exercise_optionC is null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncIsNotNull() {
            addCriterion("exercise_optionC is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncEqualTo(String value) {
            addCriterion("exercise_optionC =", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncNotEqualTo(String value) {
            addCriterion("exercise_optionC <>", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncGreaterThan(String value) {
            addCriterion("exercise_optionC >", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_optionC >=", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncLessThan(String value) {
            addCriterion("exercise_optionC <", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncLessThanOrEqualTo(String value) {
            addCriterion("exercise_optionC <=", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncLike(String value) {
            addCriterion("exercise_optionC like", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncNotLike(String value) {
            addCriterion("exercise_optionC not like", value, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncIn(List<String> values) {
            addCriterion("exercise_optionC in", values, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncNotIn(List<String> values) {
            addCriterion("exercise_optionC not in", values, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncBetween(String value1, String value2) {
            addCriterion("exercise_optionC between", value1, value2, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptioncNotBetween(String value1, String value2) {
            addCriterion("exercise_optionC not between", value1, value2, "exerciseOptionc");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondIsNull() {
            addCriterion("exercise_optionD is null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondIsNotNull() {
            addCriterion("exercise_optionD is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondEqualTo(String value) {
            addCriterion("exercise_optionD =", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondNotEqualTo(String value) {
            addCriterion("exercise_optionD <>", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondGreaterThan(String value) {
            addCriterion("exercise_optionD >", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_optionD >=", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondLessThan(String value) {
            addCriterion("exercise_optionD <", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondLessThanOrEqualTo(String value) {
            addCriterion("exercise_optionD <=", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondLike(String value) {
            addCriterion("exercise_optionD like", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondNotLike(String value) {
            addCriterion("exercise_optionD not like", value, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondIn(List<String> values) {
            addCriterion("exercise_optionD in", values, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondNotIn(List<String> values) {
            addCriterion("exercise_optionD not in", values, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondBetween(String value1, String value2) {
            addCriterion("exercise_optionD between", value1, value2, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseOptiondNotBetween(String value1, String value2) {
            addCriterion("exercise_optionD not between", value1, value2, "exerciseOptiond");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerIsNull() {
            addCriterion("exercise_answer is null");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerIsNotNull() {
            addCriterion("exercise_answer is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerEqualTo(String value) {
            addCriterion("exercise_answer =", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerNotEqualTo(String value) {
            addCriterion("exercise_answer <>", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerGreaterThan(String value) {
            addCriterion("exercise_answer >", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_answer >=", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerLessThan(String value) {
            addCriterion("exercise_answer <", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerLessThanOrEqualTo(String value) {
            addCriterion("exercise_answer <=", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerLike(String value) {
            addCriterion("exercise_answer like", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerNotLike(String value) {
            addCriterion("exercise_answer not like", value, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerIn(List<String> values) {
            addCriterion("exercise_answer in", values, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerNotIn(List<String> values) {
            addCriterion("exercise_answer not in", values, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerBetween(String value1, String value2) {
            addCriterion("exercise_answer between", value1, value2, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseAnswerNotBetween(String value1, String value2) {
            addCriterion("exercise_answer not between", value1, value2, "exerciseAnswer");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainIsNull() {
            addCriterion("exercise_explain is null");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainIsNotNull() {
            addCriterion("exercise_explain is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainEqualTo(String value) {
            addCriterion("exercise_explain =", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainNotEqualTo(String value) {
            addCriterion("exercise_explain <>", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainGreaterThan(String value) {
            addCriterion("exercise_explain >", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_explain >=", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainLessThan(String value) {
            addCriterion("exercise_explain <", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainLessThanOrEqualTo(String value) {
            addCriterion("exercise_explain <=", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainLike(String value) {
            addCriterion("exercise_explain like", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainNotLike(String value) {
            addCriterion("exercise_explain not like", value, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainIn(List<String> values) {
            addCriterion("exercise_explain in", values, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainNotIn(List<String> values) {
            addCriterion("exercise_explain not in", values, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainBetween(String value1, String value2) {
            addCriterion("exercise_explain between", value1, value2, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andExerciseExplainNotBetween(String value1, String value2) {
            addCriterion("exercise_explain not between", value1, value2, "exerciseExplain");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeIsNull() {
            addCriterion("exercise_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeIsNotNull() {
            addCriterion("exercise_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeEqualTo(Date value) {
            addCriterion("exercise_upload_time =", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeNotEqualTo(Date value) {
            addCriterion("exercise_upload_time <>", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeGreaterThan(Date value) {
            addCriterion("exercise_upload_time >", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exercise_upload_time >=", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeLessThan(Date value) {
            addCriterion("exercise_upload_time <", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("exercise_upload_time <=", value, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeIn(List<Date> values) {
            addCriterion("exercise_upload_time in", values, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeNotIn(List<Date> values) {
            addCriterion("exercise_upload_time not in", values, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeBetween(Date value1, Date value2) {
            addCriterion("exercise_upload_time between", value1, value2, "exerciseUploadTime");
            return (Criteria) this;
        }

        public Criteria andExerciseUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("exercise_upload_time not between", value1, value2, "exerciseUploadTime");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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