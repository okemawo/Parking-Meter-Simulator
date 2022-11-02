/**This is a class called "PoliceOffice" used to create a new police officer.
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */


public class PoliceOfficer {
    // Attributes
    private String _name;
    private String _badge_Number;
    private ParkingTicket ticket;
    private ParkingMeter _meter;

    // Default Constructor
    public PoliceOfficer()
    {
        _name = "Cathy Bishop";
        _badge_Number = "CMU_ECE_123";
    }

    // Constructor with two arguments
    public PoliceOfficer(String name, String badge_Number)
    {
        _name = name;
        _badge_Number = badge_Number;
    }

    public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter)
    {
        ticket = new ParkingTicket(car, this, meter);
        return ticket;
    }

    // Getter Methods
    public String get_name()
    {
        return _name;
    }
    public String get_badge_Number()
    {
        return _badge_Number;
    }

    // Setter Methods
    public void set_name(String name)
    {
        _name = name;
    }

    public void set_badge_Number(String badge_number)
    {
        _badge_Number = badge_number;
    }

    // To string Method
    @Override
    public String toString()
    {
        return "--Reporting Officer Details" +
                "Name: " + _name + "\n" + "Badge Number: " + _badge_Number + "\n\n";
    }
}
