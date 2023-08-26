package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

public class OrderService {

    @Autowired
    static OrderRepository orderRepository;
    public static Order getOrdersLeftAfterGivenTimeByPartnerId(Integer countOfOrders, HttpStatus httpStatus) {

        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(countOfOrders,httpStatus);
    }

    public Order addOrder(String newOrderAddedSuccessfully, HttpStatus httpStatus) {

        return orderRepository.addOrder(newOrderAddedSuccessfully,httpStatus);

    }

    public Order addPartner(String newDeliveryPartnerAddedSuccessfully, HttpStatus httpStatus) {

        return orderRepository.addPartner(newDeliveryPartnerAddedSuccessfully,httpStatus);
    }

    public Order addOrderPartnerPair(String s, HttpStatus httpStatus) {
        return orderRepository.addPartnerPair(s,httpStatus);
    }

    public Order getOrderById(Order order, HttpStatus httpStatus) {
        return orderRepository.getOrderById(order,httpStatus);
    }

    public Order deleteOrderById(String s, HttpStatus httpStatus) {
        return OrderRepository.deleteOrderById(s,httpStatus);
    }

    public Order deletePartnerById(String s, HttpStatus httpStatus) {
        return OrderRepository.deletePartnerById(s,httpStatus);
    }

    public Order getLastDeliveryTimeByPartnerId(String time, HttpStatus httpStatus) {
        return OrderRepository.getLastDeliveryTimeByPartnerId(time,httpStatus);
    }

    public Order getCountOfUnassignedOrders(Integer countOfOrders, HttpStatus httpStatus) {
        return OrderRepository.getCountOfUnassignedOrders(countOfOrders,httpStatus);
    }

    public Order getAllOrders(List<String> orders, HttpStatus httpStatus) {

        return OrderRepository.getAllOrders(orders,httpStatus);
    }

    public Order getOrdersByPartnerId(List<String> orders, HttpStatus httpStatus) {
        return OrderRepository.getOrdersByPartnerId(orders,httpStatus);
    }

    public Order getOrderCountByPartnerId(Integer orderCount, HttpStatus httpStatus) {
        return OrderRepository.getOrderCountByPartnerId(orderCount,httpStatus);
    }

    public Order getPartnerById(DeliveryPartner deliveryPartner, HttpStatus httpStatus) {
        return OrderRepository.getPartnerById(deliveryPartner,httpStatus);
    }
}
