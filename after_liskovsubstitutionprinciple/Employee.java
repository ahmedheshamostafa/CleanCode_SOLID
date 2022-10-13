/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package after_liskovsubstitutionprinciple;

import java.util.Date;

/**
 *
 * @author ahmed
 */
public class Employee {
    String first_name;
    String Second_name;
    double age;
    Date birthdate;
    double salrayRate;
    String livingAddress;
    int id;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return Second_name;
    }

    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public double getSalrayRate() {
        return salrayRate;
    }

    public void setSalrayRate(double salrayRate) {
        this.salrayRate = salrayRate;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double calaculareSalary(int workedhours){
        return workedhours*getSalrayRate();
    }
    
    
    
}
