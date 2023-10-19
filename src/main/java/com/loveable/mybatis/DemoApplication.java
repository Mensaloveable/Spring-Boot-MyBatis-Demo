package com.loveable.mybatis;

import com.loveable.mybatis.mappers.EmployeeRepository;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(EmployeeRepository.class)
@MapperScan("com.loveable.mybatis.mappers")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
