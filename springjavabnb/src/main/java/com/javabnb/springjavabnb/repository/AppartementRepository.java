package com.javabnb.springjavabnb.repository;

import com.javabnb.springjavabnb.entity.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartementRepository extends JpaRepository<Appartement,Integer> {
    Appartement findByName(String name);

    Appartement findByPays(String pays);

    Appartement findByRegion(String region);
}
