package com.myzg.springboot.dao;

import com.myzg.springboot.model.Employee;
import com.myzg.springboot.model.SQLUser;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeServer {

    Employee findEmployeeById(Integer emp_no);

    SQLUser findUserByName(String user_name);

}
