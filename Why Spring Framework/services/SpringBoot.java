package services;

public class SpringBoot implements ICourse {
    @Override
    public boolean getTheCourse(Double price) {
        System.out.println("SpringBoot Course Purchased Successfully and fees paid is " + price);
        return true;
    }
}
