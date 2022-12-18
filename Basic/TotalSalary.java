package Basic;

import java.util.* ;
//import java.io.*;

public class TotalSalary {
     
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
          
        int basic = sc.nextInt();
        
        char grade = sc.next().charAt(0);

        sc.close();
      
      
        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf= 0.11 * basic;
        int allow = 0;
        
        if(grade=='A'){
            allow=1700;
        }
        else if(grade == 'B'){
            allow=1500;
        }
        else
            allow=1300;

          
 
      int totalSalary=(int)(Math.round(basic + hra + da + allow-pf));
        
       System.out.println(totalSalary);
        
    }
}

