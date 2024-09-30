package com.fisioapp.calendar.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fisioapp.calendar.models.Patient;

@Mapper
public interface PatientsMapper {

	@Insert("INSERT INTO patients (id, first_name, last_name, gender, marital_status, occupation, appointment_motive, medical_tests, "
			+ "sport, sports, diabetes, hypertension, other_conditions, creation_date, last_update, locator_id, address_id, created_by, updated_by)"
			+ " VALUES (#{id}, #{firstName}, #{lastName}, #{gender}, #{maritalStatus}, #{occupation}, #{appointmentMotive}, #{medicalTests}, #{sport},"
			+ " #{sports}, #{diabetes}, #{hypertension}, #{otherConditions}, #{creationDate}, #{lastUpdate}, #{locator.id}, #{address.id}, #{createdBy.id}, #{updatedBy.id})")
    void create(Patient entity);

    @Update("UPDATE patients SET firts_name = #{firstName}, last_name = #{lastName}, gender = #{gender}, marital_status = #{maritalStatus}, occupation = #{occupation}, "
    		+ "appointment_motive = #{appointmentMotive}, medical_tests = #{medicalTests}, sport = #{sport}, sports = #{sports}, diabetes = #{diabestes}, hypertension = #{hypertension}, "
    		+ "other_conditions = #{otherConditions}, creation_date = #{creationDate}, last_update = #{lastUpdate}, locator_id = #{locator.id}, address_id = #{address.id}, created_by = #{createdBy.id}, updated_by = #{updatedBy.id} WHERE id = #{id}")
    void update(Patient entity);

    @Delete("DELETE FROM patients WHERE id = #{id}")
    void delete(long id);
    
    @Select("SELECT * FROM physiotherapists WHERE id = #{id}")
    Patient get(long id);

    @Select("SELECT * FROM patients")
    List<Patient> list();
   
}
