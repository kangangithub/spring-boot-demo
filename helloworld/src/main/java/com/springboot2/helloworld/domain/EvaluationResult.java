package com.springboot2.helloworld.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class EvaluationResult implements Serializable {
    /**
     *
     * 表 : znbx_evaluation_result
     * 对应字段 : id
     */
    private Integer id;

    /**
     * 整体风险
     * 表 : znbx_evaluation_result
     * 对应字段 : over_all
     */
    private String overAll;

    /**
     * 整体风险文案
     * 表 : znbx_evaluation_result
     * 对应字段 : risk_write
     */
    private String riskWrite;

    /**
     * 险种分类:重疾险
     * 表 : znbx_evaluation_result
     * 对应字段 : product_type_1
     */
    private String productType1;

    /**
     * 产品编码
     * 表 : znbx_evaluation_result
     * 对应字段 : product_code_1
     */
    private String productCode1;

    /**
     * 产品文案
     * 表 : znbx_evaluation_result
     * 对应字段 : copy_write_1
     */
    private String copyWrite1;

    /**
     * 险种分类:医疗险
     * 表 : znbx_evaluation_result
     * 对应字段 : product_type_2
     */
    private String productType2;

    /**
     * 产品编码
     * 表 : znbx_evaluation_result
     * 对应字段 : product_code_2
     */
    private String productCode2;

    /**
     * 产品文案
     * 表 : znbx_evaluation_result
     * 对应字段 : copy_write_2
     */
    private String copyWrite2;

    /**
     * 险种分类:意外险
     * 表 : znbx_evaluation_result
     * 对应字段 : product_type_3
     */
    private String productType3;

    /**
     * 产品编码
     * 表 : znbx_evaluation_result
     * 对应字段 : product_code_3
     */
    private String productCode3;

    /**
     * 产品文案
     * 表 : znbx_evaluation_result
     * 对应字段 : copy_write_3
     */
    private String copyWrite3;

    /**
     * 评测人姓名
     * 表 : znbx_evaluation_result
     * 对应字段 : evaluation_person
     */
    private String evaluationPerson;

    /**
     * 代理人编码
     * 表 : znbx_evaluation_result
     * 对应字段 : agent_code
     */
    private String agentCode;

    /**
     * 评测时间
     * 表 : znbx_evaluation_result
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table znbx_evaluation_result
     *
     * @MBG Generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method
     *
     * @return znbx_evaluation_result.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * set method
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.over_all：整体风险
     */
    public String getOverAll() {
        return overAll;
    }

    /**
     * set method
     *
     * @param overAll  整体风险
     */
    public void setOverAll(String overAll) {
        this.overAll = overAll == null ? null : overAll.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.risk_write：整体风险文案
     */
    public String getRiskWrite() {
        return riskWrite;
    }

    /**
     * set method
     *
     * @param riskWrite  整体风险文案
     */
    public void setRiskWrite(String riskWrite) {
        this.riskWrite = riskWrite == null ? null : riskWrite.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_type_1：险种分类:重疾险
     */
    public String getProductType1() {
        return productType1;
    }

    /**
     * set method
     *
     * @param productType1  险种分类:重疾险
     */
    public void setProductType1(String productType1) {
        this.productType1 = productType1 == null ? null : productType1.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_code_1：产品编码
     */
    public String getProductCode1() {
        return productCode1;
    }

    /**
     * set method
     *
     * @param productCode1  产品编码
     */
    public void setProductCode1(String productCode1) {
        this.productCode1 = productCode1 == null ? null : productCode1.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.copy_write_1：产品文案
     */
    public String getCopyWrite1() {
        return copyWrite1;
    }

    /**
     * set method
     *
     * @param copyWrite1  产品文案
     */
    public void setCopyWrite1(String copyWrite1) {
        this.copyWrite1 = copyWrite1 == null ? null : copyWrite1.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_type_2：险种分类:医疗险
     */
    public String getProductType2() {
        return productType2;
    }

    /**
     * set method
     *
     * @param productType2  险种分类:医疗险
     */
    public void setProductType2(String productType2) {
        this.productType2 = productType2 == null ? null : productType2.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_code_2：产品编码
     */
    public String getProductCode2() {
        return productCode2;
    }

    /**
     * set method
     *
     * @param productCode2  产品编码
     */
    public void setProductCode2(String productCode2) {
        this.productCode2 = productCode2 == null ? null : productCode2.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.copy_write_2：产品文案
     */
    public String getCopyWrite2() {
        return copyWrite2;
    }

    /**
     * set method
     *
     * @param copyWrite2  产品文案
     */
    public void setCopyWrite2(String copyWrite2) {
        this.copyWrite2 = copyWrite2 == null ? null : copyWrite2.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_type_3：险种分类:意外险
     */
    public String getProductType3() {
        return productType3;
    }

    /**
     * set method
     *
     * @param productType3  险种分类:意外险
     */
    public void setProductType3(String productType3) {
        this.productType3 = productType3 == null ? null : productType3.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.product_code_3：产品编码
     */
    public String getProductCode3() {
        return productCode3;
    }

    /**
     * set method
     *
     * @param productCode3  产品编码
     */
    public void setProductCode3(String productCode3) {
        this.productCode3 = productCode3 == null ? null : productCode3.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.copy_write_3：产品文案
     */
    public String getCopyWrite3() {
        return copyWrite3;
    }

    /**
     * set method
     *
     * @param copyWrite3  产品文案
     */
    public void setCopyWrite3(String copyWrite3) {
        this.copyWrite3 = copyWrite3 == null ? null : copyWrite3.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.evaluation_person：评测人姓名
     */
    public String getEvaluationPerson() {
        return evaluationPerson;
    }

    /**
     * set method
     *
     * @param evaluationPerson  评测人姓名
     */
    public void setEvaluationPerson(String evaluationPerson) {
        this.evaluationPerson = evaluationPerson == null ? null : evaluationPerson.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.agent_code：代理人编码
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * set method
     *
     * @param agentCode  代理人编码
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    /**
     * get method
     *
     * @return znbx_evaluation_result.create_time：评测时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * set method
     *
     * @param createTime  评测时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "EvaluationResult{" +
                "id=" + id +
                ", overAll='" + overAll + '\'' +
                ", riskWrite='" + riskWrite + '\'' +
                ", productType1='" + productType1 + '\'' +
                ", productCode1='" + productCode1 + '\'' +
                ", copyWrite1='" + copyWrite1 + '\'' +
                ", productType2='" + productType2 + '\'' +
                ", productCode2='" + productCode2 + '\'' +
                ", copyWrite2='" + copyWrite2 + '\'' +
                ", productType3='" + productType3 + '\'' +
                ", productCode3='" + productCode3 + '\'' +
                ", copyWrite3='" + copyWrite3 + '\'' +
                ", evaluationPerson='" + evaluationPerson + '\'' +
                ", agentCode='" + agentCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}