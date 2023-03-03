package algorithms;

import java.util.List;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer. */

public class MiniMaxSum {
    
    public static void miniMaxSum(List<Integer> arr) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int firstElement = arr.get(0);
        boolean sameElement = true;
        
        for (Integer i : arr) {
            if (firstElement != i) {
                sameElement = false;
            }
        }
        for (Integer i : arr) {
            if (i > maxValue) {maxValue = i;}
            if (i < minValue) {minValue = i;}
        }
        
        long maxSum = 0;
        long minSum = 0;
        
        for (Integer i : arr) {
            if (i != maxValue) { minSum += i; }
            if (i != minValue) { maxSum += i; }
        }
        
        if (sameElement) {
            for (int i=0; i<arr.size()-1; i++) {
                minSum += arr.get(i);
                maxSum += arr.get(i);
            }
        }
        
        System.out.println(minSum + " " + maxSum);
        
    }
}
