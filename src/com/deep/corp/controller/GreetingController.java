package com.deep.corp.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deep.corp.bean.DummyUser;
import com.deep.corp.bean.Greeting;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private Integer num=1;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	num=num+2;
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name),num);
    }
    
    @RequestMapping("/dummy/{id}")
    public DummyUser getDummyVal(@PathVariable String id) {
    	return new DummyUser(id,"pass@123");        
    }
}