/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package afterapplyopenclose_strategypattern;

/**
 *
 * @author ahmed
 */
public class AfterApplyOpenClose_StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Developer ahmed=new Developer();
        ahmed.setWorkedHourCost(12);
        
        TeamLeader hesham=new TeamLeader();
        hesham.setWorkedHourCost(20);
        
        Tester mostafa=new Tester();
        mostafa.setWorkedHourCost(8);
        
        
        System.out.println("Dev salary = "+ new Payroll(ahmed).calculateSalary(100));
        System.out.println("Leader salary = "+new Payroll(hesham).calculateSalary(100));
        System.out.println("Tester salary = "+ new Payroll(mostafa).calculateSalary(100));
    }
    
}
