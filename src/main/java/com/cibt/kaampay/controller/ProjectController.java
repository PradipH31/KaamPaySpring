/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.kaampay.controller;

import com.cibt.kaampay.entity.Project;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP B&O
 */
@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @GetMapping
    public String index(Model model) throws Exception {
        List<Project> projects = new ArrayList<>();
        Project project = new Project();
        project.setId(1);
        project.setName("klasjf");
        project.setCreatedDate(new Date());
        project.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-07-12"));
        project.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-07-15"));
        project.setStatus(true);
        projects.add(project);
        model.addAttribute("projects", projects);
        return "admin/views/projects/index";
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public String detail(@PathVariable("id") int id) {
        return "" + id * 5;
    }

}
