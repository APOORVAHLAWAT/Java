import java.util.Scanner;
public class Fibonacci {
	
	   private static Scanner sc;

	static int fib(int n)
	    {
	
	    int f[] = new int[n+1];
	    int i;
	      
	
	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	
	         
	        f[i] = f[i-1] + f[i-2];
	    }
	      
	    return f[n];
	    }
	      
	    public static void main(String args[])
	    {
	    	sc = new Scanner(System.in);
	    	int a=sc.nextInt();
	        System.out.println(fib(a));
	    }
	}
	
