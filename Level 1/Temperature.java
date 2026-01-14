import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature (Enter in Celsius): ");
        float Temperature = sc.nextFloat();

        if(Temperature <= 10){
            System.out.println("Temperature is Cold");
        }

        else if (Temperature > 10 && Temperature < 20){
            System.out.println("Temperature is Cool (Mild)");

        }

        else if(Temperature >= 20 && Temperature <= 30){
            System.out.println("Temperature is Warm");
        }

        else{
            System.out.println("Temperature is Hot");
        }
    }
}
