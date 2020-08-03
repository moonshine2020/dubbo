package com.mx.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mx.common.entity.People;
import com.mx.common.service.PeopleService;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author mengxu
 * @date 2020/7/7 20:27
 */
@Service(version = "1.0", interfaceClass = PeopleService.class)
@Component
public class PeopleServiceImpl implements PeopleService {

    /**
     * 这个方法的作用是接收传过来的People实体，将其ID赋为随机数
     */
    @Override
    public People getPeople(People people) {
        people.setId(new Random().nextInt(10000));
        System.out.println("provider do something!");
        return people;
    }
}
