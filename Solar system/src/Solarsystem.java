public class Solarsystem {

    String systemName;
    int numberOfPlanets;
    String centralStar;
    double ageInBillions;
    boolean hasAsteroidBelt;
    int numberOfMoons;
    String largestPlanet;
    String nearestGalaxy;
    String dominantElement;
    String discoveryMethod;
    public Solarsystem() {
        System.out.println("Default Constructor");
    }


    public Solarsystem(String systemName, int numberOfPlanets, String centralStar, double ageInBillions, boolean hasAsteroidBelt) {
        this();
        this.systemName = systemName;
        this.numberOfPlanets = numberOfPlanets;
        this.centralStar = centralStar;
        this.ageInBillions = ageInBillions;
        this.hasAsteroidBelt = hasAsteroidBelt;
        System.out.println("Constructor 2: Calls Constructor 1");
    }


    public Solarsystem(String systemName, int numberOfPlanets, String centralStar, double ageInBillions, boolean hasAsteroidBelt, int numberOfMoons, String largestPlanet) {
        this(systemName, numberOfPlanets, centralStar, ageInBillions, hasAsteroidBelt);
        this.numberOfMoons = numberOfMoons;
        this.largestPlanet = largestPlanet;
        System.out.println("Constructor 3: Calls Constructor 2");
    }


    public Solarsystem(String systemName, int numberOfPlanets, String centralStar, double ageInBillions, boolean hasAsteroidBelt, int numberOfMoons, String largestPlanet, String nearestGalaxy, String dominantElement) {
        this(systemName, numberOfPlanets, centralStar, ageInBillions, hasAsteroidBelt, numberOfMoons, largestPlanet);
        this.nearestGalaxy = nearestGalaxy;
        this.dominantElement = dominantElement;
        System.out.println("Constructor 4: Calls Constructor 3");
    }


    public Solarsystem(String systemName, int numberOfPlanets, String centralStar, double ageInBillions, boolean hasAsteroidBelt, int numberOfMoons, String largestPlanet, String nearestGalaxy, String dominantElement, String discoveryMethod) {
        this(systemName, numberOfPlanets, centralStar, ageInBillions, hasAsteroidBelt, numberOfMoons, largestPlanet, nearestGalaxy, dominantElement);
        this.discoveryMethod = discoveryMethod;
        System.out.println("Constructor 5: Calls Constructor 4");
    }

    public static void main(String[] args) {
        Solarsystem solarSystem = new Solarsystem("Milky Way Solar System", 8,
                "Sun", 4.6, true, 214, "Jupiter",
                "Andromeda", "Hydrogen", "Spectroscopy");
    }

}
