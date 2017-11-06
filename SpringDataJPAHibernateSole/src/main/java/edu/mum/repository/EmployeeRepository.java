package edu.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	
	public List<Employee> findEmployeesByLastName(@Param("lastName") String lastName);

	@Query("select e from Employee e where e.id = :id")
	Employee findById(@Param("id") long id);

	@Query(value = "SELECT * FROM emp e WHERE e.F_NAME = ?1", nativeQuery = true)
	public List<Employee> findByFirstName(String firstName);
	
	@Query(value = "SELECT e FROM Employee e WHERE e.lastName = :lastname")
	public List<Employee> findByLastName(String lastname);
	
	
	public final static  String FIND_BY_SALARY_QUERY = "SELECT e FROM Employee e WHERE e.salary = :salary";
	
	@Query(FIND_BY_SALARY_QUERY) 
	public List<Employee> findByAddress(@Param("salary") Integer salary);

}
