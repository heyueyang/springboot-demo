package com.fiprs.springbootdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class THjjczzGdpExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public THjjczzGdpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXzqmcIsNull() {
            addCriterion("XZQMC is null");
            return (Criteria) this;
        }

        public Criteria andXzqmcIsNotNull() {
            addCriterion("XZQMC is not null");
            return (Criteria) this;
        }

        public Criteria andXzqmcEqualTo(String value) {
            addCriterion("XZQMC =", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcNotEqualTo(String value) {
            addCriterion("XZQMC <>", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcGreaterThan(String value) {
            addCriterion("XZQMC >", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcGreaterThanOrEqualTo(String value) {
            addCriterion("XZQMC >=", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcLessThan(String value) {
            addCriterion("XZQMC <", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcLessThanOrEqualTo(String value) {
            addCriterion("XZQMC <=", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcLike(String value) {
            addCriterion("XZQMC like", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcNotLike(String value) {
            addCriterion("XZQMC not like", value, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcIn(List<String> values) {
            addCriterion("XZQMC in", values, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcNotIn(List<String> values) {
            addCriterion("XZQMC not in", values, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcBetween(String value1, String value2) {
            addCriterion("XZQMC between", value1, value2, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqmcNotBetween(String value1, String value2) {
            addCriterion("XZQMC not between", value1, value2, "xzqmc");
            return (Criteria) this;
        }

        public Criteria andXzqdmIsNull() {
            addCriterion("XZQDM is null");
            return (Criteria) this;
        }

        public Criteria andXzqdmIsNotNull() {
            addCriterion("XZQDM is not null");
            return (Criteria) this;
        }

        public Criteria andXzqdmEqualTo(String value) {
            addCriterion("XZQDM =", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmNotEqualTo(String value) {
            addCriterion("XZQDM <>", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmGreaterThan(String value) {
            addCriterion("XZQDM >", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmGreaterThanOrEqualTo(String value) {
            addCriterion("XZQDM >=", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmLessThan(String value) {
            addCriterion("XZQDM <", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmLessThanOrEqualTo(String value) {
            addCriterion("XZQDM <=", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmLike(String value) {
            addCriterion("XZQDM like", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmNotLike(String value) {
            addCriterion("XZQDM not like", value, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmIn(List<String> values) {
            addCriterion("XZQDM in", values, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmNotIn(List<String> values) {
            addCriterion("XZQDM not in", values, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmBetween(String value1, String value2) {
            addCriterion("XZQDM between", value1, value2, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andXzqdmNotBetween(String value1, String value2) {
            addCriterion("XZQDM not between", value1, value2, "xzqdm");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiIsNull() {
            addCriterion("STHJZKZSEI is null");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiIsNotNull() {
            addCriterion("STHJZKZSEI is not null");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiEqualTo(Double value) {
            addCriterion("STHJZKZSEI =", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiNotEqualTo(Double value) {
            addCriterion("STHJZKZSEI <>", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiGreaterThan(Double value) {
            addCriterion("STHJZKZSEI >", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiGreaterThanOrEqualTo(Double value) {
            addCriterion("STHJZKZSEI >=", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiLessThan(Double value) {
            addCriterion("STHJZKZSEI <", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiLessThanOrEqualTo(Double value) {
            addCriterion("STHJZKZSEI <=", value, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiIn(List<Double> values) {
            addCriterion("STHJZKZSEI in", values, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiNotIn(List<Double> values) {
            addCriterion("STHJZKZSEI not in", values, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiBetween(Double value1, Double value2) {
            addCriterion("STHJZKZSEI between", value1, value2, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andSthjzkzseiNotBetween(Double value1, Double value2) {
            addCriterion("STHJZKZSEI not between", value1, value2, "sthjzkzsei");
            return (Criteria) this;
        }

        public Criteria andPjjgIsNull() {
            addCriterion("PJJG is null");
            return (Criteria) this;
        }

        public Criteria andPjjgIsNotNull() {
            addCriterion("PJJG is not null");
            return (Criteria) this;
        }

        public Criteria andPjjgEqualTo(String value) {
            addCriterion("PJJG =", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgNotEqualTo(String value) {
            addCriterion("PJJG <>", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgGreaterThan(String value) {
            addCriterion("PJJG >", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgGreaterThanOrEqualTo(String value) {
            addCriterion("PJJG >=", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgLessThan(String value) {
            addCriterion("PJJG <", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgLessThanOrEqualTo(String value) {
            addCriterion("PJJG <=", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgLike(String value) {
            addCriterion("PJJG like", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgNotLike(String value) {
            addCriterion("PJJG not like", value, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgIn(List<String> values) {
            addCriterion("PJJG in", values, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgNotIn(List<String> values) {
            addCriterion("PJJG not in", values, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgBetween(String value1, String value2) {
            addCriterion("PJJG between", value1, value2, "pjjg");
            return (Criteria) this;
        }

        public Criteria andPjjgNotBetween(String value1, String value2) {
            addCriterion("PJJG not between", value1, value2, "pjjg");
            return (Criteria) this;
        }

        public Criteria andSczzIsNull() {
            addCriterion("SCZZ is null");
            return (Criteria) this;
        }

        public Criteria andSczzIsNotNull() {
            addCriterion("SCZZ is not null");
            return (Criteria) this;
        }

        public Criteria andSczzEqualTo(Double value) {
            addCriterion("SCZZ =", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzNotEqualTo(Double value) {
            addCriterion("SCZZ <>", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzGreaterThan(Double value) {
            addCriterion("SCZZ >", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzGreaterThanOrEqualTo(Double value) {
            addCriterion("SCZZ >=", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzLessThan(Double value) {
            addCriterion("SCZZ <", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzLessThanOrEqualTo(Double value) {
            addCriterion("SCZZ <=", value, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzIn(List<Double> values) {
            addCriterion("SCZZ in", values, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzNotIn(List<Double> values) {
            addCriterion("SCZZ not in", values, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzBetween(Double value1, Double value2) {
            addCriterion("SCZZ between", value1, value2, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzNotBetween(Double value1, Double value2) {
            addCriterion("SCZZ not between", value1, value2, "sczz");
            return (Criteria) this;
        }

        public Criteria andSczzbIsNull() {
            addCriterion("SCZZB is null");
            return (Criteria) this;
        }

        public Criteria andSczzbIsNotNull() {
            addCriterion("SCZZB is not null");
            return (Criteria) this;
        }

        public Criteria andSczzbEqualTo(Double value) {
            addCriterion("SCZZB =", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbNotEqualTo(Double value) {
            addCriterion("SCZZB <>", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbGreaterThan(Double value) {
            addCriterion("SCZZB >", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbGreaterThanOrEqualTo(Double value) {
            addCriterion("SCZZB >=", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbLessThan(Double value) {
            addCriterion("SCZZB <", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbLessThanOrEqualTo(Double value) {
            addCriterion("SCZZB <=", value, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbIn(List<Double> values) {
            addCriterion("SCZZB in", values, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbNotIn(List<Double> values) {
            addCriterion("SCZZB not in", values, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbBetween(Double value1, Double value2) {
            addCriterion("SCZZB between", value1, value2, "sczzb");
            return (Criteria) this;
        }

        public Criteria andSczzbNotBetween(Double value1, Double value2) {
            addCriterion("SCZZB not between", value1, value2, "sczzb");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 04 15:15:47 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
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