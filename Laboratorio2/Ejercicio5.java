public class Ejercicio5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int index = binarySearch(array, target);
        System.out.println("Index of " + target + ": " + index);
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    private static int binarySearchHelper(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchHelper(array, target, left, mid - 1);
        } else {
            return binarySearchHelper(array, target, mid + 1, right);
        }
    }
}
