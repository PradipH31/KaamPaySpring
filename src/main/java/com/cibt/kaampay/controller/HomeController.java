/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.kaampay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public String index() {
        return "index";
    }

    @GetMapping(value = "/test")
    public void test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(request.getRemoteAddr());
        response.getWriter().println("asdas");
    }

    @GetMapping(value = "/about")
    @ResponseBody
    public String about() {
        return "<h1>About Us</h1>";
    }
}
