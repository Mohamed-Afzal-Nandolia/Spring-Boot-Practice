package org.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

/*
* 1. Add Hibernate and MySQL dependency in the pom.xml
* 2. Created Pojo Class name Student
*
*
* Here in below examples we have CRUD operations that we do in db.
*     C -> persist
*     R -> get
*     U -> merge
*     D -> remove
* */
public class Main {
    /*
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("jRudy");
        s1.setRollno(3);
        s1.setAge(25);
        // 3.

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Student.class);
        cfg.configure();

        // in one line,
        // SessionFactory sf = new Configuration().addAnnotatedClass(org.telusko.Student.class).configure().buildSessionFactory();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession(); //Session is an interface of Hibernate

        Transaction transaction = session.beginTransaction(); // to add or change the data in db

        session.persist(s1);// .save is deprecated so using persist // We can create records with persist.

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
    */
    /*
    4. To get the data from db
    public static void main(String[] args) {
        Student s2 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.get(Student.class, 2);

        session.close();
        sf.close();

        System.out.println(s2);
    }
   */
    /*
    5. To update or create if not exits in db
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("jRudy");
        s1.setRollno(3);
        s1.setAge(19);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(s1); // Use merge to update or if not exists then it will create that record

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
   */
    /*
    6. To Delete a record in db
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.setsName("jRudy");
//        s1.setRollno(3);
//        s1.setAge(19);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        s1 = session.get(Student.class, 3); // get the student record

        Transaction transaction = session.beginTransaction();
        session.remove(s1); // then delete the student record

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
    Got to Alien Class
   */

    /*
    * 8. Add Embedded Annotation in Laptop class

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");
        a1.setLaptop(l1);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Alien.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
    */
    /*
    * 10. One to One Mapping

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");
        a1.setLaptop(l1);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Alien.class);
        cfg.addAnnotatedClass(org.telusko.Laptop.class); // Make sure to add this
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
    */
    /*
    * 11. OneToMany and ManyToOne
    * Change the Alien Class
    *
    * Adding 2 Laptops and Performing One to Many Relationship
    * */
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(5);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(6);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Alien a1 = new Alien();
        a1.setAid(103);
        a1.setAname("Jrudy");
        a1.setTech("Python");

        // Set the relationship
        l1.setAlien(a1);
        l2.setAlien(a1);
        a1.setLaptops(Arrays.asList(l1, l2));

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.telusko.Alien.class);
        cfg.addAnnotatedClass(org.telusko.Laptop.class); // Make sure to add this
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
}