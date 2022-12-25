import java.util.*;


public class Temperature {
    public static int tempCoversion(int start, int end, int diff){
        int i = start;
        int t=0;
        while(i<end){
            t = (i+32)*(5/9);
            i += diff;
            return t;
        }
        int temp = t;
        return temp;
        // int temp =0;
        // for (int i = start; i<end;--i) {
        //     i += diff;
        //     temp = (i=32)*(5/9);
        // }
        // return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, diff;
        start = sc.nextInt();
        end = sc.nextInt();
        diff = sc.nextInt();
        sc.close();
       System.out.println(start+" "+tempCoversion(start,end,diff));

    }
}
