public class Main {

    public static void cycleSwap(int[] array, int shift) {
        // Ensure shift is within array bounds
        shift = shift % array.length;

        reverseArray(array, 0, array.length - shift - 1);
        reverseArray(array, array.length - shift, array.length - 1);
        reverseArray(array, 0, array.length - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 4};
        int shift = 3;

        cycleSwap(array, shift);

        // Print the result
        System.out.print("Shifted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}