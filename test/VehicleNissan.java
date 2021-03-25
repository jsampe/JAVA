// Class Vehicle
public class VehicleNissan {
    public static void main(String[] args) {
    
        Vehicle nissan = new Vehicle();
        
        // Define Sokoda Fabia values.
        // The variables of the objects are independent of each other.
        nissan.passangers = 2;
        nissan.fuelcap = 45;
        nissan.kmh = 90;
        // Print autonomy by class Vehicle.java
        nissan.autonomy();
        
    }
    
}