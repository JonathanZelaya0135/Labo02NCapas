package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.ProXEmp;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iProXEmpRepository extends iGenericRepository<ProXEmp, Integer> {
    // JPA
    public ProXEmp findById(UUID id);

    // Hybrid Query
    @Query("SELECT p FROM ProXEmp p WHERE p.id = :id")
    public ProXEmp findByIdHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM ProXEmp WHERE id = :id")
    public ProXEmp findByIdNativeQuery(UUID id);
}
