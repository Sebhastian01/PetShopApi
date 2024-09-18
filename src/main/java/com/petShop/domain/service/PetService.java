package com.petShop.domain.service;

import com.petShop.domain.PetDomain;
import com.petShop.domain.repository.PetDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    @Autowired
    private PetDomainRepository petDomainRepository;

    public List<PetDomain> getAll() {
        return petDomainRepository.getAll();
    }

    public Optional<PetDomain> getPetById(int id) {
        return petDomainRepository.getPetById(id);
    }
/*
    public Optional<List<PetDomain>> getById(int id) {
        return petDomainRepository.findById(id);
    }

    public PetDomain save(PetDomain petDomain) {
        return petDomainRepository.save(petDomain);
    }

    public boolean delete(int id) {
        return getId(id).map(pet -> {
            petDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

 */
}
