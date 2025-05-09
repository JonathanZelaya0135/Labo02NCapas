package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Evaluation;
import org.example.labo02.Domain.Entities.Project;
import org.springframework.data.jpa.repository.Query;
import java.util.UUID;

@Transactional
public interface iProjectRepository extends iGenericRepository<Project, Integer> {
    // JPA
    public Project findByIdProject(UUID idProject);

    // Hybrid Query
    @Query("SELECT p FROM Project p WHERE p.name = :name")
    public Project findByNameHybridQuery(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM project WHERE name = :name")
    public Evaluation findByNameNativeQuery(String name);
}
