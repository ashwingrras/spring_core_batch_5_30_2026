package org.example;

import org.example.beans.Brand;
import org.example.beans.Course;
import org.example.beans.Product;
import org.example.beans.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
      Spring Core:
      1. Beans ( XML and Annotations )
      2. Spring IOC : beans
      3. Dependency Injection : ( XML and Annotations )
        3.1 constructor inject
        3.3 setter inject
        inheritance
        dependency injection with collection
      4. AutoWired : beans / object
            1. byName: setter name
            2. byType: Property Type ( class )
            3. constructor:
            4. no
      5. AOP ( Aspect Oriented Programming )
      6. Spring - MVC ( Model View Controller )
        5.1 JSP
      7. Spring - MVC with Data Base ( JDBC / Hibernate )
 */

public class Main {
   public static void main() {
        System.out.println("at main method ");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("context id  : "+context.getId());

        // old way of creating object
        Users users = new Users();
        users.setMessage("hello user");
        Course course = new Course();
        course.setName("java");
        users.setCourse(course);
        System.out.println(users.getMessage());
        System.out.println(users.getCourse().getName()); // java

        // object create with spring IOC
        Users obj = (Users) context.getBean("users1");
        System.out.println("obj reference : "+obj);
       System.out.println(obj.getMessage());
        obj.setMessage("message updated ");
        System.out.println(obj.getMessage());
        System.out.println(obj.getCourse().getName()); // java

       Product product1 = (Product) context.getBean("product1");
       System.out.println("product1 bean "+product1);
       System.out.println("name = "+product1.name);
       System.out.println("id = "+product1.id);
       System.out.println(product1.brand);






    }
}
