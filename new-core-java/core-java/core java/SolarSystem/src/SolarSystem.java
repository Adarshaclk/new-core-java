public class SolarSystem {
        String name;
        int numberOfPlanets;
        int numberOfMoons;
        String starName;
        double ageInBillionYears;
        boolean hasAsteroidBelt;
        boolean hasComets;
        int dwarfPlanets;
        double distanceFromGalacticCenter;
        String galaxyName;

        SolarSystem(String name) {
            this.name = name;
        }

        SolarSystem(String name, int numberOfPlanets) {
            this(name);
            this.numberOfPlanets = numberOfPlanets;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons) {
            this(name, numberOfPlanets);
            this.numberOfMoons = numberOfMoons;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName) {
            this(name, numberOfPlanets, numberOfMoons);
            this.starName = starName;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears) {
            this(name, numberOfPlanets, numberOfMoons, starName);
            this.ageInBillionYears = ageInBillionYears;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears, boolean hasAsteroidBelt) {
            this(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears);
            this.hasAsteroidBelt = hasAsteroidBelt;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears, boolean hasAsteroidBelt, boolean hasComets) {
            this(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears, hasAsteroidBelt);
            this.hasComets = hasComets;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears, boolean hasAsteroidBelt, boolean hasComets, int dwarfPlanets) {
            this(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears, hasAsteroidBelt, hasComets);
            this.dwarfPlanets = dwarfPlanets;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears, boolean hasAsteroidBelt, boolean hasComets, int dwarfPlanets, double distanceFromGalacticCenter) {
            this(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears, hasAsteroidBelt, hasComets, dwarfPlanets);
            this.distanceFromGalacticCenter = distanceFromGalacticCenter;
        }

        SolarSystem(String name, int numberOfPlanets, int numberOfMoons, String starName, double ageInBillionYears, boolean hasAsteroidBelt, boolean hasComets, int dwarfPlanets, double distanceFromGalacticCenter, String galaxyName) {
            this(name, numberOfPlanets, numberOfMoons, starName, ageInBillionYears, hasAsteroidBelt, hasComets, dwarfPlanets, distanceFromGalacticCenter);
            this.galaxyName = galaxyName;
        }

        public void displayInfo() {
            System.out.println("Solar System Name: " + name);
            System.out.println("Number of Planets: " + numberOfPlanets);
            System.out.println("Number of Moons: " + numberOfMoons);
            System.out.println("Star Name: " + starName);
            System.out.println("Age (in billion years): " + ageInBillionYears);
            System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
            System.out.println("Has Comets: " + hasComets);
            System.out.println("Number of Dwarf Planets: " + dwarfPlanets);
            System.out.println("Distance from Galactic Center (light-years): " + distanceFromGalacticCenter);
            System.out.println("Galaxy Name: " + galaxyName);
        }
    }



