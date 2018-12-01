package com.pfe.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.gestion.entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
