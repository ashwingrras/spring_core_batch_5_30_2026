package org.example;

import org.example.beans.Child;
import org.example.beans.Parent;
import org.example.beans.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInheritance
{
    static void main() {

        System.out.println("at main inheritance method ");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("context id  : "+context.getId());

        // old way
        /*Child child = new Child();
        child.setSurname("verma");
        System.out.println(child.getSurname());*/

        Parent parent = new Parent();
        parent.setName("parent name");

        Parent parentChild = new Child();
        parentChild.setName("child name ");
        System.out.println(parentChild.getName());

        Child obj = (Child) context.getBean("child");
        System.out.println("obj reference : "+obj);
        System.out.println(obj.getName());
        System.out.println(obj.getSurname());

    }
}
