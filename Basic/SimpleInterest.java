package Basic;
import java.util.* ;
//import java.io.*;

class Interest{
    private int principal;
    private float rate;
    private int year;
    
    public Interest(int principal,float rate,int year){
        this.principal = principal;
        this.rate = rate;
        this.year = year;
    }
    public int interest(){
        return (int)(principal*rate*year)/100;
    }
}
public class SimpleInterest {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int y = sc.nextInt();
        sc.close();
        Interest obj = new Interest(p,r,y);
        System.out.println(obj.interest());
	}
}

