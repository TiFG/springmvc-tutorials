package com.bytebeats.springmvc.ch1.controller;

import com.bytebeats.springmvc.ch1.domain.Order;
import com.bytebeats.springmvc.common.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-26 10:08
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    private AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Order create(@RequestBody String data){

        System.out.println("data:"+data);

        Order order = JsonUtils.fromJson(data, Order.class);
        order.setId(counter.getAndIncrement());

        return order;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Order create(@RequestBody Order oder){

        System.out.println("order:"+ oder);
        oder.setId(counter.getAndIncrement());

        return oder;
    }
}
