package com.fiprs.springbootdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class THjjczzRkhzExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public THjjczzRkhzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
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
     * This method corresponds to the database table t_hjjczz_rkhz
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
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
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
     * This class corresponds to the database table t_hjjczz_rkhz
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

        public Criteria andStlbIsNull() {
            addCriterion("STLB is null");
            return (Criteria) this;
        }

        public Criteria andStlbIsNotNull() {
            addCriterion("STLB is not null");
            return (Criteria) this;
        }

        public Criteria andStlbEqualTo(String value) {
            addCriterion("STLB =", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbNotEqualTo(String value) {
            addCriterion("STLB <>", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbGreaterThan(String value) {
            addCriterion("STLB >", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbGreaterThanOrEqualTo(String value) {
            addCriterion("STLB >=", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbLessThan(String value) {
            addCriterion("STLB <", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbLessThanOrEqualTo(String value) {
            addCriterion("STLB <=", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbLike(String value) {
            addCriterion("STLB like", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbNotLike(String value) {
            addCriterion("STLB not like", value, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbIn(List<String> values) {
            addCriterion("STLB in", values, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbNotIn(List<String> values) {
            addCriterion("STLB not in", values, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbBetween(String value1, String value2) {
            addCriterion("STLB between", value1, value2, "stlb");
            return (Criteria) this;
        }

        public Criteria andStlbNotBetween(String value1, String value2) {
            addCriterion("STLB not between", value1, value2, "stlb");
            return (Criteria) this;
        }

        public Criteria andLbrk2016IsNull() {
            addCriterion("LBRK2016 is null");
            return (Criteria) this;
        }

        public Criteria andLbrk2016IsNotNull() {
            addCriterion("LBRK2016 is not null");
            return (Criteria) this;
        }

        public Criteria andLbrk2016EqualTo(Double value) {
            addCriterion("LBRK2016 =", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016NotEqualTo(Double value) {
            addCriterion("LBRK2016 <>", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016GreaterThan(Double value) {
            addCriterion("LBRK2016 >", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016GreaterThanOrEqualTo(Double value) {
            addCriterion("LBRK2016 >=", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016LessThan(Double value) {
            addCriterion("LBRK2016 <", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016LessThanOrEqualTo(Double value) {
            addCriterion("LBRK2016 <=", value, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016In(List<Double> values) {
            addCriterion("LBRK2016 in", values, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016NotIn(List<Double> values) {
            addCriterion("LBRK2016 not in", values, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016Between(Double value1, Double value2) {
            addCriterion("LBRK2016 between", value1, value2, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2016NotBetween(Double value1, Double value2) {
            addCriterion("LBRK2016 not between", value1, value2, "lbrk2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016IsNull() {
            addCriterion("LBRKZB2016 is null");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016IsNotNull() {
            addCriterion("LBRKZB2016 is not null");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016EqualTo(String value) {
            addCriterion("LBRKZB2016 =", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016NotEqualTo(String value) {
            addCriterion("LBRKZB2016 <>", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016GreaterThan(String value) {
            addCriterion("LBRKZB2016 >", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016GreaterThanOrEqualTo(String value) {
            addCriterion("LBRKZB2016 >=", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016LessThan(String value) {
            addCriterion("LBRKZB2016 <", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016LessThanOrEqualTo(String value) {
            addCriterion("LBRKZB2016 <=", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016Like(String value) {
            addCriterion("LBRKZB2016 like", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016NotLike(String value) {
            addCriterion("LBRKZB2016 not like", value, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016In(List<String> values) {
            addCriterion("LBRKZB2016 in", values, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016NotIn(List<String> values) {
            addCriterion("LBRKZB2016 not in", values, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016Between(String value1, String value2) {
            addCriterion("LBRKZB2016 between", value1, value2, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2016NotBetween(String value1, String value2) {
            addCriterion("LBRKZB2016 not between", value1, value2, "lbrkzb2016");
            return (Criteria) this;
        }

        public Criteria andLbrk2017IsNull() {
            addCriterion("LBRK2017 is null");
            return (Criteria) this;
        }

        public Criteria andLbrk2017IsNotNull() {
            addCriterion("LBRK2017 is not null");
            return (Criteria) this;
        }

        public Criteria andLbrk2017EqualTo(Double value) {
            addCriterion("LBRK2017 =", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017NotEqualTo(Double value) {
            addCriterion("LBRK2017 <>", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017GreaterThan(Double value) {
            addCriterion("LBRK2017 >", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017GreaterThanOrEqualTo(Double value) {
            addCriterion("LBRK2017 >=", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017LessThan(Double value) {
            addCriterion("LBRK2017 <", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017LessThanOrEqualTo(Double value) {
            addCriterion("LBRK2017 <=", value, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017In(List<Double> values) {
            addCriterion("LBRK2017 in", values, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017NotIn(List<Double> values) {
            addCriterion("LBRK2017 not in", values, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017Between(Double value1, Double value2) {
            addCriterion("LBRK2017 between", value1, value2, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrk2017NotBetween(Double value1, Double value2) {
            addCriterion("LBRK2017 not between", value1, value2, "lbrk2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017IsNull() {
            addCriterion("LBRKZB2017 is null");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017IsNotNull() {
            addCriterion("LBRKZB2017 is not null");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017EqualTo(String value) {
            addCriterion("LBRKZB2017 =", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017NotEqualTo(String value) {
            addCriterion("LBRKZB2017 <>", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017GreaterThan(String value) {
            addCriterion("LBRKZB2017 >", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017GreaterThanOrEqualTo(String value) {
            addCriterion("LBRKZB2017 >=", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017LessThan(String value) {
            addCriterion("LBRKZB2017 <", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017LessThanOrEqualTo(String value) {
            addCriterion("LBRKZB2017 <=", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017Like(String value) {
            addCriterion("LBRKZB2017 like", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017NotLike(String value) {
            addCriterion("LBRKZB2017 not like", value, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017In(List<String> values) {
            addCriterion("LBRKZB2017 in", values, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017NotIn(List<String> values) {
            addCriterion("LBRKZB2017 not in", values, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017Between(String value1, String value2) {
            addCriterion("LBRKZB2017 between", value1, value2, "lbrkzb2017");
            return (Criteria) this;
        }

        public Criteria andLbrkzb2017NotBetween(String value1, String value2) {
            addCriterion("LBRKZB2017 not between", value1, value2, "lbrkzb2017");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hjjczz_rkhz
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
     * This class corresponds to the database table t_hjjczz_rkhz
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