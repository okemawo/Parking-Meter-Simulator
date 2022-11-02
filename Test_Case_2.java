/**This is a class for test case 2
 *
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.awt.*;

public class Test_Case_2
{
    public static void test_case()
    {
        // Creating and instantiating instances from classes for a test case
        ParkedCar car1 = new ParkedCar("TOYOTA", "Hilux", Color.BLACK, "XABZNIG123", 80);
        ParkingMeter M1 = new ParkingMeter(60);
        PoliceOfficer p1 = new PoliceOfficer();
        ParkingTicket ticket = p1.issueTicket(car1, M1);

        // Test Case
        if(ticket != null)
        {
            System.out.println("\n2. The ParkedCar is over the parking time purchased.");
        }

    }
}
