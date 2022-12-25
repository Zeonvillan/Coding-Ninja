import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i,fact=1;
        sc.close();
        if(num>0){
            for(i=1;i<=num;i++){
                fact = fact *i;
            }
        }
        else if(num == 0){
            fact = 1;
        }
        else{
            System.out.println("Error");
            return;
        }
        System.out.println(fact);
    }    
}
