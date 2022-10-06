public class SplitArray {

  public static void main(String[] args) {
    int arr[] = { 1, 4, 3 };
    System.out.println(splitArray(arr, 0, 0));
  }

  public static boolean splitArray(int[] arr, int si, int sum) {
    if (si >= arr.length) {
      if (sum == 0) {
        return true;
      } else {
        return false;
      }
    }

    if (arr[si] % 5 == 0) {
      return splitArray(arr, si + 1, sum + arr[si]);
    } else if (arr[si] % 3 == 0) {
      return splitArray(arr, si + 1, sum - arr[si]);
    } else {
      boolean ans1 = splitArray(arr, si + 1, sum + arr[si]);
      boolean ans2 = splitArray(arr, si + 1, sum - arr[si]);
      return ans1 || ans2;
    }
  }
}
