package com.mobile_bank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile_bank.bankapp.entity.User;

public interface UserRepository extends JpaRepository <User,Long> {
    
}
