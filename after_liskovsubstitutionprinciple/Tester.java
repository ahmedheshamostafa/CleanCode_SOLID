/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package after_liskovsubstitutionprinciple;

/**
 *
 * @author ahmed
 */
public class Tester extends FullTimeEmployee{
    @Override
     public double calaculareSalary(int workedhours){
        return workedhours*getSalrayRate()*.65;
    }
    
    @Override
    public double clacluateBounce(int BounceWorkedhours){
        return BounceWorkedhours*getSalrayRate()*1.5;
    }
}
