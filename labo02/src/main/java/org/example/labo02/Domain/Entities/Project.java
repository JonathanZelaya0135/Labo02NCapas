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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProject;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false, foreignKey = @ForeignKey(name = "FK_project_area"))
    private Area area;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false, foreignKey = @ForeignKey(name = "FK_project_employee_leader"))
    private Employee leader;

    @OneToMany(mappedBy = "project")
    private List<ProXEmp> projectEmployees;

    @OneToMany(mappedBy = "project")
    private List<TecXPro> projectTechnologies;

    @OneToMany(mappedBy = "project")
    private List<ClieXPro> projectClients;
}