package edu.ccnt.mymall.dao;

import edu.ccnt.mymall.model.OrderItem;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbg.generated Wed Aug 02 21:00:02 CST 2017
     */
    int updateByPrimaryKey(OrderItem record);
}