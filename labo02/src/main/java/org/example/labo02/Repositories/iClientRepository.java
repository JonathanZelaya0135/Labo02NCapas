package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Client;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iClientRepository extends iGenericRepository<Client, UUID>{
    // JPA
    public Client findByIdClient(UUID idClient);

    // Hybrid Query
    @Query("SELECT c FROM Client c WHERE c.name = :name")
    public Client findByName(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM client WHERE email = :email")
    public Client findByEmail(String email);
}
