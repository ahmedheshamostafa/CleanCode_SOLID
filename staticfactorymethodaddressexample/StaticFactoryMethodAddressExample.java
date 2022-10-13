/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticfactorymethodaddressexample;

/**
 *
 * @author ahmed
 */
public class StaticFactoryMethodAddressExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address shortAddress=Address.createShorteAddress(1, "tahrir", "helwan");
        Address fullAddress=Address.createFullAddress(1, 4, 4, "tahrir", "helwan", "cairo", "Egtpt");
    }
    
}
