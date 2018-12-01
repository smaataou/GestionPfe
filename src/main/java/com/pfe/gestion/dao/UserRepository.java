package com.pfe.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.gestion.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
