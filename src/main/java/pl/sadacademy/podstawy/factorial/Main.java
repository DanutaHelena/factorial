package pl.sadacademy.podstawy.factorial;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[] {0,1,2,5,10};
        for (int value : data) {
            System.out.printf("%d! = %d\n", value,factorial(value));

            }

        }

    public static long factorial(int value) {
        long result = 1;
        for (int value2 = 1; value2 <= value; value2++) {
            result = result * value2;
         }
            return result;
        }


}
