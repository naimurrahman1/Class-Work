package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Component
public class Teacher {


    @Autowired
    Course course;

   public void Print()
   {
       course.CourseInfo();
       course.GetSection().SectionDetail();
   }





}
