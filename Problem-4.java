public class PallindromeGenerator
{
    static int lower_bound = 0; 
    static int upper_bound = 0; 
    static int upper_bound_Divisible_by11;
	
    static void boundSet(int n)
    {
        
  
    // Loop to calculate upper bound 
    // (largest number of n-digit) 
    for (int i = 1; i <= n; i++) 
    { 
        upper_bound *= 10; 
        upper_bound += 9; 
    } 
    
    

    // largest number of n-1 digit.  
    // One plus this number is lower 
    // bound which is product of two numbers. 
    int lower_bound = 1 + upper_bound / 10;
    
    
    upper_bound_Divisible_by11 = upper_bound;
    
    if(upper_bound_Divisible_by11%11!=0)
    
    while(upper_bound_Divisible_by11%11!=0)//checking for divisibility by 11
    {
        upper_bound_Divisible_by11-=1;
    }
}
     public static void LargestPallindrome(int n)
    {
        boundSet(n);
        int r = 0;

    for (int p = upper_bound_Divisible_by11; p > lower_bound; p-= 11) {

    for (int q = upper_bound; q > lower_bound; q--) {

      int t = p * q;

      if ((r < t) && isPalindrome(t)) {
        r = t;
        break;
            }
        }
    }
  System.out.println("The largest pallindrome number is "+r);
    }
    static boolean isPalindrome(int x) { 
        //a simple helper function to check if a number is a palindrome:

    int n = 0;
    int m = x;

    while (x > 0) {
        n = n * 10 + x % 10; 
        x = x / 10 ; 
    }
    return (n == m);
    }
    public static void main(String[] args) {
	    
	    
		LargestPallindrome(3); //Taking number of digits of numbers which when multiplied gives a the pallindrome numbers
	}
    
}
