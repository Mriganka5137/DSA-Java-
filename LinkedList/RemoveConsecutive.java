import java.util.ArrayList;

public class RemoveConsecutive {

  public static void main(String[] args) {
    int arr[] = { 10, 10, 20, 10, 20, 20, 40, 50, 50, 10 };
    ArrayList<Integer> result = removeConsecutive(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  private static ArrayList<Integer> removeConsecutive(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        result.add(arr[i]);
      }
    }
    return result;
  }
}
