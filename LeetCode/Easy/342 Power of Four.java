/* 342 Power of Four
Easy

Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Input: n = 16
Output: true

Constraints:
-231 <= n <= 231 - 1

*/

class Solution {
    public boolean isPowerOfFour(int num) {
     return (num> 0) && ((num & (num-1)) == 0) &&(num%3==1);
        
    }
}