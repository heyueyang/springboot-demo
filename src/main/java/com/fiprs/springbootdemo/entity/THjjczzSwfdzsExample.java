package com.fiprs.springbootdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class THjjczzSwfdzsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public THjjczzSwfdzsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
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
     * This method corresponds to the database table t_hjjczz_swfdzs
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
     * This method corresponds to the database table t_hjjczz_swfdzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_swfdzs
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
     * This class corresponds to the database table t_hjjczz_swfdzs
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

        public Criteria andSjzlzIsNull() {
            addCriterion("SJZLZ is null");
            return (Criteria) this;
        }

        public Criteria andSjzlzIsNotNull() {
            addCriterion("SJZLZ is not null");
            return (Criteria) this;
        }

        public Criteria andSjzlzEqualTo(Double value) {
            addCriterion("SJZLZ =", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzNotEqualTo(Double value) {
            addCriterion("SJZLZ <>", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzGreaterThan(Double value) {
            addCriterion("SJZLZ >", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzGreaterThanOrEqualTo(Double value) {
            addCriterion("SJZLZ >=", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzLessThan(Double value) {
            addCriterion("SJZLZ <", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzLessThanOrEqualTo(Double value) {
            addCriterion("SJZLZ <=", value, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzIn(List<Double> values) {
            addCriterion("SJZLZ in", values, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzNotIn(List<Double> values) {
            addCriterion("SJZLZ not in", values, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzBetween(Double value1, Double value2) {
            addCriterion("SJZLZ between", value1, value2, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjzlzNotBetween(Double value1, Double value2) {
            addCriterion("SJZLZ not between", value1, value2, "sjzlz");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsIsNull() {
            addCriterion("SJGYHXS is null");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsIsNotNull() {
            addCriterion("SJGYHXS is not null");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsEqualTo(Double value) {
            addCriterion("SJGYHXS =", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsNotEqualTo(Double value) {
            addCriterion("SJGYHXS <>", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsGreaterThan(Double value) {
            addCriterion("SJGYHXS >", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsGreaterThanOrEqualTo(Double value) {
            addCriterion("SJGYHXS >=", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsLessThan(Double value) {
            addCriterion("SJGYHXS <", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsLessThanOrEqualTo(Double value) {
            addCriterion("SJGYHXS <=", value, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsIn(List<Double> values) {
            addCriterion("SJGYHXS in", values, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsNotIn(List<Double> values) {
            addCriterion("SJGYHXS not in", values, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsBetween(Double value1, Double value2) {
            addCriterion("SJGYHXS between", value1, value2, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjgyhxsNotBetween(Double value1, Double value2) {
            addCriterion("SJGYHXS not between", value1, value2, "sjgyhxs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsIsNull() {
            addCriterion("SJZLZS is null");
            return (Criteria) this;
        }

        public Criteria andSjzlzsIsNotNull() {
            addCriterion("SJZLZS is not null");
            return (Criteria) this;
        }

        public Criteria andSjzlzsEqualTo(Double value) {
            addCriterion("SJZLZS =", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsNotEqualTo(Double value) {
            addCriterion("SJZLZS <>", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsGreaterThan(Double value) {
            addCriterion("SJZLZS >", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsGreaterThanOrEqualTo(Double value) {
            addCriterion("SJZLZS >=", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsLessThan(Double value) {
            addCriterion("SJZLZS <", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsLessThanOrEqualTo(Double value) {
            addCriterion("SJZLZS <=", value, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsIn(List<Double> values) {
            addCriterion("SJZLZS in", values, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsNotIn(List<Double> values) {
            addCriterion("SJZLZS not in", values, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsBetween(Double value1, Double value2) {
            addCriterion("SJZLZS between", value1, value2, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSjzlzsNotBetween(Double value1, Double value2) {
            addCriterion("SJZLZS not between", value1, value2, "sjzlzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsIsNull() {
            addCriterion("SWDYXZS is null");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsIsNotNull() {
            addCriterion("SWDYXZS is not null");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsEqualTo(Double value) {
            addCriterion("SWDYXZS =", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsNotEqualTo(Double value) {
            addCriterion("SWDYXZS <>", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsGreaterThan(Double value) {
            addCriterion("SWDYXZS >", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsGreaterThanOrEqualTo(Double value) {
            addCriterion("SWDYXZS >=", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsLessThan(Double value) {
            addCriterion("SWDYXZS <", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsLessThanOrEqualTo(Double value) {
            addCriterion("SWDYXZS <=", value, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsIn(List<Double> values) {
            addCriterion("SWDYXZS in", values, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsNotIn(List<Double> values) {
            addCriterion("SWDYXZS not in", values, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsBetween(Double value1, Double value2) {
            addCriterion("SWDYXZS between", value1, value2, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwdyxzsNotBetween(Double value1, Double value2) {
            addCriterion("SWDYXZS not between", value1, value2, "swdyxzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsIsNull() {
            addCriterion("SWFDZS is null");
            return (Criteria) this;
        }

        public Criteria andSwfdzsIsNotNull() {
            addCriterion("SWFDZS is not null");
            return (Criteria) this;
        }

        public Criteria andSwfdzsEqualTo(Double value) {
            addCriterion("SWFDZS =", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsNotEqualTo(Double value) {
            addCriterion("SWFDZS <>", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsGreaterThan(Double value) {
            addCriterion("SWFDZS >", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsGreaterThanOrEqualTo(Double value) {
            addCriterion("SWFDZS >=", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsLessThan(Double value) {
            addCriterion("SWFDZS <", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsLessThanOrEqualTo(Double value) {
            addCriterion("SWFDZS <=", value, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsIn(List<Double> values) {
            addCriterion("SWFDZS in", values, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsNotIn(List<Double> values) {
            addCriterion("SWFDZS not in", values, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsBetween(Double value1, Double value2) {
            addCriterion("SWFDZS between", value1, value2, "swfdzs");
            return (Criteria) this;
        }

        public Criteria andSwfdzsNotBetween(Double value1, Double value2) {
            addCriterion("SWFDZS not between", value1, value2, "swfdzs");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_swfdzs
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
     * This class corresponds to the database table t_hjjczz_swfdzs
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