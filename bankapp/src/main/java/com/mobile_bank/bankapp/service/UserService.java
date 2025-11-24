package com.mobile_bank.bankapp.service;

import com.mobile_bank.bankapp.dto.BankResponse;
import com.mobile_bank.bankapp.dto.UserRequest;

public interface UserService  {
    BankResponse createAccount(UserRequest userRequest);
}
