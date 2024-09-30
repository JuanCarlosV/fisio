package com.fisioapp.calendar.mappers;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.User;

@Mapper
public interface UsersMapper {

	@Insert("INSERT INTO users (id, username, password, type) VALUES (#{id}, #{username}, #{password}, #{type})")
    void create(User entity);

    @Update("UPDATE users SET username = #{username}, password = #{password}, type = #{type} WHERE id = #{id}")
    void update(User entity);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM users")
    List<User> list();

    @Select("SELECT NOW()")
    LocalDateTime now();

//     @Insert("INSERT INTO city (name, state, country) VALUES(#{name}, #{state}, #{country})")
//   @Options(useGeneratedKeys = true, keyProperty = "id")
//   void insert(City city);

//   @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
//   City findById(long id);
}
