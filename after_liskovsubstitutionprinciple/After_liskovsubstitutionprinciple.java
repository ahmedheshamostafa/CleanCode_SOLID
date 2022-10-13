/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package after_liskovsubstitutionprinciple;

/**
 *
 * @author ahmed
 */
public class After_liskovsubstitutionprinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FullTimeEmployee  dev=new Developer();        
        FullTimeEmployee tester=new Tester();        
        TempEmployee temp=new Trainee();
        
        dev.setSalrayRate(150);
        System.out.println("Salary = "+dev.calaculareSalary(100));
        System.out.println("Bounce = "+dev.clacluateBounce(10));
        
        tester.setSalrayRate(150);
        System.out.println("Salary = "+tester.calaculareSalary(100));
        System.out.println("Bounce = "+tester.clacluateBounce(10));   

        temp.setSalrayRate(150);
        System.out.println("Salary = "+temp.calaculareSalary(100));
         
        
    }
    
}
