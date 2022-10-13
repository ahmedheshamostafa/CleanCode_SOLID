/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package befor_liskovsubstitutionprinciple;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Befor_LiskovSubstitutionPrinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employees=new ArrayList();
        Employee dev=new Developer();
        employees.add(dev);
        Employee tester=new Tester();
        employees.add(tester);
        Employee temp=new Trainee();
        employees.add(temp);
        
        for(Employee e: employees){
            e.setSalrayRate(150);
            System.out.println("Salary = "+e.calaculareSalary(100));
            System.out.println("Bounce = "+e.clacluateBounce(10));
        }
        
    }
    
}
