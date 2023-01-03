package com.greenart.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenart.firstproject.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    public Integer countByEmail(String eamil);
}