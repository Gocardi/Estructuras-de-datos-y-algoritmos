public class Ejercicio2 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Is Increasing: " + isIncreasing(number));
        System.out.println("Is Decreasing: " + isDecreasing(number));
    }

    public static boolean isIncreasing(int number) {
        return checkOrder(number, true);
    }

    public static boolean isDecreasing(int number) {
        return checkOrder(number, false);
    }

    private static boolean checkOrder(int number, boolean increasing) {
        int lastDigit = number % 10;
        number /= 10;
        
        while (number > 0) {
            int currentDigit = number % 10;
            if (increasing && currentDigit > lastDigit) {
                return false;
            } else if (!increasing && currentDigit < lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            number /= 10;
        }
        return true;
    }
}
