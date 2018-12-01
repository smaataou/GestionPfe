package com.pfe.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.gestion.dao.UserRepository;
import com.pfe.gestion.entities.User;
@Service
public class UserService implements IUserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User consulterProfil(Long id) {
		Optional<User> user = this.userRepository.findById(id);
		return null;
	}

	

}
