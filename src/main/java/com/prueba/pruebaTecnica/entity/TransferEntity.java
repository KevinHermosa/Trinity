package com.prueba.pruebaTecnica.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class TransferEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTransfer;

    @Column (nullable = false)
    private String typeTransfer;

    @Column (nullable = false)
    private double amount;

    @Temporal (TemporalType.TIMESTAMP)
    @Column (nullable = false, updatable = false)
    private Date transferDate;

    @ManyToOne
    @JoinColumn (name = "Account_origen_id")
    private ProductEntity OrigenAccount;

    @ManyToOne
    @JoinColumn (name = "Account_destination_id")
    private ProductEntity destinationAccount;

    // Getters and Setters

    @PrePersist
    protected void onCreate() {
        this.transferDate = new date();

    }

}
