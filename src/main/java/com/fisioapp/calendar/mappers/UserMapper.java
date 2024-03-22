package com.fisioapp.calendar.mappers;

import java.time.LocalDateTime;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT NOW()")
    LocalDateTime now();

//     @Insert("INSERT INTO city (name, state, country) VALUES(#{name}, #{state}, #{country})")
//   @Options(useGeneratedKeys = true, keyProperty = "id")
//   void insert(City city);

//   @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
//   City findById(long id);
}
