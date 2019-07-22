package com.snop.orientations;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = {Eleve.class})
public interface EleveProjection {
    public String getNom();
    public Etablissement getEtablissement();
}
