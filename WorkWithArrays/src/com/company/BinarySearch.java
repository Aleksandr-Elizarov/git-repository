package com.company;

public class BinarySearch {
    public BinarySearch() {
    }

    public static void main(String[] args) {
        int[] var10000 = new int[]{19, 20, 33, 44, 65, 76, 87, 88, 95, 99};
        int[] arrayHundredElements = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 111, 134};
        int key = 20;
        int position = binarySearch(arrayHundredElements, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] array, int key) {
        int position = 0;
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            System.out.println("middle is " + middle);
            if (array[middle] == key) {
                System.out.println("Key found");
                return middle;
            }

            if (array[middle] < key) {
                System.out.println("Cut left hulf");
                left = middle + 1;
            }

            if (array[middle] > key) {
                System.out.println("Cut right hulf");
                right = middle - 1;
            }
        }

        return -1;
    }
}
