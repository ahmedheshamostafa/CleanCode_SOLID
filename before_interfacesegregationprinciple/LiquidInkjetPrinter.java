/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package before_interfacesegregationprinciple;

/**
 *
 * @author ahmed
 */
public class LiquidInkjetPrinter implements PrinterTasks{

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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void PrintDuplex(String PrintDuplexContent) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }