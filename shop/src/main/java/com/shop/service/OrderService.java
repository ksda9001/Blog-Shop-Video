package com.shop.service;

import com.commons.entity.Orders;

import java.util.List;

public interface OrderService {
    void createOrder(Orders order);

    List<Orders> getOrderListByUserId(Integer ordersUser);

    int cargoDel(String ordersNo);

    int mutilDelete(List<String> noList);

    Double getOrderPriceByNo(String x);

    Integer getUserIdByNo(String x);

    void setFinish(String ordersNo);

    void delAllFinish();
}
