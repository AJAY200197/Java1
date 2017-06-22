import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	int l = a.length();
	char c[] = new char[l];
	for(int i=0;i<l;i++)
	{
	    c[i]=a.charAt(i);
	}
   Arrays.sort(c);
    for(int i=l-1;i>=1;i--)
    {
        if(c[i]!=c[i-1]&& c[i]!=c[i-2])
        System.out.print(c[i]);
    }System.out.print(c[0]);
	}
}
