/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beforapplyopenclose;

/**
 *
 * @author ahmed
 */
public class BeforApplyOpenClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Developer ahmed=new Developer();
        ahmed.setHourluRate(12);
        
        TeamLeader hesham=new TeamLeader();
        hesham.setHourluRate(20);
        
        Tester mostafa=new Tester();
        mostafa.setHourluRate(8);
        
        Payroll payroll=new Payroll();
        
        System.out.println("Dev salary = "+ payroll.calculateSalary(ahmed, 100));
        System.out.println("Leader salary = "+payroll.calculateSalary(hesham, 100));
        System.out.println("Tester salary = "+payroll.calculateSalary(mostafa, 100));
        
    }
    
}
