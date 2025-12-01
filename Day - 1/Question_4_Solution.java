package Day_1_Class_Assesment;
import java.util.Scanner;
public class Question_4_Solution {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("No is Even");
        }
        else{
            System.out.println("No is odd");
        }

    }
}