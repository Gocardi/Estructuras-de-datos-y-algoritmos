public class Ejercicio3 {
    public static void main(String[] args) {
        String word = "radar";
        System.out.println("Is Palindrome: " + isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        return isPalindromeHelper(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeHelper(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(word, left + 1, right - 1);
    }
}
