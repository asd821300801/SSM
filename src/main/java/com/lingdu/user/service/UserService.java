package com.lingdu.user.service;

import java.util.List;

import com.lingdu.user.domain.User;

/**
 * 用户service接口
 * @author LingDu
 *
 */
public interface UserService {
	public void addUser(User user);
	public User getUser(Integer id);
	public void deleteUser(Integer id);
	public void updateUser(User user);
	public List<User> list();
}
