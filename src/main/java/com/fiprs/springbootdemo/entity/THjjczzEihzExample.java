package com.fiprs.springbootdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class THjjczzEihzExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public THjjczzEihzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
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
     * This method corresponds to the database table t_hjjczz_eihz
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
     * This method corresponds to the database table t_hjjczz_eihz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eihz
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
     * This class corresponds to the database table t_hjjczz_eihz
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

        public Criteria andLbIsNull() {
            addCriterion("LB is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("LB is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("LB =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("LB <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("LB >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("LB >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("LB <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("LB <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("LB like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("LB not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("LB in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("LB not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("LB between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("LB not between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andFwIsNull() {
            addCriterion("FW is null");
            return (Criteria) this;
        }

        public Criteria andFwIsNotNull() {
            addCriterion("FW is not null");
            return (Criteria) this;
        }

        public Criteria andFwEqualTo(String value) {
            addCriterion("FW =", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwNotEqualTo(String value) {
            addCriterion("FW <>", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwGreaterThan(String value) {
            addCriterion("FW >", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwGreaterThanOrEqualTo(String value) {
            addCriterion("FW >=", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwLessThan(String value) {
            addCriterion("FW <", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwLessThanOrEqualTo(String value) {
            addCriterion("FW <=", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwLike(String value) {
            addCriterion("FW like", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwNotLike(String value) {
            addCriterion("FW not like", value, "fw");
            return (Criteria) this;
        }

        public Criteria andFwIn(List<String> values) {
            addCriterion("FW in", values, "fw");
            return (Criteria) this;
        }

        public Criteria andFwNotIn(List<String> values) {
            addCriterion("FW not in", values, "fw");
            return (Criteria) this;
        }

        public Criteria andFwBetween(String value1, String value2) {
            addCriterion("FW between", value1, value2, "fw");
            return (Criteria) this;
        }

        public Criteria andFwNotBetween(String value1, String value2) {
            addCriterion("FW not between", value1, value2, "fw");
            return (Criteria) this;
        }

        public Criteria andGsIsNull() {
            addCriterion("GS is null");
            return (Criteria) this;
        }

        public Criteria andGsIsNotNull() {
            addCriterion("GS is not null");
            return (Criteria) this;
        }

        public Criteria andGsEqualTo(Integer value) {
            addCriterion("GS =", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotEqualTo(Integer value) {
            addCriterion("GS <>", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsGreaterThan(Integer value) {
            addCriterion("GS >", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsGreaterThanOrEqualTo(Integer value) {
            addCriterion("GS >=", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsLessThan(Integer value) {
            addCriterion("GS <", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsLessThanOrEqualTo(Integer value) {
            addCriterion("GS <=", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsIn(List<Integer> values) {
            addCriterion("GS in", values, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotIn(List<Integer> values) {
            addCriterion("GS not in", values, "gs");
            return (Criteria) this;
        }

        public Criteria andGsBetween(Integer value1, Integer value2) {
            addCriterion("GS between", value1, value2, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotBetween(Integer value1, Integer value2) {
            addCriterion("GS not between", value1, value2, "gs");
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

        public Criteria andGsblIsNull() {
            addCriterion("GSBL is null");
            return (Criteria) this;
        }

        public Criteria andGsblIsNotNull() {
            addCriterion("GSBL is not null");
            return (Criteria) this;
        }

        public Criteria andGsblEqualTo(String value) {
            addCriterion("GSBL =", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblNotEqualTo(String value) {
            addCriterion("GSBL <>", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblGreaterThan(String value) {
            addCriterion("GSBL >", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblGreaterThanOrEqualTo(String value) {
            addCriterion("GSBL >=", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblLessThan(String value) {
            addCriterion("GSBL <", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblLessThanOrEqualTo(String value) {
            addCriterion("GSBL <=", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblLike(String value) {
            addCriterion("GSBL like", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblNotLike(String value) {
            addCriterion("GSBL not like", value, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblIn(List<String> values) {
            addCriterion("GSBL in", values, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblNotIn(List<String> values) {
            addCriterion("GSBL not in", values, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblBetween(String value1, String value2) {
            addCriterion("GSBL between", value1, value2, "gsbl");
            return (Criteria) this;
        }

        public Criteria andGsblNotBetween(String value1, String value2) {
            addCriterion("GSBL not between", value1, value2, "gsbl");
            return (Criteria) this;
        }

        public Criteria andMjblIsNull() {
            addCriterion("MJBL is null");
            return (Criteria) this;
        }

        public Criteria andMjblIsNotNull() {
            addCriterion("MJBL is not null");
            return (Criteria) this;
        }

        public Criteria andMjblEqualTo(String value) {
            addCriterion("MJBL =", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblNotEqualTo(String value) {
            addCriterion("MJBL <>", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblGreaterThan(String value) {
            addCriterion("MJBL >", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblGreaterThanOrEqualTo(String value) {
            addCriterion("MJBL >=", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblLessThan(String value) {
            addCriterion("MJBL <", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblLessThanOrEqualTo(String value) {
            addCriterion("MJBL <=", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblLike(String value) {
            addCriterion("MJBL like", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblNotLike(String value) {
            addCriterion("MJBL not like", value, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblIn(List<String> values) {
            addCriterion("MJBL in", values, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblNotIn(List<String> values) {
            addCriterion("MJBL not in", values, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblBetween(String value1, String value2) {
            addCriterion("MJBL between", value1, value2, "mjbl");
            return (Criteria) this;
        }

        public Criteria andMjblNotBetween(String value1, String value2) {
            addCriterion("MJBL not between", value1, value2, "mjbl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_eihz
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
     * This class corresponds to the database table t_hjjczz_eihz
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