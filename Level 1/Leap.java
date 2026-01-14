import java.util.*;
public class Leap {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        n = sc.nextInt();
        if(n % 400 == 0 ){
            System.out.println("Leap Year");
        }
        else if(n % 4 == 0 && n % 100 != 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}

