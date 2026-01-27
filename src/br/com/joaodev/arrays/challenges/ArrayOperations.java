package br.com.joaodev.arrays.challenges;

import java.util.Scanner;


public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int[] array = new int[n];

        // use a loop to read the array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // use a loop to calculate the sum of elements that are multiples of 3
        int sum = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}
