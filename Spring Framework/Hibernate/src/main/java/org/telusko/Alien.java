package org.telusko;

import jakarta.persistence.*;

import java.util.List;
/*
* 7.
* Change the name of the table or columns by adding (name = "any_name")
* Creating a new Class Alien and Laptop

@Entity()
@Table(name="alien_table")
public class Alien {

    @Id
    private int aid;

    @Column(name="alien_name")
    private String aname;

    @Column(name="alien_tech")
    private String tech;

    @OneToOne // This annotation means that 1 Alien can have 1 Laptop
    @Column(name="alien_laptop")
    private Laptop laptop;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                ", model_number='" + model_number + '\'' +
                '}';
    }

    @Transient // This annotation will make sure that this column name doesn't create in the db
    private String model_number;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
*/

@Entity()
public class Alien {

    @Id
    private int aid;

    private String aname;

    private String tech;

    @OneToMany(mappedBy = "alien", cascade = CascadeType.ALL) // This annotation means that 1 Alien can have Many Laptop
    private List<Laptop> laptops;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptop) {
        this.laptops = laptop;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
