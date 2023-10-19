package com.loveable.mybatis.mappers;

import com.loveable.mybatis.models.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeRepository {
    @Select("SELECT * FROM employee")
    List<Employee> findAll();

    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee findById(Long id);

    @Insert("INSERT INTO employee (firstName, lastName, email, hireDate) VALUES (#{firstName}, #{lastName}, #{email}, #{hireDate})")
    void save(Employee employee);

    @Update("UPDATE employee SET firstName = #{firstName}, lastName = #{lastName}, email = #{email}, hireDate = #{hireDate} WHERE id = #{id}")
    void update(Employee employee);

    @Delete("DELETE FROM employee WHERE id = #{id}")
    void delete(Long id);
}