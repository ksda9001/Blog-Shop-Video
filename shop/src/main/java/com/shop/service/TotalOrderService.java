package com.shop.service;

import com.commons.entity.TotalOrders;
import com.commons.entity.Users;

import java.util.List;
import java.util.Map;

public interface TotalOrderService {

    void addTotalOrders(TotalOrders totalOrders);

    void updateOrderStateToPaySuccess(String orderNo);

    List<TotalOrders> selectNSearch(Map<String, Object> search);

    int mutilcargoControlFin(List<String> noList);

    int cargoControlDel(String id);

    int cargoControlFin(String id);

    int mutilcargoControlDel(List<String> noList);
}
