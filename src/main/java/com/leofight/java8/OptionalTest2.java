package com.leofight.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee1 = new Employee();
        employee1.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee, employee1);
        company.setEmployees(employees);

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));


    }
}
