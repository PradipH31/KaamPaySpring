/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.kaampay.controller;

import com.cibt.kaampay.entity.UserLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP B&O
 */
@Controller
@RequestMapping(value = "/logs")
public class UserLogController {

    @GetMapping
    @ResponseBody
    public UserLog index(@ModelAttribute("UseLog") UserLog log) {
        //Try in browser:localhost/logs?id=2&user.email="abc@abc.com"
        return log;
    }

}
