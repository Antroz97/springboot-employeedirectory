package pl.wolszczak.springbootemployeedirectory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wolszczak.springbootemployeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
