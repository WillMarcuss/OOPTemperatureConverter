// William Marcus
public class Converter {
    public static void main(String[] args) {
        InitialTemperature IT = new InitialTemperature();
        String initTemp = IT.WhichInitTemp();
        String newInitTemp = IT.getInitialTemp();
        ConvertToTemperature CT = new ConvertToTemperature(newInitTemp);
        String newTemp = CT.NewTemperature();
        NumericalTempValue NV = new NumericalTempValue(newInitTemp);
        Double TemperatureValue = NV.GetTempValue();

        if (initTemp.equals("Celsius") && newTemp.equals("Fahrenheit")) {
            Celsius cel = new Celsius(TemperatureValue);
            System.out.println(cel.CelsiusToFahrenheit());
        } else if (initTemp.equals("Celsius") && newTemp.equals("Kelvin")) {
            Celsius cel = new Celsius(TemperatureValue);
            System.out.println(cel.CelsiusToKelvin());
        } else if (initTemp.equals("Fahrenheit") && newTemp.equals("Celsius")) {
            Fahrenheit fah = new Fahrenheit(TemperatureValue);
            System.out.println(fah.FahrenheitToCelsius());
        } else if (initTemp.equals("Fahrenheit") && newTemp.equals("Kelvin")) {
            Fahrenheit fah = new Fahrenheit(TemperatureValue);
            System.out.println(fah.FahrenheitToKelvin());
        } else if (initTemp.equals("Kelvin") && newTemp.equals("Celsius")) {
            Kelvin kel = new Kelvin(TemperatureValue);
            System.out.println(kel.KelvinToCelsius());
        } else if (initTemp.equals("Kelvin") && newTemp.equals("Fahrenheit")) {
            Kelvin kel = new Kelvin(TemperatureValue);
            System.out.println(kel.KelvinToFahrenheit());

        }
    }
}