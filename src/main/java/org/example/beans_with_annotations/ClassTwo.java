package org.example.beans_with_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class ClassTwo
{
    @Autowired
    ClassOne classOne;

    public void callClassOneMethod()
    {
        classOne.printInfo("info from class two");
    }
}
