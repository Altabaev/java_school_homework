public class Main {

    public static void main(String... args) {
        int[] data = new int[]{1, 3, 7, 2, 5, 9, 0};
        System.out.println("Before");
        for (int item: data) {
            System.out.print(item + ", ");
        }
        System.out.println();
        System.out.println("After");
        for (int item: Main.sort(data)) {
            System.out.print(item + ", ");
        }
    }

    public static int[] sort(int[] data) {
        if (data.length < 2) {
            return data;
        }

        for (int i = 0; i < data.length; i++) {
            int max = data[i];
            for (int j = 0; j < data.length; j++) {
                if (data[j] > max) {
                    max = data[j];
                    data[j] = data[i];
                    data[i] = max;
                }
            }
        }

        return data;
    }
}
