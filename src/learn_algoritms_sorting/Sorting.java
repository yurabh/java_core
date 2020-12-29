package learn_algoritms_sorting;

public class Sorting {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            counter++;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Iteration " + counter);
            showArray(arr);
            System.out.println();
        }
        System.out.println("Iterations :" + counter);
    }


    public static void showArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }


    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }


    public static void showArrayQuickSorting(int arr[], int left, int right) {
        int n = arr.length;
        for (int i = left; i < right; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
