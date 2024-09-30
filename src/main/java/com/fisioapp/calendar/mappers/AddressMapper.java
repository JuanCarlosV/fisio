package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.Address;

@Mapper
public interface AddressMapper {

	@Insert("INSERT INTO address (id, street, number, county, city, state, zip_code) VALUES (#{id}, #{street}, #{number}, #{county}, #{city}, #{state}, #{zipCode})")
    void create(Address entity);

    @Update("UPDATE address SET street = #{street}, number = #{number}, county = #{county}, city = #{city}, state = #{state}, zip_code = #{zipCode} WHERE id = #{id}")
    void update(Address entity);

    @Delete("DELETE FROM address WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM address")
    List<Address> list();
}
