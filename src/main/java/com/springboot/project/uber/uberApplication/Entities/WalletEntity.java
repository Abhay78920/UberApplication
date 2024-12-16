package com.springboot.project.uber.uberApplication.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class WalletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransactionEntity> walletTransactionEntityList;
}
