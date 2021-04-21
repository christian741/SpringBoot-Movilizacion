package com.gmail.christian741.Main.services;

import java.util.List;

import com.gmail.christian741.Main.entity.User;

public interface IUserService {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public List<User> getUsers();
	public User getUserById(Integer id);
	public void blockUser(Integer id);
	

}
