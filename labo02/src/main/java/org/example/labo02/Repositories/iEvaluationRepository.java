package org.example.labo02.Repositories;

import jakarta.transaction.Transactional;
import org.example.labo02.Domain.Entities.Evaluation;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iEvaluationRepository extends iGenericRepository<Evaluation, Integer> {
    // JPA
    public Evaluation findByIdEvaluation(UUID idEvaluation);

    // Hybrid Query
    @Query("SELECT e FROM Evaluation e WHERE e.score = :score")
    public Evaluation findByScoreHybridQuery(float score);

    // Native Query
    @Query(nativeQuery = true, value = "SELECT * FROM Evaluation WHERE score = :score")
    public Evaluation findByScoreNativeQuery(float score);
}
