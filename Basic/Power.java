// import java.util.Scanner; //----------------------------------> By Using Math.pow
// import java.lang.Math;

// public class Power {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int pow = sc.nextInt();
//         sc.close();
//         int product = (int)Math.pow(num,pow);
//         System.out.println(product);
//     }    
// }

import java.util.Scanner;

/**
 * Power
 */
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int result = 1;
        sc.close();
        
        while(power != 0){
            result = result * base;
            power--;
        }
        System.out.println(result);

    }
}
