package edu.mum.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.domain.Address;
import edu.mum.domain.Employee;
import edu.mum.domain.Phone;
import edu.mum.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/OneToManyUniJoinTable", method = RequestMethod.GET)
	public ModelAndView doOneToManyUniJoinTable() {

		// Add First Employee with two addresses
		List<Address> addresses = new ArrayList<Address>();

		Address address = new Address();
		address.setState("New York");
		address.setCity("Binghamton");
		address.setZipCode("11111");
		addresses.add(address);

		address = new Address();
		address.setState("Rhode Island");
		address.setCity("Providence");
		address.setZipCode("22222");
		addresses.add(address);

		Employee employee = new Employee();
		employee.setFirstName("Will");
		employee.setLastName("KnotPay");
		employee.setSalary(230000);

		employee.setAddresses(addresses);

		Employee firstEmployee = employeeService.save(employee);

		ModelAndView mav = new ModelAndView();
		mav.addObject(firstEmployee);
		mav.setViewName("EmployeeDetails");
		return mav;
	}

	@RequestMapping(value = "/listemployees", method = RequestMethod.GET)
	public String listEmployees(Employee employee, Model model) {

		List<Employee> list = employeeService.getAll();
		model.addAttribute("employees", list);

		return "ListEmployees";
	}

	@RequestMapping(value = "/OneToManyUniJoinColumn", method = RequestMethod.GET)
	public ModelAndView doOneToManyUniJoinColumn() {

		List<Phone> phones = new ArrayList<Phone>();

		Phone phone = new Phone();
		phone.setAreacode(222);
		phone.setPrefix(333);
		phone.setNumber(5432);
		phones.add(phone);

		phone = new Phone();
		phone.setAreacode(111);
		phone.setPrefix(444);
		phone.setNumber(2345);
		phones.add(phone);

		Employee employee = new Employee();
		employee.setFirstName("Bill");
		employee.setLastName("Pay");
		employee.setSalary(235000);

		employee.setPhones(phones);

		employee = employeeService.save(employee);

		ModelAndView mav = new ModelAndView();
		mav.addObject(employee);
		mav.setViewName("EmployeeDetails");
		return mav;
	}
}
