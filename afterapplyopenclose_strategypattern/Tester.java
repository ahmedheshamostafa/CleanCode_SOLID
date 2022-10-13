package afterapplyopenclose_strategypattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmed
 */
public class Tester implements Employee{

    private double workedHourCost;
     public double calculateBounce(double hoursworked){
        if(hoursworked>100)return 500;
        return 0;
    }
    public double getWorkedHourCost() {
        return workedHourCost;
    }

    public void setWorkedHourCost(double workedHourCost) {
        this.workedHourCost = workedHourCost;
    }
    @Override    
    public double calculateSalary(double workedHours) {
        return workedHours*getWorkedHourCost();
    }
}
