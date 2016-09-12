package com.people.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.people.entity.User;
import com.people.service.UserService;

@EnableAutoConfiguration
@Service
public class UserServiceImpl implements UserService {
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(String id, String username) {
		jdbcTemplate.update("insert into user(id,username) values(?,?)", id,username);
	}

	@Override
	public User getUser(String id) {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from user where id=?", id, User.class);
		if(queryForList.size()>0){
			return (User) queryForList.get(0);
		}
		return null;
	}
	
	@Override
    public List getAllUsers() {
		List<User> queryForList = jdbcTemplate.queryForList("select * from user", User.class);
		return queryForList;
    }*/


}
