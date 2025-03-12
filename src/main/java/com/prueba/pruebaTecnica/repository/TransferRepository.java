package com.prueba.pruebaTecnica.repository;

import com.prueba.pruebaTecnica.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository <TransferEntity, Long>{

    //Busquedad de las transacciones por cuenta de origen
    List<TransferEntity> findByAccountOriginId (Long AccountOriginId);

    //Busquedad de transaccion por cuenta destino
    List<TransferEntity> findByAccountDestinationId (Long AccountDestinationId);

}
