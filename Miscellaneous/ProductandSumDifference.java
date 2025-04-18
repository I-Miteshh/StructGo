/*Given an integer number n, return the difference between the product of its digits and the
sum of its digits.
Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15*/
import java.util.Scanner;
public class ProductandSumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int digit =0;
        while(n>0){
            digit = n %10;
            n = n/10;
            product = product * digit;
            sum = sum + digit;
        }
        return product - sum;
    }
}
