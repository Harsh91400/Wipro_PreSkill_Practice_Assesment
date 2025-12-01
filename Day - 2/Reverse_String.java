package Day_2_Solution;

import java.util.Scanner;
import java.lang.*;
public class Reverse_String {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String output = reverseEachWord(input);
        System.out.println(output);

    }
    public static String reverseEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
}