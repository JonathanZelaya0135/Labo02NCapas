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
    private String code;

    @Column
    private String name;

    @OneToMany(mappedBy = "project")
    private List<TecXPro> techList;

    @OneToMany(mappedBy = "project")
    private List<ProXEmp> empList;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false, foreignKey = @ForeignKey(name = "FK_project_area"))
    private Area area;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false, foreignKey = @ForeignKey(name = "FK_project_client"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_leader", nullable = false, foreignKey = @ForeignKey(name = "FK_project_employee"))
    private Employee employee;

}