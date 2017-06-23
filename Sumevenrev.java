import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	int b[] =new int[n];
	int sum1=0,sum2=0;
	int k=0,l=0;
	for(int i=0;i<n;i++)
	{
	    a[i] = sc.nextInt();
	    if(a[i]>0)
	    {
	        if(a[i]%2==0)
	        {
	           int c = a[i];
	           int rem=0,rev=0;
	           while(c!=0)
	           {
	               rem = c%10;
	               rev=rev*10 + rem;
	               c=c/10;
	           }
	           sum1 = sum1 + rev;
	        }
	        else
	        {
	          sum2 = sum2+a[i]; 
	        }
	    }
	    
	}
	System.out.print(sum1+sum2);
	

	}
}
