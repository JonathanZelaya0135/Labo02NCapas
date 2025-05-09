package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Department;
import org.springframework.data.jpa.repository.Query;

@Transactional
public interface iDepartmentRepository extends iGenericRepository<Department, Integer> {
    // JPA
    public Department findByIdDepartment(Integer idDepartment);

    // Hybrid Query
    @Query("SELECT d FROM Department d WHERE d.name = :name")
    public Department findByNameHybridQuery(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM department WHERE name = :name")
    public Department findByNameNativeQuery(String name);
}
