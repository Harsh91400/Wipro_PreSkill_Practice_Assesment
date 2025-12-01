package Day_2_Solution;

import java.util.Scanner;
public class EqualCharacterInString {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) maxFreq = f;
        }

        int minMoves = s.length() - maxFreq;
        System.out.println(minMoves);
    }
}