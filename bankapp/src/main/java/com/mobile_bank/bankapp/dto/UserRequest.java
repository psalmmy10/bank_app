package com.mobile_bank.bankapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

     @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private String otherName;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String stateOfOrigin;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumbReser;

    @Column(nullable = false)
    private String alternativePhoneNumber;

    @Column(nullable = false)
    private String Status;
}
