package learn_arrays_and_collections;

import java.util.Arrays;
import java.util.List;

public class ArraysClassPracticing {

    public static void main(String[] args) {

        Integer[] ar = {1234, 2, 335, 43535, 53, 6};
        float[] ar1 = {11.11f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f};
        double[] ar2 = {11.11, 22.22, 33.33, 44.44, 55.55, 66.66};
        long[] ar3 = {11111, 22222, 33333, 44444, 55555, 66666};
        byte[] ar4 = {12, 23, 34, 45, 56, 67};
        char[] ar5 = {'a', 'b', 'c', 'd', 'e'};
        short[] ar6 = {10, 20, 30, 40, 50, 60};

        Object[] ob = new Object[6];
        ob[0] = 1;
        ob[1] = 1;
        ob[2] = 2;
        ob[3] = 3;
        ob[4] = 4;
        ob[5] = 5;

        System.out.println("binary search: " + Arrays.binarySearch(ar, 2));
        System.out.println("binary search: " + Arrays.binarySearch(ar1, 3.3f));
        System.out.println("binary search: " + Arrays.binarySearch(ar2, 44.44));
        System.out.println("binary search: " + Arrays.binarySearch(ar3, 33333));
        System.out.println("binary search: " + Arrays.binarySearch(ar4, (byte) 34));
        System.out.println("binary search: " + Arrays.binarySearch(ar5, 'e'));
        System.out.println("binary search: " + Arrays.binarySearch(ar6, (short) 40));
        System.out.println("binary search: " + Arrays.binarySearch(ob, 12));

        List<Integer> list = Arrays.asList(ar);

        for (Integer item : list) {
            System.out.println(item);

            Integer[] arrayInt = Arrays.copyOf(ar, 5);
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.println(arrayInt[i]);
            }
            Integer[] arr = Arrays.copyOfRange(ar, 2, 4);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            Integer[] arrayIntegers = {11, 22, 33, 44, 55};
            System.out.println("boolean: " + Arrays.equals(ar, arrayIntegers));
            Arrays.fill(ar, 66666);
            for (int i = 0; i < ar.length; i++) {
                System.out.println(ar[i]);
            }
            System.out.println();

            Arrays.sort(ar);

            Arrays.parallelSort(ar);
        }
    }
}
