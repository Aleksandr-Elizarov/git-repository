package com.company;
import static com.company.QuickFindUF.printArray;

public class WeightedQUPC {
    public static void main(String[] args) {
        WeightedQUPC quickFindUF = new WeightedQUPC(13);
        quickFindUF.union(0,9);
        quickFindUF.union(0,6);
        quickFindUF.union(0,3);
        quickFindUF.union(0,1);
    }
    private int[] id ={0, 0, 0, 1, 1 ,1 ,3 ,3 , 6, 6, 8, 9, 9};
    private int[] sz;
    private static int[] elements;
    public WeightedQUPC(int N)
    {
        sz = new int[N];
        elements = new int[N];

        for (int i = 0; i < N; i++)
        {
            sz[i] = 1;
            elements[i]=i;
        }
        showArrays();
    }
    private int root(int i)

    {
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        showArrays();
        return i;
    }
    void showArrays(){
        System.out.print("№ ofElement     "); printArray(elements);
        System.out.print("id[i]           "); printArray(id);
        System.out.print("countOfElements "); printArray(sz);
        System.out.println();
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
