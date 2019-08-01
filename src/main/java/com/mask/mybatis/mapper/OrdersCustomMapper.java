package com.mask.mybatis.mapper;

import com.mask.mybatis.entity.OrdersCustom;

import java.util.List;

/**
 * @author Mask
 */
public interface OrdersCustomMapper {
    public List<OrdersCustom> findOrdersUser() throws Exception;
}
