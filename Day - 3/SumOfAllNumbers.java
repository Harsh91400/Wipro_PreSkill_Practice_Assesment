package Day_3_Solution;
import java.util.*;
public class SumOfAllNumbers {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int ans = 0;
        while(num > 0){
            int temp = num%10;
            ans += temp;
            num /= 10;
        }
        System.out.println(ans);
    }
}