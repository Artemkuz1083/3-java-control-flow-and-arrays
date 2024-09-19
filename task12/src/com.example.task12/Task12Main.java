package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int min = arr[0];
        int ind = 0;
        for (int j = 0; j < arr.length; j++) {
            min = arr[j];
            for (int i = arr.length - 1; j <= i; i--) {
                if (arr[i] <= min) {
                    min = arr[i];
                    ind = i;
                }
            }
            int swap = arr[j];
            arr[j] = min;
            arr[ind] = swap;
        }

        if (ind == 0) return;

        System.out.println(arr);
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}