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
public class EmpXEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_empXemp_employee"))
    private Employee mentor;

    @ManyToOne
    @JoinColumn(name = "mentee_id", nullable = false, foreignKey = @ForeignKey(name = "FK_empXemp_employee"))
    private Employee mentee;
}
