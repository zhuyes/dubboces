package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.People;
import com.dubbo.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuyeshen
 * @version 1.0
 * @date 2020/5/23 9:37
 */
@RestController
public class PeopleController {

    @Reference
    private PeopleService peopleService;

    @RequestMapping(value = "/getpeople")
    public String getPeople() {
        People people = new People();
        people.setName("zys");
        return peopleService.getPeople(people);
    }

}
