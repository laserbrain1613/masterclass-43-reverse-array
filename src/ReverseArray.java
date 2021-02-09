import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(array);
    }

    private static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int count = 0;
        System.out.println("Array = " + Arrays.toString(array));

        for (int i = reverseArray.length - 1; i >= 0; i--, count++) {
            reverseArray[count] = array[i];
        }

        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }

}