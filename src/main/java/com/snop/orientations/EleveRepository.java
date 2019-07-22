package com.snop.orientations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface EleveRepository extends JpaRepository<Eleve, Long> {
    public List<Eleve> findByNom(String nom);
}
