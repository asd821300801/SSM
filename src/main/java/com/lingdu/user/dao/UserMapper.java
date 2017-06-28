package com.lingdu.user.dao;

import java.util.List;

import com.lingdu.user.domain.User;

/**
 * 基本的增删改查
 * UserMapper.java必须与UserMapper.xml同名
 * @author LingDu
 *
 */
public interface UserMapper {
	public User get(int id);
	public List<User> list();
	public void add(User user);
	public void update(User user);
	public void delete(Integer id);
}
