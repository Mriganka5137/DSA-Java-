import java.util.ArrayList;

public class Arraylist {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    // arr.add(500);
    // arr.add(1);
    // System.out.println(arr.get(0));
    // System.out.println(arr.size());
    // System.out.println(arr.isEmpty());
    for (int i = 0; i < 10; i++) {
      arr.add(i + 1);
    }
    for (int i : arr) {
      System.out.println(i);
    }

    for (int i = 0; i < arr.size(); i++) {
      arr.set(i, i * 5);
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
