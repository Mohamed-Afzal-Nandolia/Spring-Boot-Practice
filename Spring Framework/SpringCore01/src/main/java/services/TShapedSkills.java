package services;

public class TShapedSkills {
    private ICourse course;

    public TShapedSkills(){
        System.out.println("TShapedSkills Bean Created.");
    }

    // Adding for Constructor Injection
    public TShapedSkills(ICourse course){
        System.out.println("Dependency Injection via Constructor");
        this.course = course;
    }

    public void setCourse(ICourse course) { // ICourse iCourse = new Java(); or ICourse iCourse = new SpringBoot();
        System.out.println("Setter is called for setter injection");
        this.course = course;
    }

    public boolean buyTheCourse(Double amount){
        return course.getTheCourse(amount); // using methods which are coded in other classes
    }

}
