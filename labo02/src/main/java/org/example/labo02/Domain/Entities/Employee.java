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

    @ManyToOne
    @JoinColumn(name = "id_mentor", foreignKey = @ForeignKey(name = "FK_employee_mentor"))
    private Employee mentor;

    @OneToMany(mappedBy = "mentor")
    private List<Employee> mentees;

    @ManyToOne
    @JoinColumn(name = "id_department", nullable = false, foreignKey = @ForeignKey(name = "FK_employee_department"))
    private Department department;

    @OneToMany(mappedBy = "leader")
    private List<Project> ledProjects;

    @OneToMany(mappedBy = "employee")
    private List<ProXEmp> employeeProjects;

    @OneToMany(mappedBy = "employee")
    private List<TraXEmp> employeeTrainings;

    @OneToMany(mappedBy = "employee")
    private List<EvaXEmp> employeeEvaluations;
}