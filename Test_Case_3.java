/**This is a class for test case 3
 *
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

import java.awt.*;

public class Test_Case_3
{
    public static void test_case()
    {
        // Creating and instantiating instances from classes for a test case
        ParkedCar car1 = new ParkedCar("TOYOTA", "Hilux", Color.BLACK, "XABZNIG123", 56);
        ParkingMeter M1 = new ParkingMeter(60);
        PoliceOfficer p1 = new PoliceOfficer();
        ParkingTicket ticket = p1.issueTicket(car1, M1);

        // Test Case
        if(( M1.get_parking_Time_Purchased() - ticket.get_car().get_minutes_Parked() ) < 5)
        {
            System.out.println("\n3. The ParkedCar is just barely within the parking time purchased.");
        }

    }
}
