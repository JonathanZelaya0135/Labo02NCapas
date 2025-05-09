package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.Query;
import java.util.UUID;

@Transactional
public interface iEmployeeRepository extends iGenericRepository<Employee, Integer> {
    // JPA
    public Employee findByIdEmployee(UUID idEmployee);

    // Hybrid Query
    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    public Employee findByNameHybridQuery(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM Employee WHERE name = :name")
    public Employee findByNameNativeQuery(String name);
}