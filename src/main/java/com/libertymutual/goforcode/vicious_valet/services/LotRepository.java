package com.libertymutual.goforcode.vicious_valet.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Repository
public interface LotRepository extends JpaRepository<Lot, Long> {

}
