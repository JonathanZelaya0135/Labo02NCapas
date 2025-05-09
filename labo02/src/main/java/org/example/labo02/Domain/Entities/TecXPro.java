package org.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecXPro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_technology", nullable = false, foreignKey = @ForeignKey(name = "FK_tecxpro_technology"))
    private Technology technology;

    @ManyToOne
    @JoinColumn(name = "id_project", nullable = false, foreignKey = @ForeignKey(name = "FK_tecxpro_project"))
    private Project project;
}