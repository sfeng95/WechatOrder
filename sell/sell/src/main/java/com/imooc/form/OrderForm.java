package com.imooc.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * created by jiangzuole on 2019/4/2 0002.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderForm {

    @NotEmpty(message = "姓名")
    private String name;

    @NotEmpty(message = "电话")
    private String phone;

    @NotEmpty(message = "地址")
    private String address;

    @NotEmpty(message = "买家微信openId")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;

}
