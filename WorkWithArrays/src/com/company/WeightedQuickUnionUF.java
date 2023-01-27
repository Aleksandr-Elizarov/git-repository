package com.company;

import static com.company.QuickFindUF.printArray;

public class WeightedQuickUnionUF {
    public static void main(String[] args) {
        WeightedQuickUnionUF quickFindUF = new WeightedQuickUnionUF(10);
        System.out.println(quickFindUF.connected(2,5));
        quickFindUF.union(2,5);
        quickFindUF.union(5,3);
        quickFindUF.union(3,9);
        quickFindUF.union(0,7);
        quickFindUF.union(4,8);
        System.out.println(quickFindUF.connected(9,5));

    }
//    private int[] id ={0, 0, 0, 1, 1 ,1 ,3 ,3 , 6, 6, 8, 9, 9};
    private int[] id;
    private int[] sz;
    private static int[] elements;
    public WeightedQuickUnionUF(int N)
    {
        id = new int[N];
        sz = new int[N];
        elements = new int[N];

        for (int i = 0; i < N; i++)
        {
            sz[i] = 1;
            id[i] = i;
            elements[i]=i;
        }
        showArrays();
    }
    void showArrays(){
        System.out.print("№ ofElement     "); printArray(elements);
        System.out.print("id[i]           "); printArray(id);
        System.out.print("countOfElements "); printArray(sz);
        System.out.println();
    }
    private int root(int i)

    {
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
//        showArrays();
        return i;
    }
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);

    }
    public void union(int p, int q)    {

        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
        else { id[j] = i; sz[i] += sz[j]; }
        showArrays();
    }

}
