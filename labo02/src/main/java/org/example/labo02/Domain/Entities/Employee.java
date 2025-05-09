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
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmployee;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String entryDate;

    @Column
    private String position;

    @OneToMany(mappedBy = "employee")
    private List<Project> projectsList;

    @OneToMany(mappedBy = "mentee")
    private List<EmpXEmp> menteeList;

    @OneToMany(mappedBy = "employee")
    private List<ProXEmp> projectList;

    @OneToMany(mappedBy = "employee")
    private List<TraXEmp> trainingList;

    @OneToMany(mappedBy = "mentor")
    private List<EmpXEmp> mentorList;

    @OneToMany(mappedBy = "employee")
    private List<Evaluation> evaluationsList;

    @ManyToOne
    @JoinColumn(name = "id_department", nullable = false, foreignKey = @ForeignKey(name = "FK_employee_department"))
    private Department department;
}