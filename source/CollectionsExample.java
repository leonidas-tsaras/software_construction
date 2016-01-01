import java.util.*;

public class CollectionsExample {
   public static void main(String[] args) {
      List<String>  a1 = new ArrayList<String>();
      a1.add("ΕΛΕΝΗ");
      a1.add("ΗΡΩ");
      a1.add("ΙΑΣΩΝ");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      List<String>  l1 = new LinkedList<String>();
      l1.add("ΕΛΕΝΗ");
      l1.add("ΗΡΩ");
      l1.add("ΙΑΣΩΝ");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
   }
}