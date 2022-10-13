/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add;

/**
 *
 * @author ahmed
 */
public class Address {
    private String street;
    private int BuildingNumber;
    private int floorNumber;
    private int apartmentNumber;
    private String district;
    private String state;
    private String country;
    
    public Address(int BuildingNumber,String street,String district){
        this.BuildingNumber=BuildingNumber;
        this.street=street;
            }
        public Address(int BuildingNumber,int apartmentNumber,int floorNumber,
        String street,String district
        ,String state,String country){
        this.BuildingNumber=BuildingNumber;
        this.street=street;
        this.floorNumber=apartmentNumber;
        this.apartmentNumber=apartmentNumber;
        this.district=district;
        this.state=state;
        this.country=country;
            }   
  
   }
