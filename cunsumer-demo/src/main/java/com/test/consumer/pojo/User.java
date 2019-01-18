package com.test.consumer.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class User {


    private Integer id; //主键id

    private String userName; //用户名

    private String password; //密码

    private String name; //姓名

    private Integer age; //年龄

    private Date birthday;// 出生日期

    private Date created;// 创建时间

    private Date updated;// 更新时间

}
