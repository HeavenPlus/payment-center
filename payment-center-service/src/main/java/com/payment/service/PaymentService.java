package com.payment.service;

import com.payment.pojo.PaymentTransaction;
import com.payment.service.strategy.AbstractPaymentStrategy;
import com.payment.service.strategy.PaymentStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;

/**
 * @author Heaven
 * @date 2024/9/19 11:49
 */
@Service
public class PaymentService {

    @Autowired
    PaymentStrategyFactory paymentStrategyFactory;

    public void payment(PaymentTransaction transaction) {
        AbstractPaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy(transaction.getPaymentChannel());
        paymentStrategy.payment(transaction);
    }
}
