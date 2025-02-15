package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.TShapedSkills;

public class LaunchApp2 {
    public static void main(String[] args) {
        // Lazy Initialization
        // Spring will not Create any beans unless and until you use it
        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
        read.loadBeanDefinitions("applicationconfig.xml");

        TShapedSkills t = container.getBean(TShapedSkills.class);
        boolean status = t.buyTheCourse(454.4);
        if(status){
            System.out.println("Course Purchased Successfully!");
        }
        else{
            System.out.println("Failed to get the course");
        }
        // This should only create the object of TShapedSkills only i.e. Lazy Initialization
        /* Output
        * TShapedSkills Bean Created.
        * Java Bean Created.
        * Setter is called for setter injection
        * Java Course Purchased Successfully and fees paid is 454.4
        * Course Purchased Successfully!
        * */
    }
}
