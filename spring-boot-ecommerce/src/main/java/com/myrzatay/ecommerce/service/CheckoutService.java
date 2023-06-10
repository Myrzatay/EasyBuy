package com.myrzatay.ecommerce.service;

import com.myrzatay.ecommerce.dto.PaymentInfo;
import com.myrzatay.ecommerce.dto.Purchase;
import com.myrzatay.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
