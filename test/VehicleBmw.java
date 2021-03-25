// Class Vehicle
public class VehicleBmw {
    public static void main(String[] args) {
    
        Vehicle bmw = new Vehicle();
        
        // Define Sokoda Fabia values.
        // The variables of the objects are independent of each other.
        bmw.passangers = 6;
        bmw.fuelcap = 120;
        bmw.kmh = 220;
        // Print autonomy by class Vehicle.java
        bmw.autonomy();
        
    }
    
}