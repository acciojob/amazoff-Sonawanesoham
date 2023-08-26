package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;


    @PostMapping("/add-order")
    public Order addOrder(@RequestBody Order order){

        return orderService.addOrder("New order added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-partner/{partnerId}")
    public Order addPartner(@PathVariable String partnerId){

        return orderService.addPartner("New delivery partner added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/add-order-partner-pair")
    public Order addOrderPartnerPair(@RequestParam String orderId, @RequestParam String partnerId){

        //This is basically assigning that order to that partnerId
        return orderService.addOrderPartnerPair("New order-partner pair added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get-order-by-id/{orderId}")
    public Order getOrderById(@PathVariable String orderId){

        Order order= null;
        //order should be returned with an orderId.

        return orderService.getOrderById(order, HttpStatus.CREATED);
    }

    @GetMapping("/get-partner-by-id/{partnerId}")
    public Order getPartnerById(@PathVariable String partnerId){

        DeliveryPartner deliveryPartner = null;

        //deliveryPartner should contain the value given by partnerId

        return orderService.getPartnerById(deliveryPartner, HttpStatus.CREATED);
    }

    @GetMapping("/get-order-count-by-partner-id/{partnerId}")
    public Order getOrderCountByPartnerId(@PathVariable String partnerId){

        Integer orderCount = 0;

        //orderCount should denote the orders given by a partner-id

        return orderService.getOrderCountByPartnerId(orderCount, HttpStatus.CREATED);
    }

    @GetMapping("/get-orders-by-partner-id/{partnerId}")
    public Order getOrdersByPartnerId(@PathVariable String partnerId){
        List<String> orders = null;

        //orders should contain a list of orders by PartnerId

        return orderService.getOrdersByPartnerId(orders, HttpStatus.CREATED);
    }

    @GetMapping("/get-all-orders")
    public Order getAllOrders(){
        List<String> orders = null;

        //Get all orders
        return orderService.getAllOrders(orders, HttpStatus.CREATED);
    }

    @GetMapping("/get-count-of-unassigned-orders")
    public Order getCountOfUnassignedOrders(){
        Integer countOfOrders = 0;

        //Count of orders that have not been assigned to any DeliveryPartner

        return orderService.getCountOfUnassignedOrders(countOfOrders, HttpStatus.CREATED);
    }

    @GetMapping("/get-count-of-orders-left-after-given-time/{partnerId}")
    public Order getOrdersLeftAfterGivenTimeByPartnerId(@PathVariable String time, @PathVariable String partnerId){

        Integer countOfOrders = 0;

        //countOfOrders that are left after a particular time of a DeliveryPartner

        return OrderService.getOrdersLeftAfterGivenTimeByPartnerId(countOfOrders, HttpStatus.CREATED);
    }

    @GetMapping("/get-last-delivery-time/{partnerId}")
    public Order getLastDeliveryTimeByPartnerId(@PathVariable String partnerId){
        String time = null;

        //Return the time when that partnerId will deliver his last delivery order.

        return orderService.getLastDeliveryTimeByPartnerId(time, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-partner-by-id/{partnerId}")
    public Order deletePartnerById(@PathVariable String partnerId){

        //Delete the partnerId
        //And push all his assigned orders to unassigned orders.

        return orderService.deletePartnerById(partnerId + " removed successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-order-by-id/{orderId}")
    public Order deleteOrderById(@PathVariable String orderId){

        //Delete an order and also
        // remove it from the assigned order of that partnerId

        return orderService.deleteOrderById(orderId + " removed successfully", HttpStatus.CREATED);
    }
}