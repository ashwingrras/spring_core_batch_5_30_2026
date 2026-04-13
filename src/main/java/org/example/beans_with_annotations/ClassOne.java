package org.example.beans_with_annotations;

import org.springframework.stereotype.Component;

@Component
public class ClassOne
{
    String name;

    public void printInfo(String info)
    {
        System.out.println("info "+info);
    }


}
