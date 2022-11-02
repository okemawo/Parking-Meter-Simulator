/**This is a class for test case 1
 *
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.awt.*;

public class Test_Case_1
{
    public static void test_case()
    {
        // Creating and instantiating instances from classes for a test case
        ParkingMeter M1 = new ParkingMeter(60);
        ParkedCar car1 = new ParkedCar("TOYOTA", "Hilux", Color.BLACK, "XABZNIG123", 40);
        PoliceOfficer p1 = new PoliceOfficer();
        ParkingTicket ticket = p1.issueTicket(car1, M1);

        // Test Case
        if(ticket.get_fine() == 0)
        {
            System.out.println("\n1. The ParkedCar is within the parking time purchased.");
        }

    }
}
