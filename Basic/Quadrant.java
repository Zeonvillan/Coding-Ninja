import java.util.*;

class Quadrant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a>0 && b>0){
            System.out.println("1st Quadrant");
        }
        else if(a<0 && b>0){
            System.out.println("2nd Qudrant");  
        }
        else if(a<0 && b<0){
            System.out.println("3rd Qudrant");
        }
        else if(a>0 && b<0){
            System.out.println("4th Qudrant");
        }
        else if(a<0 && b==0){
            System.out.println("x axis");
        }
        else if(a==0 && b<0){
            System.out.println("y axis");
        }
        else{
            System.out.println("Origin");
        }
    }
}