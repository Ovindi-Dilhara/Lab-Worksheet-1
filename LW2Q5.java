package Answers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LW2Q5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to check: ");
        String sentence = scanner.nextLine();
        
        String cleanedSentence = preprocessSentence(sentence);
        
        if (isPalindrome(cleanedSentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
    
    private static String preprocessSentence(String sentence) {
        StringBuilder cleaned = new StringBuilder();
        
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:\"'()[]{}");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            cleaned.append(word);
        }
        
        return cleaned.toString();
    }
    
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}