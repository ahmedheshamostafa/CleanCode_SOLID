/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beforapplyopenclose;

/**
 *
 * @author ahmed
 */
public class Developer {
    private double hourluRate;

    public double getHourluRate() {
        return hourluRate;
    }

    public void setHourluRate(double hourluRate) {
        this.hourluRate = hourluRate;
    }
    
    public double calculateSalary(double hours ){
        return hours*getHourluRate();
    }
    
}
