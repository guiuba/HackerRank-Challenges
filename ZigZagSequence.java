import java.util.Arrays;

public class ZigZagSequence {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 4}; // [1, 4, 5, 3, 2]
        int n = 5;

    /*    int[] a = {1, 2, 3, 4, 5, 6, 7}; //  1 2 3 7 6 5 4
        int n = 7;*/
        findZigZagSequence(a, n);

    }
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a); // [1, 2, 3, 4, 5] ideal: [1, 4, 5, 3, 2]
     //   System.out.println(Arrays.toString(a)); //
        int mid = (n + 1)/2 - 1; //3  (n + 1)/2;
      //  System.out.println(mid);
        int temp = a[mid];  //4
   //     System.out.println(temp); //
        a[mid] = a[n - 1]; //5
        a[n - 1] = temp; //  [1, 2, 3, 5, 4]
    //    System.out.println(Arrays.toString(a)); //

        int st = mid + 1; // 4  mid + 1
        int ed = n - 2;  // 4    n - 1
        while(st <= ed){
            temp = a[st]; // 4
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1; //  st = st + 1;
            ed = ed - 1; // ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

/*
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array
elements. A sequence will be called a zig zag sequence if the first  elements in the sequence are in
increasing order and the last  elements are in decreasing order, where . You need to find the
lexicographically smallest zig zag sequence of the given array.

Example.


Now if we permute the array as , the result is a zig zag sequence.

Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.

Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.

To restore the original code, click on the icon to the right of the language selector.

Input Format

The first line contains  the number of test cases. The first line of each test case contains an integer ,
denoting the number of array elements. The next line of the test case contains  elements of array .

Constraints


 ( is always odd)

Output Format

For each test cases, print the elements of the transformed zig zag sequence in a single line.
 */