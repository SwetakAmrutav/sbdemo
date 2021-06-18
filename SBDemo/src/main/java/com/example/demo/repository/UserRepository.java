package com.example.demo.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Id> {

}
