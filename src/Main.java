public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        int[] newArray = toFilterPositive(array);
        toFilterOdd(newArray);
        int countLength = toDefineLength(newArray);
        toSort(newArray);
        newArray = toCutZeros(newArray, countLength);
        toShowArray(newArray);

    }

    public static int[] toFilterPositive(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i];
            } else array[i] = 0;
        }
        return array;
    }

    public static int[] toFilterOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i];
            } else array[i] = 0;
        }
        return array;
    }

    public static int[] toSort(int[] array) {
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] toCutZeros(int[] array, int length) {
        int[] arrayCutted = new int[length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                arrayCutted[count++] = array[i];
            }
        }
        return arrayCutted;
    }

    public static void toShowArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int toDefineLength(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

}
