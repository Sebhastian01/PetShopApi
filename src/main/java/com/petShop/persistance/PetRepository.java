package com.petShop.persistance;

import com.petShop.domain.PetDomain;
import com.petShop.domain.repository.PetDomainRepository;
import com.petShop.persistance.PetMapper.PetMapper;
import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository implements PetDomainRepository{

    @Autowired
    private PetCrudRepository petCrudRepository;

    @Autowired
    private PetMapper mapper;

    @Override
    public List<PetDomain> getAll(){
        List<Pet> pets = (List<Pet>) petCrudRepository.findAll();
        return mapper.toPet(pets);
    }

    @Override
    public Optional<PetDomain>> getPetById(int id) {
        return petCrudRepository.findById(id).map(pet -> mapper.toPet(pet));
    }
/*
    @Override
    public PetDomain save(Pet pet) {
        Pet  petCrudRepository.save(pet);
    }

    @Override
    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return petCrudRepository.count();
    }
 */
}

