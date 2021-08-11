package com.thaiitwork.service;

public class Test {

    public static void main(String[] args) {
        int[] arr={1, -2, 0, 3};
        int sum =0;
        int max =0;
       /* for(int num=1;num<arr.length-2;num++) {
            for(int j=0;j<arr.length;j++) {
                //System.out.println(j);
                for (int k = j+1; k <= num && k < arr.length; k++) {
                    System.out.println(j+","+k);
                }
            }
        }*/
        System.out.println(findSum(arr,5));
    }
    static int findSum(int A[], int N) {
        if (N <= 0)
            return 0;
        return (findSum(A, N - 1) + A[N - 1]);
    }
}
