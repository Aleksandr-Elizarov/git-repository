package com.company;

public class SearchInArray {
    public SearchInArray() {
    }

    public static void main(String[] args) {
        int[] arraySmall = new int[]{20, 91, 64, 85, 24, 2, 88, 92, 5, 65, 24};
        int[] var10000 = new int[]{2, 55, 24, 68, 45, 28, 11, 555, 59, 64, 32, 155, 84, 62, 74, 35, 95, 122, 35, 485, 35, 666, 15, 447, 58, 44, 6, 1, 54, 45};
        printMaximumElement(var10000);
    }

    static void printMaximumElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;

        for(int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                ++replacements;
            }

            ++comparisons;
        }

        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}