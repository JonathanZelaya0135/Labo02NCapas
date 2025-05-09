package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.EmpXEmp;
import org.example.labo02.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iEmpXEmpRepository extends iGenericRepository<EmpXEmp, Integer> {
    // JPA
    public EmpXEmp findById(UUID id);

    // Hybrid Query
    @Query("SELECT e FROM EmpXEmp e WHERE e.id = :id")
    public EmpXEmp findByIdHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM EmpXEmp WHERE id = :id")
    public EmpXEmp findByIdNativeQuery(UUID id);
}