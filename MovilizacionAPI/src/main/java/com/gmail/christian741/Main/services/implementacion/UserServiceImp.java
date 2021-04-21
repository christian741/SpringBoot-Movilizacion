package com.gmail.christian741.Main.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.christian741.Main.entity.User;
import com.gmail.christian741.Main.repository.IUserRepository;
import com.gmail.christian741.Main.services.IUserService;

@Service
public class UserServiceImp implements IUserService{
	
	@Autowired
	private IUserRepository repository;

	@Override
	public void saveUser(User user) {
		
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void blockUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
