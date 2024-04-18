package com.fisioapp.calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fisioapp.calendar.mappers.UsersMapper;

@SpringBootTest
class CalendarApplicationTests {

	@Autowired
	private UsersMapper userMapper;

	@Test
	void testUserMapper() {
		System.out.println(userMapper.now());
	}


	@Test
	void contextLoads() {
	}

}
