package Basic;

import java.util.* ;
import java.io.*; 
import javafx.util.Pair; // java 8 form this version

public class SwapTwoNumber {
   public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
          int a = swapValues.getKey();
          int b = swapValues.getValue();
          Pair < Integer, Integer > p = new Pair(b,a);
          return p;
       
   }
}

