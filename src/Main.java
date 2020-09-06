import java.util.Arrays;

public class Main {

    public static void main(String... args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int wanted = 11;
        System.out.println("Looking for value: " + wanted);
        System.out.println("Find: " + Main.inArray(data, wanted));
    }

    public static boolean inArray(int[] data, int wanted) {
        if (data.length == 0) {
            return false;
        }

        int pivotIndex = data.length / 2;

        if (data.length - 1 == 1) {
            pivotIndex = 0;
        }

        int pivotValue = data[pivotIndex];

        if (wanted == pivotValue) {
            return true;
        }

        if (wanted < pivotValue) {
            return inArray(Arrays.copyOfRange(data, 0, pivotIndex), wanted);
        }

        return inArray(Arrays.copyOfRange(data, pivotIndex + 1, data.length), wanted);
    }
}
