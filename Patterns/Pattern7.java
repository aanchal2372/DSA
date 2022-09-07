package Patterns;
import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        char p=(char)('A'+n);
        while(i<=n){
        	p=(char)(p-i);
            int j=1;
            while(j<=i) {
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println( );
            i++;
        }
	}
}