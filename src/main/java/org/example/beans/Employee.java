package org.example.beans;

/*

        emp
         101, moti, 104
         103, hemant, 102

        dept
         101, sale
         102, it
         103, house keeping



 */


public class Employee
{
    int id;

    String name;

    Department departmentObj;

    public Employee(Department department)
    {
        this.departmentObj = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartmentObj() {
        return departmentObj;
    }

    public void setDepartmentObj(Department departmentObj) {
        this.departmentObj = departmentObj;
    }
}
