import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Letter: ");
        String st = sc.next();

        if(st.equals("a") ||
         st.equals("e")  ||
          st.equals("i") ||
          st.equals("o") ||
          st.equals("u"))
          {
            System.out.println("Letter is Vowels");
          }

          else{
            System.out.println("Letter is not Vowels");
          }

    }
}