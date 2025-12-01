package Day_1_Class_Assesment;
import java.util.Scanner;

public class Question_1_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Write your code here
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quotient: "+(num1/num2));
        System.out.println("Remainder: "+(num1%num2));
        sc.close();
    }
}