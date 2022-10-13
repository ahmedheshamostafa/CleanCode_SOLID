/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package befor_liskovsubstitutionprinciple;

/**
 *
 * @author ahmed
 */
public class Developer extends Employee {
    @Override
     public double calaculareSalary(int workedhours){
        return workedhours*getSalrayRate()*.75;
    }
    
    @Override
    public double clacluateBounce(int BounceWorkedhours){
        return BounceWorkedhours*getSalrayRate()*.95;
    }
}
