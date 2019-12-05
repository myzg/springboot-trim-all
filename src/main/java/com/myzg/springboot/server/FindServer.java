package com.myzg.springboot.server;


import com.myzg.springboot.dao.EmployeeServer;
import com.myzg.springboot.model.Employee;
import com.myzg.springboot.model.SQLUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FindServer {

    @Autowired
    private EmployeeServer employeeserver;

    @Cacheable(value = "my-redis-cache1")
    @Transactional
    public Employee findServer(Integer emp_no) {
        System.out.println("缓存注解的方法被执行，本次没有缓存命中！！！！！--------------------------------");
        return employeeserver.findEmployeeById(emp_no);
    }

    @Transactional
    public SQLUser findUserByName(String user_name) {
        return employeeserver.findUserByName(user_name);
    }

}
