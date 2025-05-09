package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Category;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iCategoryRepository extends iGenericRepository<Category, UUID>{
    // JPA
    public Category findByIdCategory(UUID idCategory);

    // Hybrid Query
    @Query("SELECT c FROM Category c WHERE c.name = :name")
    public Category findByNameHybridQuery(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM category WHERE name = :name")
    public Category findByNameNativeQuery(String name);
}
