package ru.code4fun.demo.tmp.dao.repository;

import org.springframework.data.repository.CrudRepository;
import ru.code4fun.demo.tmp.dao.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
