package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.TraXEmp;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iTraXEmpRepository extends iGenericRepository<TraXEmp, Integer> {
    // JPA
    public TraXEmp findById(UUID id);

    // Hybrid Query
    @Query("SELECT t FROM TraXEmp t WHERE t.id = :id")
    public TraXEmp findByIdHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM TraXEmp WHERE id = :id")
    public TraXEmp findByIdNativeQuery(UUID id);
}