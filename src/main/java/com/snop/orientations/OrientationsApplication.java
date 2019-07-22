package com.snop.orientations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class OrientationsApplication implements CommandLineRunner {
    @Autowired
    public EleveRepository eleveRepository;

    @Autowired
    public EtablissementRepository etablissementRepository;



    public static void main(String[] args) {
        SpringApplication.run(OrientationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Etablissement e1=etablissementRepository.save(new Etablissement(null,"LTCD","Public","Fann","Dakar","Dakar",null));
        Etablissement e2=etablissementRepository.save(new Etablissement(null,"LTID","Public","Fann","Dakar","Dakar",null));
        Etablissement e3=etablissementRepository.save(new Etablissement(null,"LTAB","Public","Keur Gou Mag","Diourbel","Diourbel",null));

        eleveRepository.save(new Eleve(null,"Cheikh","Kandji","Masculin",new Date(),"Dakar","Informaticien","774382176","Grand yoff","abrare@live.fr",e1));
        eleveRepository.save(new Eleve(null,"Moussa","Diouf","Masculin",new Date(),"Fatick","Maçon","771282176","Grand dakar","abrare@gmail.com",e2));
        eleveRepository.save(new Eleve(null,"Ali","Dia","Masculin",new Date(),"Dakar","Enseignant","774001176","Parcelles","ali@yahoo.fr",e3));
        eleveRepository.save(new Eleve(null,"Mouhamed","Diagne","Masculin",new Date(),"Saint-louis ","Enseignant","774011176","Pikine","alima@yahoo.fr",e3));
        eleveRepository.save(new Eleve(null,"Astou","Sène","Feminin",new Date(),"Dakar","Couturière","774330176","Médina","astou@yahoo.fr",e3));


    }
}
