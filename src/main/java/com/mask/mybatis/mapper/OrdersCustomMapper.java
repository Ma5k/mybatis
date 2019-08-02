package com.mask.mybatis.mapper;

import com.mask.mybatis.entity.OrdersCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mask
 */
@Repository
public interface OrdersCustomMapper {
    List<OrdersCustom> findOrdersUser() throws Exception;
}