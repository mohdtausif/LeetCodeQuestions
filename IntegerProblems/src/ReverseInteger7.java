/*
7. Reverse Integer
Solved
Medium

Topics
premium lock icon
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
 */
public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println("123="+reverse(123));
        System.out.println("-123="+reverse(-123));
        System.out.println("120="+reverse(120));
    }
    public static int reverse(int x) {
        if(x==Integer.MIN_VALUE || x==Integer.MAX_VALUE)
        {
            return 0;
        }
        int r=0;
        while(x!=0)
        {
            if(r<Integer.MIN_VALUE/10 || r>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            r = r*10 + x%10;
            x = x/10;
        }
        return r;
    }
}
