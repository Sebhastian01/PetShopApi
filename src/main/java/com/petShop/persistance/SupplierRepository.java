package com.petShop.persistance;


import com.petShop.persistance.crud.SupplierCrudRepository;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplierRepository {
    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll(){
        return (List<Supplier>) supplierCrudRepository.findAll();
    }

    public Optional<Supplier> getPetById(int id) {
        return supplierCrudRepository.findById(id);
    }

    public Supplier save(Supplier supplier) {
        return supplierCrudRepository.save(supplier);
    }

    public void delete(int idSupplier) {
        supplierCrudRepository.deleteById(idSupplier);
    }

    public boolean existsSupplier(int idSupplier) {
        return supplierCrudRepository.existsById(idSupplier);
    }

    public long countAll() {
        return supplierCrudRepository.count();
    }
}
