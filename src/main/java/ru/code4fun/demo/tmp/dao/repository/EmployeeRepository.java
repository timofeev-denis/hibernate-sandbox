package ru.code4fun.demo.tmp.dao.repository;

import org.springframework.data.repository.CrudRepository;
import ru.code4fun.demo.tmp.dao.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

}
