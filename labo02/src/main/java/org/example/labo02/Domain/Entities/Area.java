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
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idArea;

    @Column
    private String name;

    @Column
    private Float price;

    @OneToMany(mappedBy = "area")
    private List<Project> projects;
}