package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.Locator;

@Mapper
public interface LocatorsMapper {

	@Insert("INSERT INTO locator (id, email, phone_number) VALUES (#{id}, #{email}, #{phoneNumber})")
    void create(Locator entity);

    @Update("UPDATE locator SET email = #{email}, phone_number = #{phoneNumber} WHERE id = #{id}")
    void update(Locator entity);

    @Delete("DELETE FROM locator WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM locator")
    List<Locator> list();
}
