import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int l =a.length();
	    int c=0;
		for( int i = 0;i<l;i++)
        {
            if(b.charAt(0) == a.charAt(i) && b.charAt(1)== a.charAt(i+1) && 
            b.charAt(2)== a.charAt(i+2)){
                c=i;
            }
        }
        for(int i=c;i<l;i++){
        System.out.print(a.charAt(i));}
        
	}
}
