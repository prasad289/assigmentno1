package screen;
// factorial of the given number
public class pgiven_num {
	static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
  
    // main method 
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(5)); 
    } 

}
