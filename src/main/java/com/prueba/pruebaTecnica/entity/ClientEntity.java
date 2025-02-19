package com.prueba.pruebaTecnica.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class ClientEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String typeIdentification;

    @Column (nullable = false, unique = true)
    private String numIdentification;

    @Column (nullable = false, length = 50)
    private String name;

    @Column (nullable = false, length = 50)
    private String lastName;

    @Column (nullable = false, unique = true)
    private String email;

    @Temporal (TemporalType.DATE)
    @Column (nullable = false)
    private Date brithDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (nullable = false, unique = true)
    private Date creationDate;

    @Temporal (TemporalType.TIMESTAMP)
    private Date modificationDate;

    //Getters and Setters

    @PrePersist
    protected void onCreate() {
        this.creationDate = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.modificationDate = new Date();
    }

}
