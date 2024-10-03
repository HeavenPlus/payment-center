package com.payment.service.strategy;


import com.payment.pojo.PaymentTransaction;

/**
 * @author Heaven
 * @date 2024/9/19 11:59
 */
public abstract class AbstractPaymentStrategy {

    public abstract String payment(PaymentTransaction transaction);
}
