package com.shekar.bootstrap;

import com.shekar.model.Owner;
import com.shekar.model.Vet;
import com.shekar.service.OwnerService;
import com.shekar.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Harsha");
        owner1.setLastName("Shekar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anvitha");
        owner2.setLastName("Rao");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Atharva");
        owner3.setLastName("Shekar");

        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Shashi");
        vet1.setLastName("Shekar");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Usha");
        vet2.setLastName("Shekar");

        vetService.save(vet2);
    }
}
