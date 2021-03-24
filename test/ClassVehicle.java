// Class Vehicle
public class ClassVehicle {
    public static void main(String[] args) {
    
        Vehicle skoda = new Vehicle();
        
        int autonomy;
        // Define Sokoda Fabia values.
        skoda.passangers = 4;
        skoda.fuelcap = 90;
        skoda.kmh = 120;
        // Calculates the autonomy of the vehicle
        autonomy = skoda.fuelcap * skoda.kmh / skoda.passangers;
        System.out.println(autonomy);
    }
    
}