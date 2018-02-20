package ru.code4fun.demo.tmp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.code4fun.demo.tmp.dao.entities.Employee;
import ru.code4fun.demo.tmp.dao.repository.EmployeeRepository;

@Slf4j
@SpringBootApplication
public class Tmp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tmp1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {
            Employee sarah = repository.save(Employee.builder()
                    .firstName("Sarah")
                    .lastName("Connor")
                    .description("Futurologist")
                    .build());
            log.info("New employee: {}", sarah);
        };
    }
}
