/*
50. Pow(x, n)
Solved
Medium

Topics
premium lock icon
Companies
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).



Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25


Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
 */
public class Pow_x_n_50 {
    public static void main(String[] args) {
        System.out.println("myPow(2.0000,10) : "+myPow(2.0000,10));
        System.out.println("myPow(2.10000,3) : "+myPow(2.10000,3));
        System.out.println("myPow(2.00000,-2) : "+myPow(2.00000,-2));
    }
    public static double myPow(double x, int n) {
        long num=Math.abs((long)n);
        double res=1.0;
        while(num!=0)
        {
            if(num%2==1)
            {    num=num-1;
                res*=x;
            }
            x*=x;
            num=num/2;
        }
        return n<0?1.0/res:res;
    }
}
