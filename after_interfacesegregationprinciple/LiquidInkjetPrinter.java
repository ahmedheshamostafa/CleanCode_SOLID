/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package after_interfacesegregationprinciple;

/**
 *
 * @author ahmed
 */
public class LiquidInkjetPrinter implements PrintingTasks,ScanTasks{

    @Override
    public void Print(String PrintContent) {
            System.out.println(PrintContent);
    }

    @Override
    public void Scan(String ScanContent) {
            System.out.println(ScanContent);
    }

    
}
