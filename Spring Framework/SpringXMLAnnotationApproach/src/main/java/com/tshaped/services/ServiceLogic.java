package com.tshaped.services;

import org.springframework.stereotype.Service;

/*
 * 3. As this is a Service Layer, We will add @Service
 * */

/*
* 11. If you want to give bean id, you can explicitly give it inside the @Service("serv").
* But if you dont create bean id, it is automatically created and it uses camel casing, EX: Bean id: serviceLogic
* This works for all.
* */
@Service
public class ServiceLogic {
    public ServiceLogic() {
        System.out.println("ServiceLogic Bean Created");
    }
}
