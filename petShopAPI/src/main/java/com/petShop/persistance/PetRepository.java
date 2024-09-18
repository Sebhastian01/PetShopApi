package com.petShop.persistance;

import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll(){
        return (List<Pet>) petCrudRepository.findAll();
    }

    public Optional<Pet> getPetById(int id) {
        return petCrudRepository.findById(id);
    }

    public Pet save(Pet pet) {
        return petCrudRepository.save(pet);
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    public long countAll() {
        return petCrudRepository.count();
    }
}

