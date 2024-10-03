package com.payment.service.strategy;

import com.payment.constants.PaymentServiceBeanConstants;
import com.payment.pojo.PaymentTransaction;
import org.springframework.stereotype.Service;

/**
 * @author Heaven
 * @date 2024/9/19 14:14
 */
@Service(PaymentServiceBeanConstants.PING_AN)
public class PingAnPayPaymentStrategy extends AbstractPaymentStrategy{


    @Override
    public String payment(PaymentTransaction transaction) {

        return null;
    }
}
