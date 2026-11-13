package com.dt2.petmania.Service;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }
        public List <Pet> mostrarPet(){
        List<Pet> Petlista = new  ArrayList<>();
            return Petlista = repository.findAll();
    }
    public void cadastrarPet (Pet p) {
        Pet pet = new Pet();
        repository.save(p);
    }
}
