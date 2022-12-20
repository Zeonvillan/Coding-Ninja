import java.util.* ;
//import java.io.*; 
public class SumOfEven {
	public static long evenSumTillN(int n) {
		long num=n;
        num /= 2;
        long sum =(num*(num+1));
        return sum;
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        for(int i = 0; i < a; ++i){
            int n = sc.nextInt();
            System.out.println(evenSumTillN(n));
        }
        sc.close();
    }
}