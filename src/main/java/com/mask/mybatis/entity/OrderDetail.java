package com.mask.mybatis.entity;

import lombok.Data;

/**
 * @author Mask
 */
@Data
public class OrderDetail {

    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;

}
