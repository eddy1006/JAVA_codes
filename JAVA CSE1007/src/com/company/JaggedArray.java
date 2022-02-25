package com.company;

public class JaggedArray {
    public static void main(String[] args) {
        //assuming n to be an even number;
        //we will be keeping n/4 elements in one row and 3n/4 elements in other row;
        int n = args.length;
        int jagged[][] = new int[2][];
        int row1[] = new int[n/4];
        int row2[] = new int[(3*n)/4];
        for(int i=0;i<(n/4);i++){
            row1[i] = Integer.parseInt(args[i]);
        }
        for(int i=n/4 ; i<n;i++){
            row2[i] = Integer.parseInt(args[i]);
        }
        jagged[0] = row1;
        jagged[1] = row2;
        int matrixA[][] = new int[n/4][n/4];
        int matrixB[][] = new int[n/4][n/4];
    }
}
