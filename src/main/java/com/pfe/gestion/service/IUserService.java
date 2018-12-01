package com.pfe.gestion.service;

import java.util.List;

import com.pfe.gestion.entities.User;

public interface IUserService {
	public User consulterProfil(Long id);
	public void updateUser(User user);
	

}
