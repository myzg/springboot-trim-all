package com.myzg.springboot.component;

import com.myzg.springboot.dao.EmployeeServer;
import com.myzg.springboot.model.SQLUser;
import com.myzg.springboot.server.FindServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServerImpl implements UserDetailsService {


    private final EmployeeServer server;

    public UserDetailServerImpl(EmployeeServer server) {
        this.server = server;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();
        SQLUser user = server.findUserByName(s);
        if(user != null) {
            List<GrantedAuthority> user_authorities = new ArrayList<>();
            user_authorities.add(new SimpleGrantedAuthority(user.getUser_authority()));
            User sysuser = new User(user.getUser_name(), encoder.encode(user.getUser_password()), user_authorities);
            return sysuser;
        }
        throw new UsernameNotFoundException("User" + s + "not found");
    }
}
