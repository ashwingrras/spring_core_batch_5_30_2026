package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Users
{
    private String message;

    Course course;

    // setter getter
    public void setMessage(String message){
        this.message  = message;
    }
    public String getMessage(){
        return message;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
