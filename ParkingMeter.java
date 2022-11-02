/**This is a class called "ParkingMeter" used to create a new parking meter to allocate parking time.
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */


class ParkingMeter
{
    // Attributes
    private double _parking_Time_Purchased;

    // Default constructor
    public ParkingMeter()
    {
        _parking_Time_Purchased = 60.0;
    }

    // Constructor with one argument
    public ParkingMeter(double parking_Time_purchased)
    {
        _parking_Time_Purchased = parking_Time_purchased;
    }

    // Getter method
    public double get_parking_Time_Purchased()
    {
        return _parking_Time_Purchased;
    }

    // Setter method
    public void set_parking_Time_Purchased(double _time_Purchased)
    {
        _parking_Time_Purchased += _time_Purchased;
    }

    // To string Method
    @Override
    public String toString()
    {
        return "--PARKING METER: \n" + "Time Purchased: " + _parking_Time_Purchased;
    }
}
