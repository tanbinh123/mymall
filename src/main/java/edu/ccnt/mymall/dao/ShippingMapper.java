package edu.ccnt.mymall.dao;

import edu.ccnt.mymall.model.Shipping;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int updateByPrimaryKey(Shipping record);
}