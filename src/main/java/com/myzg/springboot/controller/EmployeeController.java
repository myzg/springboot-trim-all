package com.myzg.springboot.controller;


import com.myzg.springboot.component.UserDetailServerImpl;
import com.myzg.springboot.model.Employee;
import com.myzg.springboot.server.FindServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private FindServer findServer;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Employee find(@RequestParam("emp_no") Integer emp_no) {
        logger.info(emp_no.toString());
        return findServer.findServer(emp_no);
    }

}
