package com.kotlinplayground;

import com.kotlinplayground.classes.Course;
import com.kotlinplayground.classes.CourseCategory;
import com.kotlinplayground.classes.CourseUtils;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new Course(1,
                "Reactive Programming in modern java using something",
                "Tomi",
                CourseCategory.DEVELOPMENT);

        course.noOfCourses = 11;

        System.out.println("course : "+ course);
        System.out.println("no of courses : "+ course.noOfCourses);

        CourseUtils.printName1();
        CourseUtils.printName1("abc");

        Course.Companion.printName2("abc");
        Course.printName2("abc1");
    }
}
