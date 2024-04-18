package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.Physiotherapist;

@Mapper
public interface PhysiotherapistMapper {

    @Insert("INSERT INTO physiotherapists (id, name) VALUES (#{id}, #{name})")
    void create(Physiotherapist entity);

    @Update("UPDATE physiotherapists SET name = #{name} WHERE id = #{id}")
    void update(Physiotherapist entity);

    @Delete("DELETE FROM physiotherapists WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM physiotherapists")
    List<Physiotherapist> list();
}