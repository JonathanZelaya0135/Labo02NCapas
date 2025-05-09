package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Area;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iAreaRepository extends iGenericRepository<Area, UUID> {
    // JPA
    public Area findByIdArea(UUID idArea);

    // Hybrid Query
    @Query("SELECT a FROM Area a WHERE a.name = :name")
    public Area findByName(String name);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM area WHERE price = :price")
    public Area findByPrice(Float price);
}
