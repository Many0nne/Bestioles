package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String label;

    @ManyToMany(mappedBy = "roles")
    private Set<Person> persons;

    // Getters and Setters
}