public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array elements:");
        printArray(array, 0);

        int sum = arraySum(array, 0);
        System.out.println("\nSum of array elements: " + sum);

        int valueToFind = 2;
        int count = findCountInArray(array, valueToFind, 0);
        System.out.println("Number of elements equal to " + valueToFind + ": " + count);
    }

    public static void printArray(int[] array, int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
            printArray(array, i + 1);
        }
    }

    public static int arraySum(int[] array, int i) {
        if (i < array.length) {
            return array[i] + arraySum(array, i + 1);
        } else {
            return 0;
        }
    }

    public static int findCountInArray(int[] array, int what, int i) {
        if (i < array.length) {
            if (array[i] == what) {
                return 1 + findCountInArray(array, what, i + 1);
            } else {
                return findCountInArray(array, what, i + 1);
            }
        } else {
            return 0;
        }
    }
}
