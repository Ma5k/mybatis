package com.mask.mybatis.entity;

import lombok.Data;

/**
 * @author Mask
 */
@Data
public class OrdersCustom extends Orders {
    private String username;
    private String address;
    private String sex;
}
