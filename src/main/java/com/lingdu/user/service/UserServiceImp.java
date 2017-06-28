package com.lingdu.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingdu.user.dao.UserMapper;
import com.lingdu.user.domain.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper mapper;

	public void addUser(User user) {
		mapper.add(user);
		
	}

	public User getUser(Integer id) {
		return mapper.get(id);
	}

	public void deleteUser(Integer id) {
		mapper.delete(id);
		
	}

	public void updateUser(User user) {
		
		
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
