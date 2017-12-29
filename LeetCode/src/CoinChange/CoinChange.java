package CoinChange;

/* Dynamic Programming Java implementation of Coin
Change problem */
import java.util.Arrays;

public class CoinChange
{
 static long countWays(int S[], int noOfCoins, int totalAmount)
 {
    
     long[] table = new long[totalAmount+1];

     // Initialize all table values as 0
     Arrays.fill(table, 0);   //O(n)

     // Base case (If given value is 0)
     table[0] = 1;
     
     for (int i=0; i<noOfCoins; i++)
         for (int j=S[i]; j<=totalAmount; j++)
             table[j] += table[j-S[i]];

     return table[totalAmount];
 }

 // Driver Function to test above function
 public static void main(String args[])
 {
     int arr[] = {1, 2, 3};
     int m = arr.length;
     int n = 4;
     System.out.println(countWays(arr, m, n));
 }
}
//This code is contributed by Pankaj Kumar
