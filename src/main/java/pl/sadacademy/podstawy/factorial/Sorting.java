package pl.sadacademy.podstawy.factorial;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] values = new int[] {4, 2, 3, 1, 8,0};
        System.out.println(Arrays.toString(values));
        sort(values);

    }
    public static void sort (int[] values){
        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values.length; j++){
                if (j < values.length -1 && values[j] > values[j + 1]){
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;

                }
            }
            System.out.println(Arrays.toString(values));
        }
    }
}

