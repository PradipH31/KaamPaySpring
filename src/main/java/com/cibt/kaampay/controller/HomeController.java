/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.kaampay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP B&O
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    @GetMapping
    @ResponseBody
    public String index(){
        return "Hello World";
    }
    
    @GetMapping(value = "/about")
    @ResponseBody
    public String about(){
        return "<h1>About Us</h1>";
    }
}