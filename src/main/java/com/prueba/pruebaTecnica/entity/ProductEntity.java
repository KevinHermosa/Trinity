package com.prueba.pruebaTecnica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAccount;

    @Column (nullable = false)
    private String typeAccount;

    @Column (nullable = false, unique = true, length = 50)
    private String numAccount;

    @Column (nullable = false)
    private String statusAccount;

    @Column (nullable = false)
    private double balanceAccount;

    private boolean exentaGmf;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (nullable = false, updatable = false)
    private Date creationDate;

    @Temporal (TemporalType.TIMESTAMP)
    private Date modificationDate;

    @ManyToOne
    @JoinColumn (name = "client_id", nullable = false)
    private ClientEntity clientEntity;

    @PrePersist
    protected void onCreate(){
        this.creationDate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modificationDate = new Date ();
    }

}
