package com.mask.mybatis.mapper;

import com.mask.mybatis.entity.Orders;
import com.mask.mybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    public List<Orders> findOrdersUser() throws Exception;

    public List<Orders> findOrdersAndOrderdetail() throws Exception;

    public List<User> findUserAndItems()throws Exception;
}