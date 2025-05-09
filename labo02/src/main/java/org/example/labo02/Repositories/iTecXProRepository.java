package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.TecXPro;
import org.springframework.data.jpa.repository.Query;
import java.util.UUID;

@Transactional
public interface iTecXProRepository extends iGenericRepository<TecXPro, Integer> {
    // JPA
    public TecXPro findById(UUID id);

    // Hybrid Query
    @Query("SELECT t FROM TecXPro t WHERE t.id = :id")
    public TecXPro findByIdHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM TecXPro WHERE id = :id")
    public TecXPro findByIdNativeQuery(UUID id);
}
