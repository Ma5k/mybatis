package com.mask.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Mask
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
