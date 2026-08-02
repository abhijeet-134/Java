import java.util.*;

// Calculator 
// // With Switch Operator....
public class Assignment17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Enter Operator :");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default :
                System.out.println("No Such operator..");
                break;
        }

    }
}




// Calculator  with if-else 
// public class Assignment17 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number :");
//         int a = sc.nextInt();
//         System.out.println("Enter Second Number :");
//         int b = sc.nextInt();
//         System.out.println("Enter Operator :");
//         char c = sc.next().charAt(0);
//         if(c == '+') {
//             System.out.println(a + b);
//         }else if( c == '-' ) {
//             System.out.println( a - b);
//         }else if( c == '*' ) {
//             System.out.println( a * b);
//         }else if( c == '/' ) {
//             if(b != 0) {
//                 System.out.println( a / b);
//             }else {
//                 System.out.println("Division by zero is not allowed...");
//             }
//         }else {
//             System.out.println("Wrong Operator Enter..");
//         }

//     }
// }