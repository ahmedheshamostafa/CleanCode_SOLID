/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package after_interfacesegregationprinciple;

/**
 *
 * @author ahmed
 */
public class HPLaserJetPrinter implements PrintingTasks,ScanTasks,FaxTasks,DuplexTasks{

        @Override
    public void Print(String PrintContent) {
            System.out.println(PrintContent);
    }

    @Override
    public void Scan(String ScanContent) {
            System.out.println(ScanContent);
    }

    @Override
    public void Fax(String FaxContent) {
            System.out.println(FaxContent);
    }

    @Override
    public void PrintDuplex(String PrintDuplexContent) {
            System.out.println(PrintDuplexContent);
    }
    
}
