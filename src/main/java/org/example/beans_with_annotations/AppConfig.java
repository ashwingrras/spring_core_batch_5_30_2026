package org.example.beans_with_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans_with_annotations")
public class AppConfig
{

    @Bean
    public MyService myService()
    {
        return  new MyService();
    }

    @Bean
    public MyRepository myRepository()
    {
        MyRepository obj = new MyRepository();
        obj.setMyService(myService());
        return  obj;
    }

}
