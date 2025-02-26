package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "common_name", nullable = false)
    private String commonName;

    @Column(name = "latin_name", nullable = false)
    private String latinName;

    @OneToMany(mappedBy = "species")
    private Set<Animal> animals;

    // Getters and Setters
}