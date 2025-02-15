package services;

public class Java implements ICourse{
    @Override
    public boolean getTheCourse(Double price) {
        System.out.println("Java Course Purchased Successfully and fees paid is " + price);
        return true;
    }
}
