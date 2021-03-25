public class Vehicle {

    int passangers; // Passangers number.
    int fuelcap;    // Fuel capacity.
    int kmh;        // Speed in Km by hour.

    // If the method does not return values ​​it must be void.
    void autonomy() {
        int autonomy = fuelcap * kmh / passangers; // Vehicle autonomy.
        System.out.printf("Values are: %d passangers %d fuelcap %d kmh = %d km Total autonomy", passangers, fuelcap, kmh, autonomy);
    }

}