// Class Vehicle
public class VehicleBmw {
    public static void main(String[] args) {
    
        Vehicle skoda = new Vehicle();
        
        int autonomy;
        // Define Sokoda Fabia values.
        skoda.passangers = 6;
        skoda.fuelcap = 120;
        skoda.kmh = 220;
        // Calculates the autonomy of the vehicle
        autonomy = skoda.fuelcap * skoda.kmh / skoda.passangers;
        System.out.println(autonomy);

        System.out.println(skoda.passangers + skoda.fuelcap + skoda.kmh);

    }
    
}