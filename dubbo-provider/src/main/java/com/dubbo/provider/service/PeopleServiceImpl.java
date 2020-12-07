package com.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.dubbo.entity.People;
import com.dubbo.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author zhuyeshen
 * @version 1.0
 * @date 2020/5/23 9:35
 */
@Service
@Component
public class PeopleServiceImpl implements PeopleService {
    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);

    /**
     * 这个方法的作用是接收传过来的People实体，将其ID赋为随机数
     */
    @Override
    public String getPeople(People people) {
        people.setId(new Random().nextInt(10000));
        System.out.println("People:{},ID:{}" + people.getName() + ":" + people.getId());
        return JSON.toJSONString(people);
    }

}

