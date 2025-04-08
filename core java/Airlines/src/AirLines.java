public class AirLines {

    String airlineName;
    String airlineCode;
    String country;
    String headquarters;
    int fleetSize;
    int totalDestinations;
    String alliance;
    boolean international;
    double averageTicketPrice;
    int yearFounded;


    AirLines(String airlineName) {
        this.airlineName = airlineName;
    }

    AirLines(String airlineName, String airlineCode) {
        this(airlineName);
        this.airlineCode = airlineCode;
    }

    AirLines(String airlineName, String airlineCode, String country) {
        this(airlineName, airlineCode);
        this.country = country;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters) {
        this(airlineName, airlineCode, country);
        this.headquarters = headquarters;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize) {
        this(airlineName, airlineCode, country, headquarters);
        this.fleetSize = fleetSize;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize, int totalDestinations) {
        this(airlineName, airlineCode, country, headquarters, fleetSize);
        this.totalDestinations = totalDestinations;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize, int totalDestinations, String alliance) {
        this(airlineName, airlineCode, country, headquarters, fleetSize, totalDestinations);
        this.alliance = alliance;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize, int totalDestinations, String alliance, boolean international) {
        this(airlineName, airlineCode, country, headquarters, fleetSize, totalDestinations, alliance);
        this.international = international;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize, int totalDestinations, String alliance, boolean international, double averageTicketPrice) {
        this(airlineName, airlineCode, country, headquarters, fleetSize, totalDestinations, alliance, international);
        this.averageTicketPrice = averageTicketPrice;
    }

    AirLines(String airlineName, String airlineCode, String country, String headquarters, int fleetSize, int totalDestinations, String alliance, boolean international, double averageTicketPrice, int yearFounded) {
        this(airlineName, airlineCode, country, headquarters, fleetSize, totalDestinations, alliance, international, averageTicketPrice);
        this.yearFounded = yearFounded;
    }


    public void Air() {
        System.out.println("airlines name :" + airlineName);
        System.out.println("airline code :"+airlineCode);
        System.out.println("country  :"+country);
        System.out.println("headquarter :"+headquarters);
        System.out.println("fleet size :"+fleetSize);
        System.out.println("total destination :"+totalDestinations);
        System.out.println("alliance  :"+alliance);
        System.out.println("is internatinal :"+international);
        System.out.println("averge ticket prize :"+averageTicketPrice);
        System.out.println("year founded:"+yearFounded);

    }
}