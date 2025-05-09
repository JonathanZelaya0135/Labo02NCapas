package org.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEvaluation;

    @Column
    private String date;

    @Column
    private Float score;

    @Column
    private String comments;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false, foreignKey = @ForeignKey(name = "FK_evaluation_employee"))
    private Employee employee;
}