package com.mask.mybatis.entity;

import lombok.Data;
import java.util.Date;
import java.util.List;

/**
 * @author Mask
 */
@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
    private List<OrderDetail> orderdetails;
}
