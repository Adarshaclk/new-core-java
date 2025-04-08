public class AirlinesRunner
{
    public static void main(String[] args) {
        String airlineName="airasia";
        String airlineCode="wef43g";
        String country="india";
        String headquarters="mumbai";
        int fleetSize=55;
        int totalDestinations=244;
        String alliance="nosaef";
        boolean international=true;
        double averageTicketPrice=12000.9;
        int yearFounded=1902;
            AirLines airlines=new AirLines(airlineName,airlineCode,country,headquarters,fleetSize,totalDestinations,alliance,international,averageTicketPrice,yearFounded);
            airlines.Air();

    }
}
