public class ConvertToTemperature extends InitialTemperature{
    private String ConvertToTemp;
    private boolean flag2;
    public ConvertToTemperature(String InitialTemp){
        ConvertToTemp = "";
        flag2 = true;
        this.InitialTemp = InitialTemp;
    }
    public String NewTemperature(){
        while (flag2 == true) {
            System.out.println("Enter the temperature you want to convert to (Celsius, Fahrenheit or Kelvin): ");
            ConvertToTemp = sc.nextLine();
            if (ConvertToTemp.equals(InitialTemp)) {
                System.out.println("Invalid entry");
            } else if (ConvertToTemp.equals("Celsius") || ConvertToTemp.equals("Fahrenheit") || ConvertToTemp.equals("Kelvin")) {
                flag2 = false;
            } else {
                System.out.println("Invalid entry");
            }
        }
        return ConvertToTemp;
    }
}
