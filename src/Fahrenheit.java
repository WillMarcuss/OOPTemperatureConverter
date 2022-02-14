public class Fahrenheit {
    private double TempInFahrenheit;
    public Fahrenheit(double TempInFahrenheit){
        this.TempInFahrenheit = TempInFahrenheit;
    }
    public double FahrenheitToCelsius(){
        return (TempInFahrenheit - 32) * 0.55555556;
    }
    public double FahrenheitToKelvin(){
        return (TempInFahrenheit - 32) * 0.55555556;
    }
}
