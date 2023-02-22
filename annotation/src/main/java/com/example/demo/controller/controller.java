package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
     public List<pojoclass> info(){
    	 return Arrays.asList(new pojoclass(1,"asvanth,"IT"),)
     } 
}
