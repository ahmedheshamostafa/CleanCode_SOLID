package afterapplyopenclose_strategypattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmed
 */
public class Payroll {
 Employee employee;
    public Payroll(Employee employee) {
        this.employee = employee;
    }
    
 public double calculateSalary(double workedHours){
     return this.employee.calculateSalary(workedHours);
 }
   }
