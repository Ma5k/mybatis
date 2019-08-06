package com.mask.mybatis.mapper;

import com.mask.mybatis.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    public List<Orders> findOrdersAndOrderdetail() throws Exception;
}