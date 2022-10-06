package Generics;

public class GenericMethod {

  public static <T> void printArr(T arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    String[] s = new String[5];
    for (int i = 0; i < s.length; i++) {
      s[i] = "Hello";
    }

    printArr(s);

    Integer arr[] = { 1, 2, 3, 4, 5 };
    printArr(arr);
  }
}
