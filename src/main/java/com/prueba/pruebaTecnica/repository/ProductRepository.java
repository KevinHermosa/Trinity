package com.prueba.pruebaTecnica.repository;

import com.prueba.pruebaTecnica.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity, Long>  {

    //Buscar una cuenta por numero de cuenta
    Optional<ProductEntity> findByNumAccount (String numAccount);

    //Buscar todas las cuentas de un cliente especifico
    List<ProductEntity> findByClientId(Long clienteId);

}
