package com.fisioapp.calendar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisioapp.calendar.mappers.ClinicsMapper;
import com.fisioapp.calendar.mappers.UsersMapper;
import com.fisioapp.calendar.models.Clinic;
import com.fisioapp.calendar.models.User;

@Service
public class UsersService {

	 @Autowired
	    private UsersMapper usersMapper;
	    
	    public void create(User clinic) {
	    	usersMapper.create(clinic);
	    }

	    public void update(User clinic) {
	    	usersMapper.update(clinic);
	    }

	    public void delete(long id) {
	    	usersMapper.delete(id);
	    }

	    public List<User> list() {
	        return usersMapper.list();
	    }
}
