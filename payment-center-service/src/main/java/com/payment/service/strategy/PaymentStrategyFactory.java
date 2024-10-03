package com.payment.service.strategy;

import com.payment.enums.PaymentServiceBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Heaven
 * @date 2024/9/19 13:06
 */
@Component
public class PaymentStrategyFactory {


    @Autowired
    private Map<String, AbstractPaymentStrategy> paymentStrategyMap;

    public AbstractPaymentStrategy getPaymentStrategy(Integer paymentChannel) {
        return paymentStrategyMap.get(PaymentServiceBeanEnum.getName(paymentChannel));
    }
}
