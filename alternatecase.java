import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
    String b[] = a.split(" ");
    int l = a.length();
    int c=0;
    for(int i = 0;i<l;i++)
    {
        if(a.charAt(i)==' ')
        {
            c++;
        }
    }//System.out.print(b[1]);
   for(int j=0;j<=c;j++)
   {
        int s=b[j].length();
        for(int i=0;i<s;i++){
          if(i%2 ==0){
       System.out.print(Character.toUpperCase
        (b[j].charAt(i)));}
        else{
        System.out.print(Character.toLowerCase
        (b[j].charAt(i)));}
        }System.out.print(" ");
	}
}}
