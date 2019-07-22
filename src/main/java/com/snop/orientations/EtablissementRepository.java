package com.snop.orientations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface EtablissementRepository  extends JpaRepository<Etablissement, Long> {
    public List<Etablissement> findByNomet(String nomet);
}
