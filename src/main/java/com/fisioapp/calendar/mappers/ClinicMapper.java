package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.Clinic;

@Mapper
public interface ClinicMapper{

    @Insert("INSERT INTO clinic (id, name) VALUES (#{id}, #{name})")
    void create(Clinic entity);

    @Update("UPDATE clinic SET name = #{name} WHERE id = #{id}")
    void update(Clinic entity);

    @Delete("DELETE FROM clinic WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM clinic")
    List<Clinic> list();
}
