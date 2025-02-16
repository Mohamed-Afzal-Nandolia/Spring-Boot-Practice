package com.tshaped.SpringBootApp1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TShapedSkills {

    /* 4.
    * You can also do that at the field level as well,
    * @Autowired
    * @Qualifier("springBoot")
    *
    * Output:
    * Java Bean Created
    * SpringBoot Bean Created
    * SpringBoot Course Purchased Successfully and fees paid is 4554.4
    * Course purchased
    * */
//    @Autowired
//    @Qualifier("springBoot")
    private ICourse course;

    /*
    * 5.
    * NOTE: @Qualifier is not allowed on Constructor But on the Parameter of the Constructor
    *
    * Output:
    * Java Bean Created
    * SpringBoot Bean Created
    * Dependency Injection Through Constructor
    * Java Course Purchased Successfully and fees paid is 4554.4
    * Course purchased
    *
    * NOTE: But if we use @Primary inside Java Class and we use @Qualifier("springBoot") here
    * which one will dominate?
    * Answer is @Qualifier("springBoot")
    *
    * Output:
    * Java Bean Created
    * SpringBoot Bean Created
    * Dependency Injection Through Constructor
    * SpringBoot Course Purchased Successfully and fees paid is 4554.4
    * Course purchased
    *
    * thats it.
    * */
    @Autowired
    public TShapedSkills(@Qualifier("springBoot") ICourse course){
        System.out.println("Dependency Injection Through Constructor");
        this.course = course;
    }

    /* 1.
    * Setter based injection is done using @Autowired on the setter method
    *
    * If you dont specify a Qualifier it will throw an error of
    * "No qualifying bean of type 'com.tshaped.SpringBootApp1.services.ICourse' available: expected single matching bean but found 2: java,springBoot"
    *
    * Why? Because there are 2 objects that are type ICourse course, i.e. SpringBoot and Java
    *
    * (Go to Java Class -> )
    * */


    /* 3.
    * Apart from @Primary we have @Qualifier as well
    *
    * Output:
    * Java Bean Created
    * SpringBoot Bean Created
    * SpringBoot Course Purchased Successfully and fees paid is 4554.4
    * Course purchased
    * */
//    @Autowired
//    @Qualifier("springBoot")
    public void setCourse(ICourse course) {
        this.course = course;
    }

    public boolean buyTheCourse(Double amount){
        return course.getTheCourse(amount);
    }

}
