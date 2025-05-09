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
public class ProXEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_project", nullable = false, foreignKey = @ForeignKey(name = "FK_proxemp_project"))
    private Project project;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false, foreignKey = @ForeignKey(name = "FK_proxemp_employee"))
    private Employee employee;
}