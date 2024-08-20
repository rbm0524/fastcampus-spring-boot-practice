package com.fastcampus.springbootpractice.controller;

import com.fastcampus.springbootpractice.Service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final SortService sortService;

    public Controller(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {

        return sortService.doSort(list).toString();
    }


}
