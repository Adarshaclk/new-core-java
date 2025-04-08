
public class SolarSystemRunner {
    public static void main(String[] args) {
        String name = "Solar System";
        int numberOfPlanets = 8;
        int numberOfMoons = 200;
        String starName = "Sun";
        double ageInBillionYears = 4.6;
        boolean hasAsteroidBelt = true;
        boolean hasComets = true;
        int dwarfPlanets = 5;
        double distanceFromGalacticCenter = 27000;
        String galaxyName = "Milky Way";

        SolarSystem solarSystem = new SolarSystem(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears, hasAsteroidBelt, hasComets, dwarfPlanets, distanceFromGalacticCenter, galaxyName);
        solarSystem.displayInfo();
    }
}
