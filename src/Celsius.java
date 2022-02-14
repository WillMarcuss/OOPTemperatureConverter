public class Celsius {
    private double TempInCelsius;
    public Celsius(double TempInCelsius){
        this.TempInCelsius = TempInCelsius;
    }
    public double CelsiusToFahrenheit(){
        return (TempInCelsius * 1.8) + 32;
    }
    public double CelsiusToKelvin(){
        return TempInCelsius+=273.15;
    }
}
