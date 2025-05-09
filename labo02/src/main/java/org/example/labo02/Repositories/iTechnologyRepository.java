package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.ProXEmp;
import org.example.labo02.Domain.Entities.Technology;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iTechnologyRepository extends iGenericRepository<Technology, Integer> {
    // JPA
    public Technology findByIdTechnology(UUID id);

    // Hybrid Query
    @Query("SELECT t FROM Technology t WHERE t.idTechnology = :id")
    public Technology findByIdTechnologyHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM Technology WHERE id = :id")
    public ProXEmp findByIdTechnologyNativeQuery(UUID id);
}
