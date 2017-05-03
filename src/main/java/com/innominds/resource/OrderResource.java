package com.innominds.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innominds.persistence.model.Order;

// This RefreshScope annotation will load latest properties at runtime
// @RefreshScope
@RestController
@RequestMapping( value = "/orders" )
public class OrderResource {

    @RequestMapping( method = RequestMethod.GET )
    public List<Order> getOrders() {
        return Arrays.asList( new Order( "OD-100" ), new Order( "OD-101" ), new Order( "OD-102" ), new Order( "OD-103" ), new Order( "OD-104" ) );
    }
}
