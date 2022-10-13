/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beforapplyopenclose;

/**
 *
 * @author ahmed
 */
public class Payroll {
    public double calculateSalary(Object employee, double hours){
        if(employee instanceof Developer){
            Developer dev=(Developer) employee;
            return dev.calculateSalary(hours);
        }
        else if(employee instanceof TeamLeader){
            TeamLeader leader=(TeamLeader) employee;
            return leader.calculateTeamLeaderSalary(hours);
        }
        else if(employee instanceof Tester){
            Tester tester=(Tester) employee;
            return tester.calculateTesterSalary(hours);
        }
        return -1;
    }
}
