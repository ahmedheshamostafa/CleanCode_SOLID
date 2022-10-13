package afterapplyopenclose_strategypattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmed
 */
public class Developer implements Employee{
    private double workedHourCost;
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
