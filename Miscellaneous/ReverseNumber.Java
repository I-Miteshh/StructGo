/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123  Output: 321
Example 2:
Input: x = -123 Output: -321 */

/*Observation : Main problem for 32 bit signed integer is not that the number is out of range before reversing, 
it is during the revesersing process that the numbers are flipped and causes overflow.*/

class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        int reverseNumber = 0, digit = 0;
        boolean flag = true;
        if(x> Math.pow(2,31)-1){
            return 0;
        }
        while(x!=0){
            digit = x%10;
            if (reverseNumber > Integer.MAX_VALUE / 10 || 
               (reverseNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  
            }
            if (reverseNumber < Integer.MIN_VALUE / 10 || 
               (reverseNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  
            }
            reverseNumber = reverseNumber * 10 + digit;
            x = x/10;
        }
        if(x<0){
            return -reverseNumber;
        }
        return reverseNumber;
    }
}