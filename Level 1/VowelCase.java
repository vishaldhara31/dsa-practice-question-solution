
import java.util.Scanner;

public class VowelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char st = sc.next().charAt(0);

        if(Character.isUpperCase(st)){
            System.out.println("It is Uppercase");
        }
        else{
            System.out.println("It is Not Uppercase");
        }
    }
}
