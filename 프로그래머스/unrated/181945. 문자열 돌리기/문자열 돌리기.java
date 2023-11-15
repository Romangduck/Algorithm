import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.length() >= 1 && input.length() <= 10){
            
         for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.println(c);
         } 
        }
    }
}