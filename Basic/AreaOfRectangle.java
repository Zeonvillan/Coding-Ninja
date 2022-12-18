package Basic;

import java.util.*;

public class AreaOfRectangle {
    
    public void Calculation(int length, int wide){
        
        int Area = length * wide;
        
        System.out.println(Area);
    }
    
    public static void main(String args[]) {
        
          Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();

        int wide = sc.nextInt();
        
        AreaOfRectangle obj = new AreaOfRectangle();

        sc.close();
        
        obj.Calculation(length,wide);
    }
}