package com.example.demo.admin.entity.admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeValueMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeValueMstExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPHYSCL_CD_NAMEIsNull() {
            addCriterion("PHYSCL_CD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEIsNotNull() {
            addCriterion("PHYSCL_CD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEEqualTo(String value) {
            addCriterion("PHYSCL_CD_NAME =", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMENotEqualTo(String value) {
            addCriterion("PHYSCL_CD_NAME <>", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEGreaterThan(String value) {
            addCriterion("PHYSCL_CD_NAME >", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PHYSCL_CD_NAME >=", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMELessThan(String value) {
            addCriterion("PHYSCL_CD_NAME <", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMELessThanOrEqualTo(String value) {
            addCriterion("PHYSCL_CD_NAME <=", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMELike(String value) {
            addCriterion("PHYSCL_CD_NAME like", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMENotLike(String value) {
            addCriterion("PHYSCL_CD_NAME not like", value, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEIn(List<String> values) {
            addCriterion("PHYSCL_CD_NAME in", values, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMENotIn(List<String> values) {
            addCriterion("PHYSCL_CD_NAME not in", values, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMEBetween(String value1, String value2) {
            addCriterion("PHYSCL_CD_NAME between", value1, value2, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andPHYSCL_CD_NAMENotBetween(String value1, String value2) {
            addCriterion("PHYSCL_CD_NAME not between", value1, value2, "PHYSCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andCD_VALIsNull() {
            addCriterion("CD_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCD_VALIsNotNull() {
            addCriterion("CD_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCD_VALEqualTo(BigDecimal value) {
            addCriterion("CD_VAL =", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALNotEqualTo(BigDecimal value) {
            addCriterion("CD_VAL <>", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALGreaterThan(BigDecimal value) {
            addCriterion("CD_VAL >", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CD_VAL >=", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALLessThan(BigDecimal value) {
            addCriterion("CD_VAL <", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CD_VAL <=", value, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALIn(List<BigDecimal> values) {
            addCriterion("CD_VAL in", values, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALNotIn(List<BigDecimal> values) {
            addCriterion("CD_VAL not in", values, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CD_VAL between", value1, value2, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCD_VALNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CD_VAL not between", value1, value2, "CD_VAL");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATENotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATELessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATELessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATENotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATEBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_DATENotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "CREATED_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_USEREqualTo(String value) {
            addCriterion("CREATED_USER =", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLessThan(String value) {
            addCriterion("CREATED_USER <", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLike(String value) {
            addCriterion("CREATED_USER like", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMIsNull() {
            addCriterion("CREATED_PROGRAM is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMIsNotNull() {
            addCriterion("CREATED_PROGRAM is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMEqualTo(String value) {
            addCriterion("CREATED_PROGRAM =", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMNotEqualTo(String value) {
            addCriterion("CREATED_PROGRAM <>", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMGreaterThan(String value) {
            addCriterion("CREATED_PROGRAM >", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_PROGRAM >=", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMLessThan(String value) {
            addCriterion("CREATED_PROGRAM <", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMLessThanOrEqualTo(String value) {
            addCriterion("CREATED_PROGRAM <=", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMLike(String value) {
            addCriterion("CREATED_PROGRAM like", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMNotLike(String value) {
            addCriterion("CREATED_PROGRAM not like", value, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMIn(List<String> values) {
            addCriterion("CREATED_PROGRAM in", values, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMNotIn(List<String> values) {
            addCriterion("CREATED_PROGRAM not in", values, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMBetween(String value1, String value2) {
            addCriterion("CREATED_PROGRAM between", value1, value2, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andCREATED_PROGRAMNotBetween(String value1, String value2) {
            addCriterion("CREATED_PROGRAM not between", value1, value2, "CREATED_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDIsNull() {
            addCriterion("LAST_EDITED is null");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDIsNotNull() {
            addCriterion("LAST_EDITED is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDEqualTo(Date value) {
            addCriterion("LAST_EDITED =", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDNotEqualTo(Date value) {
            addCriterion("LAST_EDITED <>", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDGreaterThan(Date value) {
            addCriterion("LAST_EDITED >", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_EDITED >=", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDLessThan(Date value) {
            addCriterion("LAST_EDITED <", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDLessThanOrEqualTo(Date value) {
            addCriterion("LAST_EDITED <=", value, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDIn(List<Date> values) {
            addCriterion("LAST_EDITED in", values, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDNotIn(List<Date> values) {
            addCriterion("LAST_EDITED not in", values, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDBetween(Date value1, Date value2) {
            addCriterion("LAST_EDITED between", value1, value2, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_EDITEDNotBetween(Date value1, Date value2) {
            addCriterion("LAST_EDITED not between", value1, value2, "LAST_EDITED");
            return (Criteria) this;
        }

        public Criteria andLAST_USERIsNull() {
            addCriterion("LAST_USER is null");
            return (Criteria) this;
        }

        public Criteria andLAST_USERIsNotNull() {
            addCriterion("LAST_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_USEREqualTo(String value) {
            addCriterion("LAST_USER =", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERNotEqualTo(String value) {
            addCriterion("LAST_USER <>", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERGreaterThan(String value) {
            addCriterion("LAST_USER >", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_USER >=", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERLessThan(String value) {
            addCriterion("LAST_USER <", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERLessThanOrEqualTo(String value) {
            addCriterion("LAST_USER <=", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERLike(String value) {
            addCriterion("LAST_USER like", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERNotLike(String value) {
            addCriterion("LAST_USER not like", value, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERIn(List<String> values) {
            addCriterion("LAST_USER in", values, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERNotIn(List<String> values) {
            addCriterion("LAST_USER not in", values, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERBetween(String value1, String value2) {
            addCriterion("LAST_USER between", value1, value2, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_USERNotBetween(String value1, String value2) {
            addCriterion("LAST_USER not between", value1, value2, "LAST_USER");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMIsNull() {
            addCriterion("LAST_PROGRAM is null");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMIsNotNull() {
            addCriterion("LAST_PROGRAM is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMEqualTo(String value) {
            addCriterion("LAST_PROGRAM =", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMNotEqualTo(String value) {
            addCriterion("LAST_PROGRAM <>", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMGreaterThan(String value) {
            addCriterion("LAST_PROGRAM >", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_PROGRAM >=", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMLessThan(String value) {
            addCriterion("LAST_PROGRAM <", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMLessThanOrEqualTo(String value) {
            addCriterion("LAST_PROGRAM <=", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMLike(String value) {
            addCriterion("LAST_PROGRAM like", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMNotLike(String value) {
            addCriterion("LAST_PROGRAM not like", value, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMIn(List<String> values) {
            addCriterion("LAST_PROGRAM in", values, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMNotIn(List<String> values) {
            addCriterion("LAST_PROGRAM not in", values, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMBetween(String value1, String value2) {
            addCriterion("LAST_PROGRAM between", value1, value2, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andLAST_PROGRAMNotBetween(String value1, String value2) {
            addCriterion("LAST_PROGRAM not between", value1, value2, "LAST_PROGRAM");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYIsNull() {
            addCriterion("VERSION_EX_KEY is null");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYIsNotNull() {
            addCriterion("VERSION_EX_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYEqualTo(Short value) {
            addCriterion("VERSION_EX_KEY =", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYNotEqualTo(Short value) {
            addCriterion("VERSION_EX_KEY <>", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYGreaterThan(Short value) {
            addCriterion("VERSION_EX_KEY >", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYGreaterThanOrEqualTo(Short value) {
            addCriterion("VERSION_EX_KEY >=", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYLessThan(Short value) {
            addCriterion("VERSION_EX_KEY <", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYLessThanOrEqualTo(Short value) {
            addCriterion("VERSION_EX_KEY <=", value, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYIn(List<Short> values) {
            addCriterion("VERSION_EX_KEY in", values, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYNotIn(List<Short> values) {
            addCriterion("VERSION_EX_KEY not in", values, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYBetween(Short value1, Short value2) {
            addCriterion("VERSION_EX_KEY between", value1, value2, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andVERSION_EX_KEYNotBetween(Short value1, Short value2) {
            addCriterion("VERSION_EX_KEY not between", value1, value2, "VERSION_EX_KEY");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEIsNull() {
            addCriterion("LGCL_CD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEIsNotNull() {
            addCriterion("LGCL_CD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEEqualTo(String value) {
            addCriterion("LGCL_CD_NAME =", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMENotEqualTo(String value) {
            addCriterion("LGCL_CD_NAME <>", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEGreaterThan(String value) {
            addCriterion("LGCL_CD_NAME >", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LGCL_CD_NAME >=", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMELessThan(String value) {
            addCriterion("LGCL_CD_NAME <", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMELessThanOrEqualTo(String value) {
            addCriterion("LGCL_CD_NAME <=", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMELike(String value) {
            addCriterion("LGCL_CD_NAME like", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMENotLike(String value) {
            addCriterion("LGCL_CD_NAME not like", value, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEIn(List<String> values) {
            addCriterion("LGCL_CD_NAME in", values, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMENotIn(List<String> values) {
            addCriterion("LGCL_CD_NAME not in", values, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMEBetween(String value1, String value2) {
            addCriterion("LGCL_CD_NAME between", value1, value2, "LGCL_CD_NAME");
            return (Criteria) this;
        }

        public Criteria andLGCL_CD_NAMENotBetween(String value1, String value2) {
            addCriterion("LGCL_CD_NAME not between", value1, value2, "LGCL_CD_NAME");
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