package edu.ccnt.mymall.model;

import java.util.Date;

public class PayInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.user_id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.order_no
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.pay_platform
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Integer payPlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.platform_number
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private String platformNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.platform_status
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private String platformStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.create_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.update_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.id
     *
     * @return the value of mmall_pay_info.id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.id
     *
     * @param id the value for mmall_pay_info.id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.user_id
     *
     * @return the value of mmall_pay_info.user_id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.user_id
     *
     * @param userId the value for mmall_pay_info.user_id
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.order_no
     *
     * @return the value of mmall_pay_info.order_no
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.order_no
     *
     * @param orderNo the value for mmall_pay_info.order_no
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.pay_platform
     *
     * @return the value of mmall_pay_info.pay_platform
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Integer getPayPlatform() {
        return payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.pay_platform
     *
     * @param payPlatform the value for mmall_pay_info.pay_platform
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.platform_number
     *
     * @return the value of mmall_pay_info.platform_number
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.platform_number
     *
     * @param platformNumber the value for mmall_pay_info.platform_number
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber == null ? null : platformNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.platform_status
     *
     * @return the value of mmall_pay_info.platform_status
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.platform_status
     *
     * @param platformStatus the value for mmall_pay_info.platform_status
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus == null ? null : platformStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.create_time
     *
     * @return the value of mmall_pay_info.create_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.create_time
     *
     * @param createTime the value for mmall_pay_info.create_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.update_time
     *
     * @return the value of mmall_pay_info.update_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.update_time
     *
     * @param updateTime the value for mmall_pay_info.update_time
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}