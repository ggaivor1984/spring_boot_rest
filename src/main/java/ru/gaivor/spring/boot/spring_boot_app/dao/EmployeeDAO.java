package ru.gaivor.spring.boot.spring_boot_app.dao;



import ru.gaivor.spring.boot.spring_boot_app.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

  public  Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
