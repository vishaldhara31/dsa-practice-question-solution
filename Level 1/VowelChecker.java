import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        // here charAt is important as the sc takes only the string as a input so to get char at 0th index use this 

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
         System.out.println("The charcter is Vowel");
        }

        else{
            System.out.println("Character is Not Vowel");
        }
    }
}


//import java.util.Scanner;
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Letter: ");
//         String st = sc.next();

//         if(st.equals("a") ||
//          st.equals("e")  ||
//           st.equals("i") ||
//           st.equals("o") ||
//           st.equals("u"))
//           {
//             System.out.println("Letter is Vowels");
//           }

//           else{
//             System.out.println("Letter is not Vowels");
//           }

//     }
// }
