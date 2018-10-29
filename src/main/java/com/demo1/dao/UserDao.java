package com.demo1.dao;

import com.demo1.entiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, String> {

    User findByUsername(String username);
}
