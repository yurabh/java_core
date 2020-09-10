package homeWork98;

public class LambdaSorting {

    public static void sortingNumber(SortingFunctional sortingFunctional, int[] array) {
        sortingFunctional.sortingNumber(array);
    }

    public static void main(String[] args) {
        int[] arrayNew = new int[7];

        LambdaSorting.sortingNumber(
                (number) -> {
                    int[] array = {22, 33, 1, 2, 4, 5, 6};
                    int n = array.length;
                    int temp = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 1; j < (n - i); j++) {
                            if (array[j - 1] > array[j]) {
                                temp = array[j - 1];
                                array[j - 1] = array[j];
                                array[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }

                    for (int i = 0; i < array.length; i++) {
                        arrayNew[i] = array[i];
                    }
                }, arrayNew);
    }
}
