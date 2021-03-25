package Vehicle;
// Class Vehicle
public class VehicleSkoda {
    public static void main(String[] args) {
    
        Vehicle skoda = new Vehicle();
        
        // Define Sokoda Fabia values.
        // The variables of the objects are independent of each other.
        skoda.passangers = 4;
        skoda.fuelcap = 90;
        skoda.kmh = 120;
        // Print autonomy by class Vehicle.java
        skoda.autonomy();
        
    }
    
}