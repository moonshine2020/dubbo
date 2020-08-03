package com.mx.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mx.common.entity.People;
import com.mx.common.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengxu
 * @date 2020/7/7 20:31
 */
@RestController
public class PeopleController {

    @Reference(version = "1.0")
    private PeopleService peopleService;

    @GetMapping("/people/{name}")
    public People getPeople(@PathVariable("name") String name) {
        People people = new People();
        people.setName(name);
        return peopleService.getPeople(people);
    }
}
