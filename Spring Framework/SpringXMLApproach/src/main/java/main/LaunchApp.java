package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.TShapedSkills;

/*
* Activating the IOC Container, meaning we will hand over the entire control
* of object creation and dependency injection to Spring framework.
* On behalf of us Spring framework will create the objects then we call that as Bean.
* If an Object is created and it is managed by Spring framework it is called as Bean.
*
* As we want Spring framework to create the object, for which we have to activate the
* Spring framework and hand over the entire control to IOC Container which will take
* care of Object creation, Object management and Dependency injection.
*
* For which we have 2 Containers.
* --------------------------------------------------------------------------------------------------------------------------------------------|
* -> ApplicationContext | ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml"); // Eager Initialization |
*                       |    (Interface)                                (Class)                                                               |
* --------------------------------------------------------------------------------------------------------------------------------------------|
* IMPT: If you want to another xml configuration file to be loaded like applicationconfig.xml                                                 |
* then you will have to create complete another IOC Container for it                                                                          |
*  -------------------------------------------------------------------------------------------------------------------------------------------|
* -> BeanFactory        | DefaultListableBeanFactory container = new DefaultListableBeanFactory(); // Lazy Initialization                     |
*                       | XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);                                              |
*                       | read.loadBeanDefinitions("applicationconfig.xml");                                                                  |
*  -------------------------------------------------------------------------------------------------------------------------------------------|
* IMPT: You can use 1 single container to load many xml configuration file to be loaded like applicationconfig.xml                            |
* --------------------------------------------------------------------------------------------------------------------------------------------|

* */
public class LaunchApp {
    public static void main(String[] args) {
        // This is the XML approach
        // What Spring framework has to do is present on this file applicationconfig.xml
        // You will create this file inside resources package
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml"); // Activation of Spring framework
        // if you run this, 3 objects will be created according to the instructions provided in the xml file
        /*
        * Output:
        * SpringBoot Bean Created.
        * Java Bean Created.
        * TShapedSkills Bean Created.
        * */

        // IMP: Even though we are not using the objects, still all 3 objects are created is called "Eager Initialization"
        // If you go with BeanFactory, Objects will not be created unless and until you are going to use it

        TShapedSkills t = container.getBean(TShapedSkills.class);// we are asking IOC Container to get the Bean of TShapedSkills class
        boolean status = t.buyTheCourse(454.4);
        if(status){
            System.out.println("Course Purchased Successfully!");
        }
        else{
            System.out.println("Failed to get the course");
        }
        /* -> Setter Injection
        * SpringBoot Bean Created.
        * Java Bean Created.
        * TShapedSkills Bean Created.
        * Setter is called for setter injection
        * Java Course Purchased Successfully and fees paid is 454.4
        * Course Purchased Successfully!
        * */

        /* -> Constructor Injection
        * SpringBoot Bean Created.
        * Java Bean Created.
        * Dependency Injection via Constructor
        * Java Course Purchased Successfully and fees paid is 454.4
        * Course Purchased Successfully!
        * */

    }
}
