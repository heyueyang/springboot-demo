package com.fiprs.springbootdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class THjjczzTdxpzsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public THjjczzTdxpzsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
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
     * This method corresponds to the database table t_hjjczz_tdxpzs
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
     * This method corresponds to the database table t_hjjczz_tdxpzs
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_tdxpzs
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
     * This class corresponds to the database table t_hjjczz_tdxpzs
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

        public Criteria andMjIsNull() {
            addCriterion("MJ is null");
            return (Criteria) this;
        }

        public Criteria andMjIsNotNull() {
            addCriterion("MJ is not null");
            return (Criteria) this;
        }

        public Criteria andMjEqualTo(Double value) {
            addCriterion("MJ =", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotEqualTo(Double value) {
            addCriterion("MJ <>", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThan(Double value) {
            addCriterion("MJ >", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThanOrEqualTo(Double value) {
            addCriterion("MJ >=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThan(Double value) {
            addCriterion("MJ <", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThanOrEqualTo(Double value) {
            addCriterion("MJ <=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjIn(List<Double> values) {
            addCriterion("MJ in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotIn(List<Double> values) {
            addCriterion("MJ not in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjBetween(Double value1, Double value2) {
            addCriterion("MJ between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotBetween(Double value1, Double value2) {
            addCriterion("MJ not between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andQdIsNull() {
            addCriterion("QD is null");
            return (Criteria) this;
        }

        public Criteria andQdIsNotNull() {
            addCriterion("QD is not null");
            return (Criteria) this;
        }

        public Criteria andQdEqualTo(Double value) {
            addCriterion("QD =", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdNotEqualTo(Double value) {
            addCriterion("QD <>", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdGreaterThan(Double value) {
            addCriterion("QD >", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdGreaterThanOrEqualTo(Double value) {
            addCriterion("QD >=", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdLessThan(Double value) {
            addCriterion("QD <", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdLessThanOrEqualTo(Double value) {
            addCriterion("QD <=", value, "qd");
            return (Criteria) this;
        }

        public Criteria andQdIn(List<Double> values) {
            addCriterion("QD in", values, "qd");
            return (Criteria) this;
        }

        public Criteria andQdNotIn(List<Double> values) {
            addCriterion("QD not in", values, "qd");
            return (Criteria) this;
        }

        public Criteria andQdBetween(Double value1, Double value2) {
            addCriterion("QD between", value1, value2, "qd");
            return (Criteria) this;
        }

        public Criteria andQdNotBetween(Double value1, Double value2) {
            addCriterion("QD not between", value1, value2, "qd");
            return (Criteria) this;
        }

        public Criteria andZdIsNull() {
            addCriterion("ZD is null");
            return (Criteria) this;
        }

        public Criteria andZdIsNotNull() {
            addCriterion("ZD is not null");
            return (Criteria) this;
        }

        public Criteria andZdEqualTo(Double value) {
            addCriterion("ZD =", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotEqualTo(Double value) {
            addCriterion("ZD <>", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThan(Double value) {
            addCriterion("ZD >", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThanOrEqualTo(Double value) {
            addCriterion("ZD >=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThan(Double value) {
            addCriterion("ZD <", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThanOrEqualTo(Double value) {
            addCriterion("ZD <=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdIn(List<Double> values) {
            addCriterion("ZD in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotIn(List<Double> values) {
            addCriterion("ZD not in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdBetween(Double value1, Double value2) {
            addCriterion("ZD between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotBetween(Double value1, Double value2) {
            addCriterion("ZD not between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZhdIsNull() {
            addCriterion("ZHD is null");
            return (Criteria) this;
        }

        public Criteria andZhdIsNotNull() {
            addCriterion("ZHD is not null");
            return (Criteria) this;
        }

        public Criteria andZhdEqualTo(Double value) {
            addCriterion("ZHD =", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdNotEqualTo(Double value) {
            addCriterion("ZHD <>", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdGreaterThan(Double value) {
            addCriterion("ZHD >", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdGreaterThanOrEqualTo(Double value) {
            addCriterion("ZHD >=", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdLessThan(Double value) {
            addCriterion("ZHD <", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdLessThanOrEqualTo(Double value) {
            addCriterion("ZHD <=", value, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdIn(List<Double> values) {
            addCriterion("ZHD in", values, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdNotIn(List<Double> values) {
            addCriterion("ZHD not in", values, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdBetween(Double value1, Double value2) {
            addCriterion("ZHD between", value1, value2, "zhd");
            return (Criteria) this;
        }

        public Criteria andZhdNotBetween(Double value1, Double value2) {
            addCriterion("ZHD not between", value1, value2, "zhd");
            return (Criteria) this;
        }

        public Criteria andTdxpzIsNull() {
            addCriterion("TDXPZ is null");
            return (Criteria) this;
        }

        public Criteria andTdxpzIsNotNull() {
            addCriterion("TDXPZ is not null");
            return (Criteria) this;
        }

        public Criteria andTdxpzEqualTo(Double value) {
            addCriterion("TDXPZ =", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzNotEqualTo(Double value) {
            addCriterion("TDXPZ <>", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzGreaterThan(Double value) {
            addCriterion("TDXPZ >", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzGreaterThanOrEqualTo(Double value) {
            addCriterion("TDXPZ >=", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzLessThan(Double value) {
            addCriterion("TDXPZ <", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzLessThanOrEqualTo(Double value) {
            addCriterion("TDXPZ <=", value, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzIn(List<Double> values) {
            addCriterion("TDXPZ in", values, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzNotIn(List<Double> values) {
            addCriterion("TDXPZ not in", values, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzBetween(Double value1, Double value2) {
            addCriterion("TDXPZ between", value1, value2, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpzNotBetween(Double value1, Double value2) {
            addCriterion("TDXPZ not between", value1, value2, "tdxpz");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsIsNull() {
            addCriterion("TDXPGYHXS is null");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsIsNotNull() {
            addCriterion("TDXPGYHXS is not null");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsEqualTo(Double value) {
            addCriterion("TDXPGYHXS =", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsNotEqualTo(Double value) {
            addCriterion("TDXPGYHXS <>", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsGreaterThan(Double value) {
            addCriterion("TDXPGYHXS >", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsGreaterThanOrEqualTo(Double value) {
            addCriterion("TDXPGYHXS >=", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsLessThan(Double value) {
            addCriterion("TDXPGYHXS <", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsLessThanOrEqualTo(Double value) {
            addCriterion("TDXPGYHXS <=", value, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsIn(List<Double> values) {
            addCriterion("TDXPGYHXS in", values, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsNotIn(List<Double> values) {
            addCriterion("TDXPGYHXS not in", values, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsBetween(Double value1, Double value2) {
            addCriterion("TDXPGYHXS between", value1, value2, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andTdxpgyhxsNotBetween(Double value1, Double value2) {
            addCriterion("TDXPGYHXS not between", value1, value2, "tdxpgyhxs");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjIsNull() {
            addCriterion("XZWLYDDPGDMJ is null");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjIsNotNull() {
            addCriterion("XZWLYDDPGDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjEqualTo(Double value) {
            addCriterion("XZWLYDDPGDMJ =", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjNotEqualTo(Double value) {
            addCriterion("XZWLYDDPGDMJ <>", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjGreaterThan(Double value) {
            addCriterion("XZWLYDDPGDMJ >", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("XZWLYDDPGDMJ >=", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjLessThan(Double value) {
            addCriterion("XZWLYDDPGDMJ <", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjLessThanOrEqualTo(Double value) {
            addCriterion("XZWLYDDPGDMJ <=", value, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjIn(List<Double> values) {
            addCriterion("XZWLYDDPGDMJ in", values, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjNotIn(List<Double> values) {
            addCriterion("XZWLYDDPGDMJ not in", values, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjBetween(Double value1, Double value2) {
            addCriterion("XZWLYDDPGDMJ between", value1, value2, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andXzwlyddpgdmjNotBetween(Double value1, Double value2) {
            addCriterion("XZWLYDDPGDMJ not between", value1, value2, "xzwlyddpgdmj");
            return (Criteria) this;
        }

        public Criteria andTdxpzsIsNull() {
            addCriterion("TDXPZS is null");
            return (Criteria) this;
        }

        public Criteria andTdxpzsIsNotNull() {
            addCriterion("TDXPZS is not null");
            return (Criteria) this;
        }

        public Criteria andTdxpzsEqualTo(Double value) {
            addCriterion("TDXPZS =", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsNotEqualTo(Double value) {
            addCriterion("TDXPZS <>", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsGreaterThan(Double value) {
            addCriterion("TDXPZS >", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsGreaterThanOrEqualTo(Double value) {
            addCriterion("TDXPZS >=", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsLessThan(Double value) {
            addCriterion("TDXPZS <", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsLessThanOrEqualTo(Double value) {
            addCriterion("TDXPZS <=", value, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsIn(List<Double> values) {
            addCriterion("TDXPZS in", values, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsNotIn(List<Double> values) {
            addCriterion("TDXPZS not in", values, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsBetween(Double value1, Double value2) {
            addCriterion("TDXPZS between", value1, value2, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andTdxpzsNotBetween(Double value1, Double value2) {
            addCriterion("TDXPZS not between", value1, value2, "tdxpzs");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016IsNull() {
            addCriterion("WLYDDPGD2016 is null");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016IsNotNull() {
            addCriterion("WLYDDPGD2016 is not null");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016EqualTo(Double value) {
            addCriterion("WLYDDPGD2016 =", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016NotEqualTo(Double value) {
            addCriterion("WLYDDPGD2016 <>", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016GreaterThan(Double value) {
            addCriterion("WLYDDPGD2016 >", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016GreaterThanOrEqualTo(Double value) {
            addCriterion("WLYDDPGD2016 >=", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016LessThan(Double value) {
            addCriterion("WLYDDPGD2016 <", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016LessThanOrEqualTo(Double value) {
            addCriterion("WLYDDPGD2016 <=", value, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016In(List<Double> values) {
            addCriterion("WLYDDPGD2016 in", values, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016NotIn(List<Double> values) {
            addCriterion("WLYDDPGD2016 not in", values, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016Between(Double value1, Double value2) {
            addCriterion("WLYDDPGD2016 between", value1, value2, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2016NotBetween(Double value1, Double value2) {
            addCriterion("WLYDDPGD2016 not between", value1, value2, "wlyddpgd2016");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015IsNull() {
            addCriterion("WLYDDPGD2015 is null");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015IsNotNull() {
            addCriterion("WLYDDPGD2015 is not null");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015EqualTo(Double value) {
            addCriterion("WLYDDPGD2015 =", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015NotEqualTo(Double value) {
            addCriterion("WLYDDPGD2015 <>", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015GreaterThan(Double value) {
            addCriterion("WLYDDPGD2015 >", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015GreaterThanOrEqualTo(Double value) {
            addCriterion("WLYDDPGD2015 >=", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015LessThan(Double value) {
            addCriterion("WLYDDPGD2015 <", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015LessThanOrEqualTo(Double value) {
            addCriterion("WLYDDPGD2015 <=", value, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015In(List<Double> values) {
            addCriterion("WLYDDPGD2015 in", values, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015NotIn(List<Double> values) {
            addCriterion("WLYDDPGD2015 not in", values, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015Between(Double value1, Double value2) {
            addCriterion("WLYDDPGD2015 between", value1, value2, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andWlyddpgd2015NotBetween(Double value1, Double value2) {
            addCriterion("WLYDDPGD2015 not between", value1, value2, "wlyddpgd2015");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnIsNull() {
            addCriterion("MyUnknownColumn is null");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnIsNotNull() {
            addCriterion("MyUnknownColumn is not null");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnEqualTo(String value) {
            addCriterion("MyUnknownColumn =", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnNotEqualTo(String value) {
            addCriterion("MyUnknownColumn <>", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnGreaterThan(String value) {
            addCriterion("MyUnknownColumn >", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnGreaterThanOrEqualTo(String value) {
            addCriterion("MyUnknownColumn >=", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnLessThan(String value) {
            addCriterion("MyUnknownColumn <", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnLessThanOrEqualTo(String value) {
            addCriterion("MyUnknownColumn <=", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnLike(String value) {
            addCriterion("MyUnknownColumn like", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnNotLike(String value) {
            addCriterion("MyUnknownColumn not like", value, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnIn(List<String> values) {
            addCriterion("MyUnknownColumn in", values, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnNotIn(List<String> values) {
            addCriterion("MyUnknownColumn not in", values, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnBetween(String value1, String value2) {
            addCriterion("MyUnknownColumn between", value1, value2, "myunknowncolumn");
            return (Criteria) this;
        }

        public Criteria andMyunknowncolumnNotBetween(String value1, String value2) {
            addCriterion("MyUnknownColumn not between", value1, value2, "myunknowncolumn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_tdxpzs
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
     * This class corresponds to the database table t_hjjczz_tdxpzs
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