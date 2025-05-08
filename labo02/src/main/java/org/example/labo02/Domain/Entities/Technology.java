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
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTechnology;

    @Column
    private String name;

    @Column
    private String version;

    @OneToMany(mappedBy = "technology")
    private List<TecXPro> technologyProjects;
}