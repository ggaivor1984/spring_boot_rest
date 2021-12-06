package ru.gaivor.spring.boot.spring_boot_app.service;



import ru.gaivor.spring.boot.spring_boot_app.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
