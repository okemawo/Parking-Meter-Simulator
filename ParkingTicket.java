/**This is a class called "ParkingTicket" used to create a new ticket and
 * prints it out for the offender.
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */

class ParkingTicket
{
    // Attributes
    private ParkedCar _car;
    private PoliceOfficer _officer;
    private double _fine = 0;
    private double _minutes_Over_Parked = 0;
    private final double hour = 60;
    private ParkingMeter _meter;

    // Default Constructor
    public ParkingTicket()
    {
        _car = new ParkedCar();
        _officer = new PoliceOfficer();
        _meter = new ParkingMeter();
        calculate_Fine();
    }

    // Constructor with multiple argument
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter meter)
    {
        _car = car;
        _officer = officer;
        _meter = meter;
        calculate_Fine();
    }

    // Getter Methods
    public ParkedCar get_car()
    {
        return _car;
    }

    public PoliceOfficer get_officer() {
        return _officer;
    }
    public double get_fine()
    {
        return _fine;
    }

    public double get_minutes_Over_Parked()
    {
        return _minutes_Over_Parked;
    }
    public ParkingMeter get_meter()
    {
        return _meter;
    }

    // Method to calculate fine based on time exceeded
    public void calculate_Fine()
    {
        if(_car.get_minutes_Parked() > _meter.get_parking_Time_Purchased())
        {
            _minutes_Over_Parked = (_car.get_minutes_Parked() - _meter.get_parking_Time_Purchased());

            if((_minutes_Over_Parked - hour) <= 0)
            {
                _fine = 25;
            }
            if((_minutes_Over_Parked - hour) > 0)
            {
                _fine = 25 + ( 10 * Math.ceil( (_minutes_Over_Parked - hour) / hour ) );
            }
            print_Ticket();
        }
    }

    // Prints a ticket by returning the ToString Method.
    private ParkingTicket print_Ticket()
    {
        return this;
    }

    // To string Method
    @Override
    public String toString()
    {
        return "\n************KIGALI HEIGHTS PARKING TICKET************\n\n" + "++CAR DETAILS: \n" +
                "Car Type: " + _car.get_make() + " " + _car.get_model() + "\n" + "Color: " + _car.get_color() +
                "\n" + "License Plate Number: " + _car.get_license_Plate() + "\n" +
                "Extra Minutes Parked: " + _minutes_Over_Parked + "\n" +
                "\n------------------------------------------\n\n" + "--REPORTING OFFICER: \n" +
                "Name: " + _officer.get_name() + "\n" + "Badge Number: " + _officer.get_badge_Number() + "\n\n" +
                "TOTAL FINE: " + _fine + "\n\n" +"************Thank you************";
    }
}