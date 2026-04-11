package org.example.beans_with_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
