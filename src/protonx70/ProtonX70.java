/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protonx70;

/**
 *
 * @author User
 */
public class ProtonX70 {

   
        String brand;

//your constructor here
ProtonX70(){
    this.brand="protonX70";
}
//write method getBrand here
ProtonX70(String b){
    this.brand=b;
}
public static void ProtonX70() {
	System.out.println("Car is running...");
}

public static void ProtonX70(String[] args) {
   ProtonX70 obj1 = new ProtonX70();
   ProtonX70 obj2= new ProtonX70("protonX70");
        
      
}
}
    
    

