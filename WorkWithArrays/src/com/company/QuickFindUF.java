package com.company;

public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        printArray(id);
    }
    public boolean connected(int p, int q) { return id[p] == id[q]; }
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
        printArray(id);
    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        System.out.println(quickFindUF.connected(2,5));
        quickFindUF.union(2,5);
        quickFindUF.union(5,3);
        quickFindUF.union(2,9);
        System.out.println(quickFindUF.connected(9,5));

    }
}

