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
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTraining;

    @Column
    private String topic;

    @Column
    private String date;

    @Column
    private Integer duration;

    @OneToMany(mappedBy = "training")
    private List<TraXEmp> trainingEmployees;
}