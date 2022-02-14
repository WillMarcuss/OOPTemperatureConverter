public class Kelvin {
    private double TempInKelvin;
    public Kelvin(double TempInKelvin){
        this.TempInKelvin = TempInKelvin;
    }
    public double KelvinToCelsius(){
        return TempInKelvin -= 273.15;
    }
    public double KelvinToFahrenheit(){
        TempInKelvin = ((TempInKelvin - 273.15) * 1.8) + 32;
        TempInKelvin = Math.round(TempInKelvin * 100);
        return TempInKelvin/100;
    }
}
