/**This is a class for test case 8
 *
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.awt.*;

public class Test_Case_8
{
    public static void test_case()
    {
        // Creating and instantiating instances from classes for a test case
        ParkingMeter M1 = new ParkingMeter(60);
        ParkedCar car1 = new ParkedCar("TOYOTA", "Hilux", Color.BLACK, "XABZNIG123", 120);
        PoliceOfficer p1 = new PoliceOfficer();
        ParkingTicket ticket = p1.issueTicket(car1, M1);

        // Test Case
        if(ticket.get_car().get_minutes_Parked() - M1.get_parking_Time_Purchased() == 60)
        {
            System.out.println("\n8. The ParkedCar is ticketed for being exactly 1 hour over the time purchased.");
        }

    }
}
