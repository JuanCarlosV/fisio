package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BaseMapper<T> {
    @Insert("INSERT INTO clinic (email, password, nombreClinica, tipoRegistro, direccion, localizadores, cantidadPacientesPorHora, fechaCreacion, fechaUltimaActualizacion, creadoPor, actualizadoPor) VALUES (#{email}, #{password}, #{nombreClinica}, #{tipoRegistro}, #{direccion}, #{localizadores}, #{cantidadPacientesPorHora}, #{fechaCreacion}, #{fechaUltimaActualizacion}, #{creadoPor}, #{actualizadoPor})")
    void create(T entity);

    @Update("UPDATE clinic SET email = #{email}, password = #{password}, nombreClinica = #{nombreClinica}, tipoRegistro = #{tipoRegistro}, direccion = #{direccion}, localizadores = #{localizadores}, cantidadPacientesPorHora = #{cantidadPacientesPorHora}, fechaCreacion = #{fechaCreacion}, fechaUltimaActualizacion = #{fechaUltimaActualizacion}, creadoPor = #{creadoPor}, actualizadoPor = #{actualizadoPor} WHERE id = #{id}")
    void update(T entity);

    @Delete("DELETE FROM clinic WHERE id = #{id}")
    void delete(long id);

    @Select("SELECT * FROM clinic")
    List<T> list();
}
