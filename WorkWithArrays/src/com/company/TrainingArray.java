package com.company;

public class TrainingArray {
    int[][] grid;
    int N;

    TrainingArray(int N) {
        this.N = N;
        grid = new int[N][N];
    }

    public int getNumberOfThisSite(int row, int col) {
        System.out.println("row = "+row);
        System.out.println("col = "+col);
        return row * N + col + 1;
    }

    public static void main(String[] args) {
        TrainingArray array = new TrainingArray(20);
        System.out.println(array.getNumberOfThisSite(0, 0));
        System.out.println(array.getNumberOfThisSite(1, 0));
        System.out.println(array.getNumberOfThisSite(2, 2));

    }
}