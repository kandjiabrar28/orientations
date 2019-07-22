package com.snop.orientations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleve{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private String sexe;
    private Date datenais;
    private String lieunais;
    private String profession;
    private String tel;
    private String adresse;
    private String email;
    @ManyToOne
    @JoinColumn(name = "ID_ET_ORIGINE")
    private Etablissement etablissement;

    /*@ManyToMany
    private Collection<Etablissement> etablissementdem=new ArrayList<>();*/

}
