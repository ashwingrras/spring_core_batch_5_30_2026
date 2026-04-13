package org.example;

import org.example.beans_with_annotations.AppConfig;
import org.example.beans_with_annotations.ClassTwo;
import org.example.beans_with_annotations.MyRepository;
import org.example.beans_with_annotations.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithAnnotationsSetter
{
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getId());

        MyService myService = context.getBean(MyService.class);
        System.out.println("myService "+myService);

        MyRepository myRepository = context.getBean(MyRepository.class);
        myRepository.callServiceMethod();


        /*ClassTwo classTwo = new ClassTwo();
        classTwo.callClassOneMethod();*/

        ClassTwo classTwo = context.getBean(ClassTwo.class);
        classTwo.callClassOneMethod();




    }
}
