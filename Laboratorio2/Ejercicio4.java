public class Ejercicio4 {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }

    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, aux, to, from);
    }
}
