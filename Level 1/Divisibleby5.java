import java.util.*;
public class Divisibleby5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n % 5 == 0 && n % 3 == 0){
            System.out.println("Number is divisible by 5 and 3");
        }
        else{
            System.out.println("Number is Not divisible by 5 and 3");
        }
    }
}
