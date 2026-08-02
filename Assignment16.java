import java.util.*;

// whether an entered alphabet is a Vowel or a Constant
public class Assignment16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Chracter :");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("The Entered Chracter is Vowel..");
        }else {
            System.out.println("The Entered Chracter is Constant..");
        }
    }
}