public class NumericalTempValue extends InitialTemperature{
    private String newInitialTemp;
    boolean flag = false;
    private String TemperatureValue;
    private Double TempValue;
    public NumericalTempValue(String InitialTemp){
        newInitialTemp = InitialTemp;
    }
    public  Double GetTempValue(){
        if (newInitialTemp.equals("Celsius")) {
            while (flag == false) {
                System.out.println("Enter the initial temperature in " + newInitialTemp);
                TemperatureValue = sc.nextLine();
                try {
                    TempValue = Double.parseDouble(TemperatureValue);
                    flag = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer or double");
                }
            }
        }
        else if (newInitialTemp.equals("Fahrenheit")) {
            while (flag == false) {
                System.out.println("Enter the initial temperature in " + newInitialTemp);
                TemperatureValue = sc.nextLine();
                try {
                    TempValue = Double.parseDouble(TemperatureValue);
                    flag = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer or double");
                }
            }
        }
        else if (newInitialTemp.equals("Kelvin")) {
            while (flag == false) {
                System.out.println("Enter the initial temperature in " + newInitialTemp);
                TemperatureValue = sc.nextLine();
                try {
                    TempValue = Double.parseDouble(TemperatureValue);
                    flag = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer or double");
                }
            }
        }
        return TempValue;
    }
}
