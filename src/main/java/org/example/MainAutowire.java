package org.example;

/*

  auto wire:

  1. byName
  2. byType
  3. constructor
  3. no



 */

import org.example.beans.Child;
import org.example.beans.Department;
import org.example.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowire
{
    static void main() {

        System.out.println("at main inheritance method ");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("context id  : "+context.getId());

        Department department = new Department();
        department.setDeptName("IT");

        /*Employee employee = new Employee();
        employee.setDepartmentObj(department);
        System.out.println(employee.getDepartmentObj().getDeptName());*/

        Department department2 = new Department();
        department.setDeptName("SALES");

        Employee obj = (Employee) context.getBean("employee");
        System.out.println(obj.getDepartmentObj().getDeptName());




    }
}
