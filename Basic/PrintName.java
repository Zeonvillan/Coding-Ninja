package Basic;
import java.util.*;

public class PrintName {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        
        sc.close();
        
        System.out.println("The name of the person is "+s+" and the age is "+n+".");
		
	}
}
