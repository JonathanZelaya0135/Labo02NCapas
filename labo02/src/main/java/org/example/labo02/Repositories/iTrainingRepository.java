package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Training;
import org.springframework.data.jpa.repository.Query;
import java.util.UUID;

@Transactional
public interface iTrainingRepository extends iGenericRepository<Training, Integer> {
    // JPA
    public Training findByIdTraining(UUID id);

    // Hybrid Query
    @Query("SELECT t FROM Training t WHERE t.idTraining = :id")
    public Training findByIdTrainingHybridQuery(UUID id);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM Training WHERE idTraining = :id")
    public Training findByIdTrainingNativeQuery(UUID id);
}