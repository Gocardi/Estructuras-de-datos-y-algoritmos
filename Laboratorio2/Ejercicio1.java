public class Ejercicio1 {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        return reverseHelper(number, 0);
    }

    private static int reverseHelper(int number, int result) {
        if (number == 0) {
            return result;
        }
        result = result * 10 + number % 10;
        return reverseHelper(number / 10, result);
    }
}
