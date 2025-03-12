package com.prueba.pruebaTecnica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class TransferEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTransfer;

    @Column (nullable = false)
    private String typeTransfer;

    @Column (nullable = false)
    private double amount;

    @Column (nullable = false, updatable = false)
    public LocalDateTime transferDate;

    @ManyToOne
    @JoinColumn (name = "Account_origen_id")
    private ProductEntity OrigenAccount;

    @ManyToOne
    @JoinColumn (name = "Account_destination_id")
    private ProductEntity destinationAccount;

    // Getters and Setters

    @PrePersist
    protected void onCreate() {
        this.transferDate =  LocalDateTime.now();
    }

}
