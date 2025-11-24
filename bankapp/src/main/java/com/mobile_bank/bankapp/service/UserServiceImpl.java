package com.mobile_bank.bankapp.service;


import java.math.BigDecimal;

import com.mobile_bank.bankapp.dto.BankResponse;
import com.mobile_bank.bankapp.dto.UserRequest;
import com.mobile_bank.bankapp.entity.User;
import com.mobile_bank.bankapp.utils.Accountutils;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        User newUser = User.builder()
            .firstName(userRequest.getFirstName())
            .lastName(userRequest.getLastName())
            .otherName(userRequest.getOtherName())
            .gender(userRequest.getGender())
            .address(userRequest.getAddress())
            .stateOfOrigin(userRequest.getStateOfOrigin())
            .accountNumber(Accountutils.generateAccountNumber())
            .email(userRequest.getEmail())
            // .accountBalance(BigDecimal.ZERO)
            // .accountBalance(BigDecimal.ZERO)
            .accountBalance(BigDecimal.ZERO)
            .email(userRequest.getEmail())

            
            .build();
    }

}
