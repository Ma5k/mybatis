package com.mask.mybatis;

import com.mask.mybatis.entity.Orders;
import com.mask.mybatis.mapper.OrdersCustomMapper;
import com.mask.mybatis.mapper.OrdersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
// 这块需要引入依赖 mybatis的测试依赖jar
@MybatisTest
// 这个注解的意义是指定了默认数据源
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MybatisApplicationTests {

    @Autowired
    OrdersCustomMapper ordersCustomMapper;

    @Autowired
    OrdersMapper ordersMapper;


    /**
     * 参考：
     * https://www.jianshu.com/p/ab3f2466855b
     * https://www.jianshu.com/p/55cec17ef503
     */
    @Test
    public void orderMapperTest() throws Exception {
        //resultType方式
//        List<OrdersCustom> ordersCustoms = ordersCustomMapper.findOrdersUser();
//        System.out.println(ordersCustoms.size());

//        List<Orders> ordersList = ordersMapper.findOrdersUser();
//        System.out.println(ordersList.size());

        List<Orders> ordersList = ordersMapper.findOrdersAndOrderdetail();
        System.out.println(ordersList);
    }
}
