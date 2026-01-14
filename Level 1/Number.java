import java.util.Scanner;

public class Number {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if(number>0){
            System.out.println("Number is Positive");
        }

        else if (number == 0) {
            System.out.println("Number is Zero");
        }

        else{
            System.out.println("Number is Negative");
        }
    }
}
