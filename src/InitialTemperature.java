import java.util.Scanner;
public class InitialTemperature {
    private boolean flag;
    Scanner sc;
    String InitialTemp;
    public InitialTemperature(){
        flag = false;
        sc = new Scanner(System.in);
        InitialTemp = "";
    }
    public String WhichInitTemp(){
        System.out.println("Enter what temperature you want to convert from (Celsius, Fahrenheit or Kelvin): ");
        InitialTemp = sc.nextLine();
        while (flag == false) {
            if (InitialTemp.equals("Celsius") || InitialTemp.equals("Fahrenheit") || InitialTemp.equals("Kelvin")) {
                flag = true;
            } else {
                System.out.println("Invalid entry");
                InitialTemp = sc.nextLine();
            }

        }
        return InitialTemp;
    }
    public String getInitialTemp(){
        return InitialTemp;
    }
}
