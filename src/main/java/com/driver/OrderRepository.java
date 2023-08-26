package com.driver;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {
    
    
   static Map<Integer,Order> db = new HashMap<>();

    public static boolean deleteOrderById(String s, HttpStatus httpStatus) {
        return db.remove(s,httpStatus);

    }

    public static boolean deletePartnerById(String s, HttpStatus httpStatus) {
        return db.remove(s,httpStatus);
    }

    public static Order getLastDeliveryTimeByPartnerId(String time, HttpStatus httpStatus) {
        return db.get(time);
    }

    public static Order getCountOfUnassignedOrders(Integer countOfOrders, HttpStatus httpStatus) {
        return db.get(countOfOrders);
    }

    public static Order getAllOrders(List<String> orders, HttpStatus httpStatus) {
        return db.get(orders);
    }

    public static Order getOrdersByPartnerId(List<String> orders, HttpStatus httpStatus) {
        return db.get(orders);
    }

    public static Order getOrderCountByPartnerId(Integer orderCount, HttpStatus httpStatus) {
        return db.get(orderCount);
    }

    public static Order getPartnerById(DeliveryPartner deliveryPartner, HttpStatus httpStatus) {
        return db.get(deliveryPartner);
    }

    public Order getOrdersLeftAfterGivenTimeByPartnerId(Integer countOfOrders, HttpStatus httpStatus) {
        return db.get(countOfOrders);         //httpstatus 

    }

//    public Order addPartner(String newDeliveryPartnerAddedSuccessfully, HttpStatus httpStatus) {
//        return db.put(Order.addPartner(),new addPartner());
//    }

//    public Order addOrder(String newOrderAddedSuccessfully, HttpStatus httpStatus) {
//        OrderRepository order = null;
//        return db.put(order.addOrder(),new Order());
//
//    }

//    public Order addPartnerPair(String s, HttpStatus httpStatus) {
//        OrderRepository order = null;
//        return db.put(order.addPartnerPair(s,httpStatus),new addPartnerPair());
//
//    }

    public Order getOrderById(Order order, HttpStatus httpStatus) {
        return db.get(order);
    }

//    public Order addOrder(String newOrderAddedSuccessfully, HttpStatus httpStatus) {
//        return db.put(addOrder(),httpStatus);   //errp
//    }
}
