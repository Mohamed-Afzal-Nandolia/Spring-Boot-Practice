package services;

public class SpringBoot implements ICourse {
    public SpringBoot(){
        System.out.println("SpringBoot Bean Created.");
    }
    @Override
    public boolean getTheCourse(Double price) {
        System.out.println("SpringBoot Course Purchased Successfully and fees paid is " + price);
        return true;
    }
}
