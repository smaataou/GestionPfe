package com.pfe.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.gestion.entities.Rapport;
@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long>{

}
