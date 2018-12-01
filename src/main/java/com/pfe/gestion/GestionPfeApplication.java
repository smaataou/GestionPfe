	package com.pfe.gestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pfe.gestion.dao.ContactRepository;
import com.pfe.gestion.dao.RapportRepository;
import com.pfe.gestion.dao.UserRepository;
import com.pfe.gestion.entities.Rapport;
import com.pfe.gestion.entities.User;

@SpringBootApplication
public class GestionPfeApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RapportRepository rapportRepository;
	@Autowired
	private ContactRepository contactRepository;
	


	public static void main(String[] args) {
		SpringApplication.run(GestionPfeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User u1 = userRepository.save(new User("Salma", "maataoui", "maataouisalmaa@gmail.com", "Info", "wmd", 50, "developer"));
		User u2 = userRepository.save(new User("Ayoub", "Aksas", "ayoubaksas01@gmail.com", "Info", "wmd", 60, "developer"));
		Rapport r1 = rapportRepository.save(new Rapport("info", "app web", "INNOVEOS", "rapport", u1));*/
	}
}
