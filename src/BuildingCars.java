class Car {

    // Variables.
    int passangers; // Passangers number.
    int fuelcap; // Fuel capacity.
    int kmh; // Speed in Km by hour.
    // Builder.

    Car(int p, int f, int k) {
        passangers = p;
        fuelcap = f;
        kmh = k;
    }

    // Method calculate autonomy.
    int autonomy() {
        return fuelcap * kmh / passangers; // Vehicle autonomy.
    }

}

class BuildingCars {
    public static void main(String[] args) {
    // Create one car.
    Car skoda  = new Car(4, 80, 220);
    // Create one more.
    Car nissan = new Car(4, 95, 240);

    // You can operate with this directly
    System.out.printf("SkodaF have %d L fuelcap %d Kmh %d passangers \n", skoda.fuelcap, skoda.kmh, skoda.passangers);
    System.out.printf("Nisaan have %d L fuelcap %d Kmh %d passangers \n", nissan.fuelcap, nissan.kmh, nissan.passangers);

    System.out.printf("SkodaF autonomy %d \n", skoda.autonomy());
    System.out.printf("Nissan autonomy %d \n", nissan.autonomy());
    
    System.out.printf("Skoda autonomy is greater than Nissan %b \n", skoda.autonomy() > nissan.autonomy());
    
    System.out.println(skoda.autonomy() > nissan.autonomy()); // Show false
    System.out.println(skoda.autonomy() * nissan.autonomy()); // Show true
    System.out.println(skoda.autonomy() == nissan.autonomy()); // Show false

    }

}