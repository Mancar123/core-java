public class Airline {

    String airlineName;
    String airlineCode;
    String headquarters;
    int fleetSize;
    int yearlyPassengers;
    boolean isFlagCarrier;
    int numberOfHubs;
    String alliance;
    String contactEmail;
    String foundingYear;

    public Airline() {
        System.out.println("Default Constructor");
    }

    public Airline(String airlineName, String airlineCode, String headquarters, int fleetSize, int yearlyPassengers) {
        this();
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.headquarters = headquarters;
        this.fleetSize = fleetSize;
        this.yearlyPassengers = yearlyPassengers;
        System.out.println("Constructor 2: Calls Constructor 1");
    }

    public Airline(String airlineName, String airlineCode, String headquarters, int fleetSize, int yearlyPassengers, boolean isFlagCarrier, int numberOfHubs) {
        this(airlineName, airlineCode, headquarters, fleetSize, yearlyPassengers);
        this.isFlagCarrier = isFlagCarrier;
        this.numberOfHubs = numberOfHubs;
        System.out.println("Constructor 3: Calls Constructor 2");
    }


    public Airline(String airlineName, String airlineCode, String headquarters, int fleetSize, int yearlyPassengers, boolean isFlagCarrier, int numberOfHubs, String alliance, String contactEmail) {
        this(airlineName, airlineCode, headquarters, fleetSize, yearlyPassengers, isFlagCarrier, numberOfHubs);
        this.alliance = alliance;
        this.contactEmail = contactEmail;
        System.out.println("Constructor 4: Calls Constructor 3");
    }


    public Airline(String airlineName, String airlineCode, String headquarters, int fleetSize, int yearlyPassengers, boolean isFlagCarrier, int numberOfHubs, String alliance, String contactEmail, String foundingYear) {
        this(airlineName, airlineCode, headquarters, fleetSize, yearlyPassengers, isFlagCarrier, numberOfHubs, alliance, contactEmail);
        this.foundingYear = foundingYear;
        System.out.println("Constructor 5: Calls Constructor 4");
    }


    public static void main(String[] args) {
        Airline airline = new Airline("Singapore Airlines", "SQ",
                "Singapore", 150, 18000000, true, 6,
                "Star Alliance", "support@singaporeair.com", "1947");
    }
}
