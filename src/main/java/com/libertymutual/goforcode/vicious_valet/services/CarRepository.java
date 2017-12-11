package com.libertymutual.goforcode.vicious_valet.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.vicious_valet.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
