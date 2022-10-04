package comsmburu.employeeservice.util;

import comsmburu.employeeservice.dto.EmployeeDTO;
import comsmburu.employeeservice.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {

    public static List<EmployeeDTO> getListDTO() {
        return Arrays.asList(new EmployeeDTO(1,"samuel","mburu","sam@gmail.com","IT",20000),
                new EmployeeDTO(2,"steve","KK","steveKk@gmail.com","Software",100000) );
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(1,"samuel","mburu","sam@gmail.com","IT",20000),
                new Employee(2,"steve","KK","steveKk@gmail.com","Software",100000) );
    }

    public static EmployeeDTO getDTO() {
       return new EmployeeDTO(1,"samuel","mburu","sam@gmail.com","IT",20000);
    }

    public static Employee getEntity() {
        return new Employee(2,"steve","KK","steveKk@gmail.com","Software",100000);
    }
}
