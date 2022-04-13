package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {
    private ArtifactDao artifactDao;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a3 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a4 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a5 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a6 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        Artifact a7 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A delumonator is a device inventer by albus dumbledore that resembles...");
        a1.setImageUrl("imageUrl");

        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);
        artifactDao.save(a5);
        artifactDao.save(a6);
        artifactDao.save(a7);



    }
}
