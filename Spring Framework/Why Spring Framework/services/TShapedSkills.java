package services;

/*
3.
 * If you want to use Alpha class method in Beta class with taking the name of Alpha,
 * No Inheritance, No composition, No static method,
 * Be in the position of invoking Alpha's method with any reference of Alpha in Beta class.
 * Then you can say that Alpha and Beta are Loosely Coupled or Loosely bonded.
 *
 * Note: As per the Strategy design pattern, When we write the business login that will be used by other classes as well,
 * we dont write the direct implementation. Always use Interface. Define what you want to do first.
 *
 * Continue to LaunchApp.java
 * */
public class TShapedSkills {
    private ICourse course;

    public void setCourse(ICourse iCourse) { // ICourse iCourse = new Java(); or ICourse iCourse = new SpringBoot();
        this.course = iCourse;
    }

    public boolean buyTheCourse(Double amount){
        return course.getTheCourse(amount); // using methods which are coded in other classes
    }

}
