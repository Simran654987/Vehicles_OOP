
package vehicles_oop;
import java.util.Scanner;

public class Vehicles_OOP {

    public static void main(String[] args) {
        Scanner y = new Scanner (System.in);
        System.out.println("Does your vehicle have gear box: yes or no");
        String in = y.nextLine();
        
        if(in=="yes"){
    gearbox newcar = new gearbox("manual", 789, "oie8 5sf", "white", 15, 4, 456, "car", "tom", "rwuopqrwowpru", 546879, "wqriu34"); 
     

    newcar.print();
        }
        
        if(in=="no"){
        Vehicles newcar = new Vehicles(789, "oie8 5sf", "white", 15, 4, 456, "car", "tom", "rwuopqrwowpru", 546879, "wqriu34"); 
     

    newcar.print();
        }
        
        else{System.out.println("Invaild response");}
        
        
    }
    
}
