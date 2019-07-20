package com.sq.account.generator.model;

import java.util.ArrayList;
import java.util.List;

public class AccountInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInExample() {
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

        public Criteria andAIsNull() {
            addCriterion("A is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("A is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(Long value) {
            addCriterion("A =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(Long value) {
            addCriterion("A <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(Long value) {
            addCriterion("A >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(Long value) {
            addCriterion("A >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(Long value) {
            addCriterion("A <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(Long value) {
            addCriterion("A <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<Long> values) {
            addCriterion("A in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<Long> values) {
            addCriterion("A not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(Long value1, Long value2) {
            addCriterion("A between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(Long value1, Long value2) {
            addCriterion("A not between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("B is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("B is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(String value) {
            addCriterion("B =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(String value) {
            addCriterion("B <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(String value) {
            addCriterion("B >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(String value) {
            addCriterion("B >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(String value) {
            addCriterion("B <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(String value) {
            addCriterion("B <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLike(String value) {
            addCriterion("B like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotLike(String value) {
            addCriterion("B not like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<String> values) {
            addCriterion("B in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<String> values) {
            addCriterion("B not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(String value1, String value2) {
            addCriterion("B between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(String value1, String value2) {
            addCriterion("B not between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("C is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("C is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("C =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("C <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("C >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("C >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("C <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("C <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("C like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("C not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("C in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("C not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("C between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("C not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("D is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("D is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(String value) {
            addCriterion("D =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(String value) {
            addCriterion("D <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(String value) {
            addCriterion("D >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(String value) {
            addCriterion("D >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(String value) {
            addCriterion("D <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(String value) {
            addCriterion("D <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLike(String value) {
            addCriterion("D like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotLike(String value) {
            addCriterion("D not like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<String> values) {
            addCriterion("D in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<String> values) {
            addCriterion("D not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(String value1, String value2) {
            addCriterion("D between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(String value1, String value2) {
            addCriterion("D not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andEIsNull() {
            addCriterion("E is null");
            return (Criteria) this;
        }

        public Criteria andEIsNotNull() {
            addCriterion("E is not null");
            return (Criteria) this;
        }

        public Criteria andEEqualTo(String value) {
            addCriterion("E =", value, "e");
            return (Criteria) this;
        }

        public Criteria andENotEqualTo(String value) {
            addCriterion("E <>", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThan(String value) {
            addCriterion("E >", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThanOrEqualTo(String value) {
            addCriterion("E >=", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThan(String value) {
            addCriterion("E <", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThanOrEqualTo(String value) {
            addCriterion("E <=", value, "e");
            return (Criteria) this;
        }

        public Criteria andELike(String value) {
            addCriterion("E like", value, "e");
            return (Criteria) this;
        }

        public Criteria andENotLike(String value) {
            addCriterion("E not like", value, "e");
            return (Criteria) this;
        }

        public Criteria andEIn(List<String> values) {
            addCriterion("E in", values, "e");
            return (Criteria) this;
        }

        public Criteria andENotIn(List<String> values) {
            addCriterion("E not in", values, "e");
            return (Criteria) this;
        }

        public Criteria andEBetween(String value1, String value2) {
            addCriterion("E between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andENotBetween(String value1, String value2) {
            addCriterion("E not between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andFIsNull() {
            addCriterion("F is null");
            return (Criteria) this;
        }

        public Criteria andFIsNotNull() {
            addCriterion("F is not null");
            return (Criteria) this;
        }

        public Criteria andFEqualTo(String value) {
            addCriterion("F =", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotEqualTo(String value) {
            addCriterion("F <>", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThan(String value) {
            addCriterion("F >", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThanOrEqualTo(String value) {
            addCriterion("F >=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThan(String value) {
            addCriterion("F <", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThanOrEqualTo(String value) {
            addCriterion("F <=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLike(String value) {
            addCriterion("F like", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotLike(String value) {
            addCriterion("F not like", value, "f");
            return (Criteria) this;
        }

        public Criteria andFIn(List<String> values) {
            addCriterion("F in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFNotIn(List<String> values) {
            addCriterion("F not in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFBetween(String value1, String value2) {
            addCriterion("F between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andFNotBetween(String value1, String value2) {
            addCriterion("F not between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andGIsNull() {
            addCriterion("G is null");
            return (Criteria) this;
        }

        public Criteria andGIsNotNull() {
            addCriterion("G is not null");
            return (Criteria) this;
        }

        public Criteria andGEqualTo(String value) {
            addCriterion("G =", value, "g");
            return (Criteria) this;
        }

        public Criteria andGNotEqualTo(String value) {
            addCriterion("G <>", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThan(String value) {
            addCriterion("G >", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThanOrEqualTo(String value) {
            addCriterion("G >=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThan(String value) {
            addCriterion("G <", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThanOrEqualTo(String value) {
            addCriterion("G <=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLike(String value) {
            addCriterion("G like", value, "g");
            return (Criteria) this;
        }

        public Criteria andGNotLike(String value) {
            addCriterion("G not like", value, "g");
            return (Criteria) this;
        }

        public Criteria andGIn(List<String> values) {
            addCriterion("G in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGNotIn(List<String> values) {
            addCriterion("G not in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGBetween(String value1, String value2) {
            addCriterion("G between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andGNotBetween(String value1, String value2) {
            addCriterion("G not between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("H is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("H is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(String value) {
            addCriterion("H =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(String value) {
            addCriterion("H <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(String value) {
            addCriterion("H >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(String value) {
            addCriterion("H >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(String value) {
            addCriterion("H <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(String value) {
            addCriterion("H <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLike(String value) {
            addCriterion("H like", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotLike(String value) {
            addCriterion("H not like", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<String> values) {
            addCriterion("H in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<String> values) {
            addCriterion("H not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(String value1, String value2) {
            addCriterion("H between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(String value1, String value2) {
            addCriterion("H not between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andIIsNull() {
            addCriterion("I is null");
            return (Criteria) this;
        }

        public Criteria andIIsNotNull() {
            addCriterion("I is not null");
            return (Criteria) this;
        }

        public Criteria andIEqualTo(String value) {
            addCriterion("I =", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotEqualTo(String value) {
            addCriterion("I <>", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThan(String value) {
            addCriterion("I >", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThanOrEqualTo(String value) {
            addCriterion("I >=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThan(String value) {
            addCriterion("I <", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThanOrEqualTo(String value) {
            addCriterion("I <=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILike(String value) {
            addCriterion("I like", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotLike(String value) {
            addCriterion("I not like", value, "i");
            return (Criteria) this;
        }

        public Criteria andIIn(List<String> values) {
            addCriterion("I in", values, "i");
            return (Criteria) this;
        }

        public Criteria andINotIn(List<String> values) {
            addCriterion("I not in", values, "i");
            return (Criteria) this;
        }

        public Criteria andIBetween(String value1, String value2) {
            addCriterion("I between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andINotBetween(String value1, String value2) {
            addCriterion("I not between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andJIsNull() {
            addCriterion("J is null");
            return (Criteria) this;
        }

        public Criteria andJIsNotNull() {
            addCriterion("J is not null");
            return (Criteria) this;
        }

        public Criteria andJEqualTo(String value) {
            addCriterion("J =", value, "j");
            return (Criteria) this;
        }

        public Criteria andJNotEqualTo(String value) {
            addCriterion("J <>", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThan(String value) {
            addCriterion("J >", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThanOrEqualTo(String value) {
            addCriterion("J >=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThan(String value) {
            addCriterion("J <", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThanOrEqualTo(String value) {
            addCriterion("J <=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLike(String value) {
            addCriterion("J like", value, "j");
            return (Criteria) this;
        }

        public Criteria andJNotLike(String value) {
            addCriterion("J not like", value, "j");
            return (Criteria) this;
        }

        public Criteria andJIn(List<String> values) {
            addCriterion("J in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJNotIn(List<String> values) {
            addCriterion("J not in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJBetween(String value1, String value2) {
            addCriterion("J between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andJNotBetween(String value1, String value2) {
            addCriterion("J not between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andKIsNull() {
            addCriterion("K is null");
            return (Criteria) this;
        }

        public Criteria andKIsNotNull() {
            addCriterion("K is not null");
            return (Criteria) this;
        }

        public Criteria andKEqualTo(String value) {
            addCriterion("K =", value, "k");
            return (Criteria) this;
        }

        public Criteria andKNotEqualTo(String value) {
            addCriterion("K <>", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThan(String value) {
            addCriterion("K >", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThanOrEqualTo(String value) {
            addCriterion("K >=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThan(String value) {
            addCriterion("K <", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThanOrEqualTo(String value) {
            addCriterion("K <=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLike(String value) {
            addCriterion("K like", value, "k");
            return (Criteria) this;
        }

        public Criteria andKNotLike(String value) {
            addCriterion("K not like", value, "k");
            return (Criteria) this;
        }

        public Criteria andKIn(List<String> values) {
            addCriterion("K in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKNotIn(List<String> values) {
            addCriterion("K not in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKBetween(String value1, String value2) {
            addCriterion("K between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andKNotBetween(String value1, String value2) {
            addCriterion("K not between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andLIsNull() {
            addCriterion("L is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("L is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(String value) {
            addCriterion("L =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(String value) {
            addCriterion("L <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(String value) {
            addCriterion("L >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(String value) {
            addCriterion("L >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(String value) {
            addCriterion("L <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(String value) {
            addCriterion("L <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLike(String value) {
            addCriterion("L like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotLike(String value) {
            addCriterion("L not like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<String> values) {
            addCriterion("L in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<String> values) {
            addCriterion("L not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(String value1, String value2) {
            addCriterion("L between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(String value1, String value2) {
            addCriterion("L not between", value1, value2, "l");
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