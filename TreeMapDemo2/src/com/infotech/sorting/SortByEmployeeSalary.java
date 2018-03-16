package com.infotech.sorting;

import java.util.Comparator;

import com.infotech.model.Employee;

public class SortByEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}

}
