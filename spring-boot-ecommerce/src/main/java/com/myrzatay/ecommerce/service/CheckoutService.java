package com.myrzatay.ecommerce.service;

import com.myrzatay.ecommerce.dto.Purchase;
import com.myrzatay.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
