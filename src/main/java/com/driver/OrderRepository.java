package com.driver;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {
    
    
    Map<Integer,Order> db = new HashMap<>();

    public static Order deleteOrderById(String s, HttpStatus httpStatus) {
    }

    public static Order deletePartnerById(String s, HttpStatus httpStatus) {
    }

    public static Order getLastDeliveryTimeByPartnerId(String time, HttpStatus httpStatus) {
    }

    public static Order getCountOfUnassignedOrders(Integer countOfOrders, HttpStatus httpStatus) {
    }

    public static Order getAllOrders(List<String> orders, HttpStatus httpStatus) {
    }

    public static Order getOrdersByPartnerId(List<String> orders, HttpStatus httpStatus) {
    }

    public static Order getOrderCountByPartnerId(Integer orderCount, HttpStatus httpStatus) {
    }

    public static Order getPartnerById(DeliveryPartner deliveryPartner, HttpStatus httpStatus) {
    }

    public Order getOrdersLeftAfterGivenTimeByPartnerId(Integer countOfOrders, HttpStatus httpStatus) {
        return db.get(countOfOrders);         //httpstatus 

    }

    public Order addPartner(String newDeliveryPartnerAddedSuccessfully, HttpStatus httpStatus) {
        return db.put(new);
    }

    public Order addOrder(String newOrderAddedSuccessfully, HttpStatus httpStatus) {
    }

    public Order addPartnerPair(String s, HttpStatus httpStatus) {
    }

    public Order getOrderById(Order order, HttpStatus httpStatus) {
    }

//    public Order addOrder(String newOrderAddedSuccessfully, HttpStatus httpStatus) {
//        return db.put(addOrder(),httpStatus);   //errp
//    }
}
