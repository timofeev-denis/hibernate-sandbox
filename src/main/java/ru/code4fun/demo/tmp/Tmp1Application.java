package ru.code4fun.demo.tmp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.code4fun.demo.tmp.dao.entities.Department;
import ru.code4fun.demo.tmp.dao.entities.Employee;
import ru.code4fun.demo.tmp.dao.repository.DepartmentRepository;
import ru.code4fun.demo.tmp.dao.repository.EmployeeRepository;

@Slf4j
@SpringBootApplication
public class Tmp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tmp1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        return (args) -> {
            // Create departments
            Department department;

            department = departmentRepository.save(Department.builder()
                    .id(1L)
                    .name("Sales")
                    .build());
            log.info("New department: {}", department);

            department = departmentRepository.save(Department.builder()
                    .id(2L)
                    .name("R&D")
                    .build());
            log.info("New department: {}", department);

            department = departmentRepository.save(Department.builder()
                    .id(3L)
                    .name("Support")
                    .build());
            log.info("New department: {}", department);

            // Create employees
            Employee employee;
            employee = employeeRepository.save(Employee.builder()
                    .firstName("Sarah")
                    .lastName("Connor")
                    .description("Futurologist")
                    .departmentId(1L)
                    .build());
            log.info("New employee: {}", employee);

            employee = employeeRepository.save(Employee.builder()
                    .firstName("John")
                    .lastName("Romero")
                    .description("Developer")
                    .departmentId(2L)
                    .build());
            log.info("New employee: {}", employee);

            employee = employeeRepository.save(Employee.builder()
                    .firstName("Peter")
                    .lastName("Moulinex")
                    .description("Developer")
                    .departmentId(2L)
                    .build());
            log.info("New employee: {}", employee);

            employee = employeeRepository.save(Employee.builder()
                    .firstName("Josh")
                    .lastName("Long")
                    .description("Developer")
                    .departmentId(2L)
                    .build());
            log.info("New employee: {}", employee);
        };
    }
}
