package com.springboot.project.uber.uberApplication.Entities;

import com.springboot.project.uber.uberApplication.Entities.Enums.TransactionMethod;
import com.springboot.project.uber.uberApplication.Entities.Enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class WalletTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;
    // if the transaction is related to a ride then it will have the ride details else it will be null
    @OneToOne
    private RideEntity rideEntity;

    //if the transaction is related to a banking service then it will have a reciept number
    // or something like that
    private String bankTransId;

    @ManyToOne
    private WalletEntity wallet;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
