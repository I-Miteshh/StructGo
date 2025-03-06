/*SieveOfEratosthenes - It is used to count the number of primes within a given range using a simple trick -
The trick is under assumption that starting from 2 every number is PrimeNumber and then if 2 is Prime then its
multiple won't be prime so they are marked as False (Not Prime) = j=j+i; then next marked PrimeNumber 3 and so on
and so forth.
*/
import java.util.Arrays;
import java.util.Scanner;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        //Taking Input and Initializing Array
        Scanner sc = new Scanner(System.in);
        int PrimeRange = sc.nextInt();
        boolean[] isPrime = new boolean[PrimeRange];
        int count =0;
        //Filling the Array with true value under assumption that every value is Prime
        Arrays.fill(isPrime, true);
        //Logic - Starting from 2 every multiple will be marked as false; 3 multiple and so on till the range.
        for(int i=2; i<PrimeRange; i++){
            if(isPrime[i]){
                count++;
                for(int j=i; j<PrimeRange; j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("The total number of primes in Range : "+ count);
    }
}
