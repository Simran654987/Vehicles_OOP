
package vehicles_oop;


public class Vehicles {
    int VIN;
    String regestration_num;
    String color;
    double weight;
    int no_wheels;
    double engine_cap;
    String type;
    String name;
    String address;
    int milage;
    String driver_number;

    public Vehicles(int VIN, String regestration_num, String color, double weight, int no_wheels, double engine_cap, String type, String name, String address, int milage, String driver_number) {
        this.VIN = VIN;
        this.regestration_num = regestration_num;
        this.color = color;
        this.weight = weight;
        this.no_wheels = no_wheels;
        this.engine_cap = engine_cap;
        this.type = type;
        this.name = name;
        this.address = address;
        this.milage = milage;
        this.driver_number = driver_number;
    }
    
    public void print(){
    System.out.println(VIN);
    System.out.println(regestration_num);
    System.out.println(color);
    System.out.println(weight);
    System.out.println(no_wheels);
    System.out.println(engine_cap);
    System.out.println(type);
    System.out.println(name);
    System.out.println(address);
    System.out.println(milage);
    System.out.println(driver_number);
}
    
    
}
