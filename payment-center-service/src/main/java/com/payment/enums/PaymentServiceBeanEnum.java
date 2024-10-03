package com.payment.enums;

import java.util.Objects;

/**
 * @author Heaven
 * @date 2024/9/19 13:07
 */
public enum PaymentServiceBeanEnum {

    PING_AN(1, "pingAnPaymentStrategy", "平安");

    private Integer code;
    private String name;
    private String des;

    PaymentServiceBeanEnum(Integer code, String name, String des) {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static String getName(Integer code) {
        for (PaymentServiceBeanEnum paymentServiceBeanEnum : values()) {
            if (Objects.equals(paymentServiceBeanEnum.getCode(), code)) {
                return paymentServiceBeanEnum.getName();
            }
        }
        return null;
    }
}
