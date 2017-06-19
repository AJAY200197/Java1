import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	int l = a.length();
	int i =0,c=0,j=0;
	System.out.print(Character.toUpperCase(a.charAt(0)));
	for(i =1;i<l;i++)
	{
	    if(a.charAt(i-1) == ' '){
	       System.out.print(Character.toUpperCase(a.charAt(i)));
	   }
	   else{
	       System.out.print(a.charAt(i));
	   }
	}

	}
}
