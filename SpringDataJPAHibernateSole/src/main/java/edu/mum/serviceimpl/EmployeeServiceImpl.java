package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.domain.Employee;
import edu.mum.domain.Phone;
import edu.mum.repository.EmployeeRepository;
import edu.mum.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee get(Long id) {
		// return employeeRepository.findOne(id);
		return employeeRepository.findById(id);
	};

	// Populate lazy list
	public Employee getPhones(Long id) {
		Employee employee = this.get(id);
//		employee.getPhones().size();

		return employee;
	};

}
