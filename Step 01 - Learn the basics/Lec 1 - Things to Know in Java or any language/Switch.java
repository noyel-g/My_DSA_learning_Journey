import java.util.ArrayList;
import java.util.List;

public class Switch {
    public static void main(String[] args) {
      List<Double> arr = new ArrayList<>();
      arr.add(5.0);
      double d= switchCase(1, arr);
      System.out.println(d);
    }

     static double switchCase(int choice, List<Double> arr) {
        
        switch (choice) {
            case 1 : return (Math.PI * arr.get(0) * arr.get(0));
            case 2 : return (arr.get(0) * arr.get(1));
            default : return -1;       }
        
    }
}
