package com.example.solid.animals;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_id_sequence",
            sequenceName = "player_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_id_sequence"
    )
    private Integer id;
    private String nickname;
    private String email;
    private Date dateOfBirth;
    private Integer xp;
    
}
