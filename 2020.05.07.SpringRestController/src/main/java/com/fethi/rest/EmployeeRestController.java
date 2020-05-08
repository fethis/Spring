package com.fethi.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fethi.domain.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	// alternatif 1
	/*
	 * static List<Employee> employees = new ArrayList<Employee>(); static {
	 * employees.add(new Employee("Esra","Kara")); employees.add(new
	 * Employee("meymet","yılmaz")); employees.add(new Employee("Kamil","Mara"));
	 * employees.add(new Employee("ilayda","yılmaz"));
	 * 
	 * }
	 */
	// alternatif 2

	List<Employee> employees;

	@PostConstruct
	public void loadData() {
		employees = new ArrayList<Employee>();

		employees.add(new Employee("Esra", "Kara"));
		employees.add(new Employee("meymet", "yılmaz"));
		employees.add(new Employee("Kamil", "Mara"));
		employees.add(new Employee("ilayda", "yılmaz"));
	}

	@GetMapping("/mrb")
	public String merhaba() {

		return "merhaba"; // String olarak dönüyor
	}

	@GetMapping("/emp")
	public Employee emp() {

		Employee mgr = new Employee("Ali", "Can");

		Employee emp = new Employee("fethi", "Şen");

		emp.setManager(mgr);

		return emp;

		// return new Employee("fethi","şen"); // nesneti jakson formatına dönüştürüyor
	}

	@GetMapping("/emps")
	public List<Employee> emps() {
		return employees;
		/*
		 * List<Employee> empList = new ArrayList<Employee>();
		 * 
		 * Employee mgr = new Employee("Ali", "Can");
		 * 
		 * Employee emp = new Employee("fethi", "Şen"); emp.setManager(mgr);
		 * 
		 * empList.add(mgr); empList.add(emp); empList.add(new
		 * Employee("Ahmet","kamal"));
		 * 
		 * return empList;
		 */

	}

	@GetMapping("/emps/{indeks}")
	public Employee getEmp(@PathVariable int indeks) { // url den gönderdiğim parametreyi buradan alacam

		if (indeks >= employees.size() || indeks < 0)

			throw new EmployeeNotFoundException("böyle bir id mevcut değil: " + indeks);

		// return null; //new Employee("limit"," aşıldı");
		
		if(indeks == 2)
			throw new StringIndexOutOfBoundsException("hatalar hatalar indeks =2");

		return employees.get(indeks);

	}



	

}
