package com.javabnb.springjavabnb.service;

import com.javabnb.springjavabnb.entity.Appartement;
import com.javabnb.springjavabnb.repository.AppartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AppartementService {

    @Autowired
    private AppartementRepository repository;


    public Appartement saveAppartement(Appartement appartement) {
        return repository.save(appartement);
    }

    public List<Appartement> saveAppartements(List<Appartement> appartements) {
        return repository.saveAll(appartements);
    }


    public List<Appartement> getAppartements() {
        return repository.findAll();
    }

    public Appartement getAppartementById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Appartement getAppartementByName(String name) {
        return repository.findByName(name);
    }

    public Appartement getAppartementByPays(String pays) {
        return repository.findByPays(pays);
    }

    public Appartement getAppartementByRegion(String region) {
        return repository.findByRegion(region);
    }

    public Appartement getAppartementByLieu(String lieu) {
        return repository.findByLieu(lieu);
    }
    public Appartement getAppartementByVillage(String village) {
        return repository.findByVillage(village);
    }

    public String deleteAppartement(int id) {
        repository.deleteById(id);
        return "Appartement supprimé." + id;
    }



    public Appartement updateAppartement(Appartement appartement) {
        Appartement existingAppartement = repository.findById(appartement.getId()).get();
        existingAppartement.setName(appartement.getName());
        existingAppartement.setDesc(appartement.getDesc());
        existingAppartement.setLieu(appartement.getLieu());
        existingAppartement.setResidence(appartement.getResidence());
        existingAppartement.setVillage(appartement.getVillage());
        existingAppartement.setRegion(appartement.getRegion());
        existingAppartement.setPays(appartement.getPays());
        existingAppartement.setPrice(appartement.getPrice());
        return repository.save(existingAppartement);
    }

}


