package com.Goularte.userDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Goularte.userDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

} 
