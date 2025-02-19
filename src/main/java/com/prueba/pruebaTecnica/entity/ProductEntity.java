package com.prueba.pruebaTecnica.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAccount;

    @Column (nullable = false)
    private String typeAccount;

    @Column (nullable = false, unique = true, lenght = 50)
    private String numAccount;

    @Column (nullable = false)
    private String statusAccount;

    @Column (nullable = false)
    private double balanceAccount;

    private boolean exentaGMF;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (nullable = false, updatable = false)
    private Date creationDate;

    @Temporal (TemporalType.TIMESTAMP)
    private Date modificationDate;

    //
    @ManyToOne
    @JoinColumn (name = "client_id", nullable = false)
    private Cliente clientEntity;
    //

    // Getters and Setters

    @PrePersist
    protected void onCreate(){
        this.creationDate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modificationDate = new Date ();
    }






}
