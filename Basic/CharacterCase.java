package Basic;
import java.util.*;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a =sc.next().charAt(0);
                 int input = (int) a;
                sc.close();

        if(input >= 65 && input <= 90)
                System.out.println(1);

        else if(input >= 97 && input <= 122)
                System.out.println(0);

        else
                System.out.println(-1);
    }

}

