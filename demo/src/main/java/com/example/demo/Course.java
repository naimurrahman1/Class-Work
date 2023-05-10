package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
    @Autowired
    Section section;

    public void CourseInfo()
    {
        System.out.println("Math Course");
    }

    public Section GetSection()
    {
        return section;
    }
}

