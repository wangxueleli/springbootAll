package com.example.study.entity;

import java.util.Date;

public class SysLogDO {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.client_ip
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String clientIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.req_url
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String reqUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operator
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String method;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.param
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String param;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.req_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String reqTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.return_data
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private String returnData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */

    public String getClientIp() {
        return clientIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.client_ip
     *
     * @param clientIp the value for sys_log.client_ip
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.req_url
     *
     * @return the value of sys_log.req_url
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getReqUrl() {
        return reqUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.req_url
     *
     * @param reqUrl the value for sys_log.req_url
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl == null ? null : reqUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operator
     *
     * @return the value of sys_log.operator
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operator
     *
     * @param operator the value for sys_log.operator
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method
     *
     * @return the value of sys_log.method
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method
     *
     * @param method the value for sys_log.method
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.param
     *
     * @return the value of sys_log.param
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getParam() {
        return param;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.param
     *
     * @param param the value for sys_log.param
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.req_time
     *
     * @return the value of sys_log.req_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.req_time
     *
     * @param reqTime the value for sys_log.req_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.return_data
     *
     * @return the value of sys_log.return_data
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public String getReturnData() {
        return returnData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.return_data
     *
     * @param returnData the value for sys_log.return_data
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setReturnData(String returnData) {
        this.returnData = returnData == null ? null : returnData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_time
     *
     * @return the value of sys_log.create_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_time
     *
     * @param createTime the value for sys_log.create_time
     *
     * @mbggenerated Tue Jan 21 16:25:03 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}