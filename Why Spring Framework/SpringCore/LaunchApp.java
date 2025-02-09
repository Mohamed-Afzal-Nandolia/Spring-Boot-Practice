package SpringCore;
/*
* 3. Continue from TShapedSkills.java
*
* From the Main Method perspective,
* we have 3 more classes, i.e TShapedSkills.java, Java.java and SpringBoot.java
* Out of which TShapedSkills is the target class and Java, SpringBoot are Dependent Class
*
* Target Class: such a class where services of other classes are being used.
* Inside the TShapedSkills are we using methods which are coded in other classes? Yes we are.
*
* Dependent Class: such objects (new Java() or new SpringBoot()) whose classes or method/services are being used.
* So Java, SpringBoot are Dependent Class.
*
* IMPORTANT:
* Now, Injecting Dependent Object into the Target Class is called as Dependency Injection.
*
* Now, Injecting Dependent Object into the Target Class Using Setters is called as Setter Injection.
*
* Now, Injecting Dependent Object into the Target Class Using Constructor is called as Constructor Injection.
* EX: TShapedSkills t = new TShapedSkills(new Java());
*
* Now as we can see inside the TShapedSkills class we are not using the name Java or SpringBoot,
* this means TShapedSkills, Java and SpringBoot are Loosely Coupled with each other.
* This is the purpose of Spring Framework.
*
* If we see this class, we are creating the object of TShapedSkills class, Java class and Spring Boot class as well.
* Main method class and TShapedSkills class is still Tightly Coupled.
* Spring Framework will take care of everything. But how to talk to spring?
*
* You can configure spring framework using XML, XML + Annotation, Annotation + Spring Boot approach.
* */
import services.Java;
import services.SpringBoot;
import services.TShapedSkills;

public class LaunchApp {
    public static void main(String[] args) {
        TShapedSkills t = new TShapedSkills(); // Target Class

        // Dependency Injection
        t.setCourse(new Java()); // new Java() Dependent Object
        t.setCourse(new SpringBoot()); // new SpringBoot() Dependent Object

        boolean status = t.buyTheCourse(4999.4);
        if (status){
            System.out.println("Success!");
        }
        else{
            System.out.println("Failed to get the course");
        }

    }
}

/*
2.
* If using Inheritance (extends), this will also be a case of Tight Coupling.

class Alpha {
    public void alpha(){
        // some logic
    }
}

class Beta extends Alpha{
    public void beta(){
//        Alpha a = new Alpha();
//        a.alpha();
        alpha(); // Tight Coupling or Tightly Bonded
    }
}

public class LaunchApp {
    public static void main(String[] args) {

    }
}
*/

/*
1.
* If Alpha class gets commented or something wrong happens with Alpha class,
* It will impact the Beta class, hence Tight Coupling.
*
class Alpha {
    public void alpha(){
        // some logic
    }
}

class Beta {
    public void beta(){
        Alpha a = new Alpha();
        a.alpha(); // Tight Coupling
    }
}

public class LaunchApp {
    public static void main(String[] args) {

    }
}
*/