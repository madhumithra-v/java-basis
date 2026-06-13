import java.util.ArrayList;
import java.util.List;

class Stop {
    String stopName;
    String arrivalTime;
    int boarded;
    int left;

    public Stop(String stopName, String arrivalTime, int boarded, int left) {
        this.stopName = stopName;
        this.arrivalTime = arrivalTime;
        this.boarded = boarded;
        this.left = left;
    }
}

public class BusRouteManagement {

    public static void main(String[] args) {

        String busNumber = "12A";
        String startStop = "Central Bus Stand";
        String currentLocation = "Market Stop";
        String lastStop = "City Terminus";

        List<Stop> route = new ArrayList<>();

        route.add(new Stop("Central Bus Stand", "08:00 AM", 20, 0));
        route.add(new Stop("Railway Station", "08:10 AM", 8, 3));
        route.add(new Stop("Market Stop", "08:20 AM", 5, 6));
        route.add(new Stop("College", "08:30 AM", 12, 4));
        route.add(new Stop("Hospital", "08:40 AM", 4, 7));
        route.add(new Stop("City Terminus", "08:50 AM", 0, 29));

        int passengerCount = 0;

        System.out.println("==================================================");
        System.out.println("              BUS ROUTE MANAGEMENT");
        System.out.println("==================================================\n");

        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Start Stop      : " + startStop);
        System.out.println("Current Location: " + currentLocation);
        System.out.println("Last Stop       : " + lastStop);

        System.out.println("\nRoute Flow");
        System.out.println("--------------------------------------------------");
        System.out.println("Central Bus Stand");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Railway Station");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Market Stop");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("College");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Hospital");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("City Terminus");

        System.out.println("\n--------------------------------------------------");
        System.out.printf("%-20s %-10s %-7s %-7s %-7s%n",
                "Stop Name", "Arrival", "Board", "Leave", "Count");
        System.out.println("--------------------------------------------------");

        for (Stop stop : route) {

            passengerCount += stop.boarded;
            passengerCount -= stop.left;

            System.out.printf("%-20s %-10s %-7d %-7d %-7d%n",
                    stop.stopName,
                    stop.arrivalTime,
                    stop.boarded,
                    stop.left,
                    passengerCount);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("\nFinal Passenger Count : " + passengerCount);
        System.out.println("==================================================");
    }
}