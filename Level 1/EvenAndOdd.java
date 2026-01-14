import java.util.*;
public class EvenAndOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.err.println("Number is Even");
        }
        else{
            System.err.println("Number is Odd");
        }
    }
}
