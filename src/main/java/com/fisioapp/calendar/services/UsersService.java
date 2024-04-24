package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.UsersMapper;
import com.fisioapp.calendar.models.User;

@Service
public class UsersService {

	 @Autowired
	    private UsersMapper usersMapper;
	    
	    public void create(User user) {
	    	usersMapper.create(user);
	    }

	    public void update(User user) {
	    	usersMapper.update(user);
	    }

	    public void delete(long id) {
	    	usersMapper.delete(id);
	    }

	    public List<User> list() {
	        return usersMapper.list();
	    }
}
