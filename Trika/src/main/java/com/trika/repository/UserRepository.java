package com.trika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trika.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
