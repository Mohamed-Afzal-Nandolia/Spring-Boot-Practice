package services;

public class Java implements ICourse{
    public Java(){
        System.out.println("Java Bean Created.");
    }
    @Override
    public boolean getTheCourse(Double price) {
        System.out.println("Java Course Purchased Successfully and fees paid is " + price);
        return true;
    }
}
