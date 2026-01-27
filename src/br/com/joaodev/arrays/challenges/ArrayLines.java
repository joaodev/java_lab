package br.com.joaodev.arrays.challenges;

import java.util.Scanner;

public class ArrayLines {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The first line contains the size of an array.
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        // The second line contains elements of the array.
        String arrayLine = scanner.nextLine();
        String[] arrayStr = arrayLine.split(" ");
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = Integer.parseInt(arrayStr[i]);
        }

        // The third line contains two integer numbers n and m.
        String nmLine = scanner.nextLine();
        String[] nmStr = nmLine.split(" ");
        int n = Integer.parseInt(nmStr[0]);
        int m = Integer.parseInt(nmStr[1]);

        // Check if n and m are adjacent in any order
        boolean found = false;
        for (int i = 0; i < arraySize - 1; i++) {
            if ((arr[i] == n && arr[i + 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                found = true;
                break;
            }
        }

        System.out.println(found);

        scanner.close();
    }
}
