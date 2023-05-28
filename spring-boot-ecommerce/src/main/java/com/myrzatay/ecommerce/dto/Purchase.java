package com.myrzatay.ecommerce.dto;

import com.myrzatay.ecommerce.entity.Address;
import com.myrzatay.ecommerce.entity.Customer;
import com.myrzatay.ecommerce.entity.Order;
import com.myrzatay.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
