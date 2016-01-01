import java.util.*;

public class MapExample {
   public static void main(String[] args) {
      Map<String, Integer> m1 = new HashMap<String, Integer> (); 
      m1.put("ΕΛΕΝΗ", 8);
      m1.put("ΗΡΩ", 31);
      m1.put("ΙΑΣΩΝ", 12);
      m1.put("ΟΡΕΣΤΗΣ", 14);
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
