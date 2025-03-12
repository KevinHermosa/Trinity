package com.prueba.pruebaTecnica.repository;


import com.prueba.pruebaTecnica.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>  {


    //Buscar un cliente por su correo
    Optional<ClientEntity> findByEmail(String email);

    //Verifica si ya existe un cliente con cierto numero de id
    boolean existsNumIdentification (String numIdentification);
}
