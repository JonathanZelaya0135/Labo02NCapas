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
public class ClieXPro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false, foreignKey = @ForeignKey(name = "FK_cliexpro_client"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_project", nullable = false, foreignKey = @ForeignKey(name = "FK_cliexpro_project"))
    private Project project;
}