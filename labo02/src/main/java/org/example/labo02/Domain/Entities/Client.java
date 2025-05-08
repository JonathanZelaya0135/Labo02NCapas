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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idClient;

    @Column
    private String name;

    @Column
    private String industry;

    @Column
    private String email;

    @OneToMany(mappedBy = "client")
    private List<ClieXPro> clientProjects;
}