package com.javabnb.springjavabnb.controller;


import com.javabnb.springjavabnb.entity.Appartement;
import com.javabnb.springjavabnb.service.AppartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppartementController {

    @Autowired
    private AppartementService service;

    @PostMapping("/addAppartement")
    public Appartement addAppartement(@RequestBody Appartement appartement){

        return service.saveAppartement(appartement);

    }
    @PostMapping("/addAppartements")
    public List<Appartement> addAppartements(@RequestBody List<Appartement> appartements){

        return service.saveAppartements(appartements);

    }
    @GetMapping("/appartements")
    public List<Appartement> findAllappartements() {
        return service.getAppartements();
    }

    @GetMapping("/appartementById/{id}")
    public Appartement findAppartementById(@PathVariable int id) {
        return service.getAppartementById(id);
    }

    @GetMapping("/appartement/{name}")
    public Appartement findAppartementByName(@PathVariable String name) {
        return service.getAppartementByName(name);
    }


    @GetMapping("/appartement/{lieu}")
    public Appartement findAppartementByLieu(@PathVariable String lieu) {
        return service.getAppartementByLieu(lieu);
    }

//    @GetMapping("/appartement/{residence}")
//    public Appartement findAppartementByResidence(@PathVariable String residence) {
//        return service.getAppartementByResidence(residence);
//    }

    @GetMapping("/appartement/{village}")
    public Appartement findAppartementByVillage(@PathVariable String village) {
        return service.getAppartementByVillage(village);
    }

    @GetMapping("/appartement/{region}")
    public Appartement findAppartementByRegion(@PathVariable String region) {
        return service.getAppartementByRegion(region);
    }

    @PutMapping("/update")
    public Appartement updateAppartement(@RequestBody Appartement appartement) {
        return service.updateAppartement(appartement);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAppartement(@PathVariable int id) {
        return service.deleteAppartement(id);
    }

}
