package com.java.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
//        // create list
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        list.add(40);
//
//        Collections.sort(list); // ascending order
//        System.out.println(list);
//
//        Collections.reverse(list); // descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, 40000));
        employees.add(new Employee(20, "Santosh", 29, 35000));
        employees.add(new Employee(30, "Sanjay", 30, 45000));
        employees.add(new Employee(40, "Pramod", 29, 50000));


//        Collections.sort(employees, new MySort()); // ascending order
//        employees.forEach(employee -> System.out.println(employee.getName()));
//        System.out.println(employees);

//        Collections.sort(employees, new MySort()); // descending order
//        System.out.println(employees);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (o1.getAge() - o2.getAge());
//            }
//        });


//        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
//        System.out.println(employees); // ascending order

//        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
//        System.out.println(employees); // descending order

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getName().compareTo(o2.getName()));
//            }
//        });

        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println(employees);

    }
}

//class MySort implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o1.getSalary() - o2.getSalary());
//    }
//}


class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
