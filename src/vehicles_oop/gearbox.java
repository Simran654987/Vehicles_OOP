
package vehicles_oop;


public class gearbox extends Vehicles{
    
    String m_or_a;

    public gearbox(String m_or_a, int VIN, String regestration_num, String color, double weight, int no_wheels, double engine_cap, String type, String name, String address, int milage, String driver_number) {
        super(VIN, regestration_num, color, weight, no_wheels, engine_cap, type, name, address, milage, driver_number);
        this.m_or_a = m_or_a;
    }
    
    public void print(){
    System.out.println(m_or_a);
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
