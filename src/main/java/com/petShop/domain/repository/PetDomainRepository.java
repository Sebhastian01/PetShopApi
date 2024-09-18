package com.petShop.domain.repository;

import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PetDomainRepository {
    public List<PetDomain> getAll();
    Optional<List<PetDomain>> getPetById(int id);
}
