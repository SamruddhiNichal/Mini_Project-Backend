package com.miniProject01.miniproject.repository;

import com.miniProject01.miniproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);


}
