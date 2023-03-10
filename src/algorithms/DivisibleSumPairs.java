package algorithms;

/*Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

Constraints

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5
Explanation

Here are the  valid pairs when :

 */

import java.util.List;

public class DivisibleSumPairs {
    
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int answer = 0;
        for (int i=0; i<ar.size()-1; i++) {
            for (int j=i+1; j<ar.size(); j++) {
               if ((ar.get(i) + ar.get(j)) % k == 0 ) {
                   answer++;
               } 
            }
        }
        
        return answer;
    }

}
