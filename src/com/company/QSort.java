package com.company;

/**
 * Created by sadyk on 21.07.16.
 */
public class QSort {
    public static Ticket[] sort(Ticket[] arr, int a, int b)
    {
            int i = a;
            int j = b - 1;
            Ticket mid = arr[(a + b - 1) / 2];
            while (i <= j) {
                while (arr[i].compareTo(mid) < 0) i++;
                while (arr[j].compareTo(mid) > 0) j--;
                if (i <= j) {
                    Ticket tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;

                }
            }
            if (a < j)
                arr = sort(arr, a, j);
            if (i < b)
                arr = sort(arr, i, b);
            return arr;
    }

}
