package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;


@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String color;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sex;

    @ManyToOne
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;

    // Getters and Setters
}