/**This is a class called "ParkedCar" used to create a new parked car.
 *
 * @author Okemawo Aniyikaiye Obadofin
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 */


import java.awt.*;

public class ParkedCar
{
    // Attributes
    private String _make;
    private String _model;
    private Color _color;
    private String _license_Plate;
    private double _minutes_Parked;

    // Default Constructor
    public ParkedCar()
    {
        _make = "TOYOTA";
        _model = "camry";
        _color = Color.black;
        _license_Plate = "419-KIGALI";
        _minutes_Parked = 45 ;
    }

    // Constructor with multiple arguments
    public ParkedCar(String make, String model, Color color, String license_Plate, double minutes_Parked)
    {
        _make = make;
        _model = model;
        _color = color;
        _license_Plate = license_Plate;
        _minutes_Parked = minutes_Parked;
    }

    // Getter Methods
    public String get_make()
    {
        return _make;
    }

    public String get_model()
    {
        return _model;
    }

    public String get_license_Plate()
    {
        return _license_Plate;
    }

    public String get_color()
    {
        return _color.toString();
    }

    public double get_minutes_Parked()
    {
        return _minutes_Parked;
    }

    // Setter Methods
    public void set_make(String make)
    {
        _make = make;
    }

    public void set_model(String model)
    {
        _model = model;
    }

    public void set_license_Plate(String license_plate)
    {
        _license_Plate = license_plate;
    }

    public void set_minutes_Parked(double minutes_Parked)
    {
        _minutes_Parked = minutes_Parked;
    }

    @Override
    public String toString()
    {
        return "++Car Details: \n" + "Car Type: " + _make + " " + _model + "\n" + "Color: " + _color +
                "\n" + "License Plate Number: " + _license_Plate + "\n";
    }
}