package edu.mum.service;

import java.util.List;

import edu.mum.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAll();

	public Employee save(Employee employee);

	public Employee get(Long id);

	public Employee getPhones(Long id);

}
