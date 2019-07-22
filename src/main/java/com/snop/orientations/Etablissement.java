package com.snop.orientations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etablissement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomet;
    private String type;
    private String commune;
    private String departement;
    private String region;
    @OneToMany(mappedBy = "etablissement")
    private Collection<Eleve> eleves;

    /*@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Eleve> eleveList=new ArrayList<>();*/
}
