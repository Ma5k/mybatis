package com.mask.mybatis.mapper;

import com.mask.mybatis.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mask
 */
@Repository
public interface OrderMapper {
    /**
     *  获取所有订单数据
     * @return
     */
    List<Orders> findOrders();

    /**
     * 根据id获取一个订单
     * @param id 订单编号
     * @return
     */
    Orders findOrderById(Integer id);
}
