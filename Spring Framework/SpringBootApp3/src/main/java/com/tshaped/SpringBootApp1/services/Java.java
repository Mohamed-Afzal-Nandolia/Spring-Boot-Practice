package com.tshaped.SpringBootApp1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
/*
* 2. Here you can add @Primary annotation, like in the XML approach we had used.
*
* If used @Primary
* Output:
* Java Bean Created
* SpringBoot Bean Created
* Java Course Purchased Successfully and fees paid is 4554.4
* Course purchased
*
* (Go to TShapedSkills Class)
* */
//@Primary
@Service
public class Java implements ICourse{
    public Java() {
        System.out.println("Java Bean Created");
    }

    @Override
    public boolean getTheCourse(Double price) {
        System.out.println("Java Course Purchased Successfully and fees paid is " + price);
        return true;
    }
}
