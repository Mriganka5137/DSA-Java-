public class MaximumProfit {

  public static void main(String[] args) {
    int[] arr = { 34, 78, 90, 15, 67 };
    System.out.println(maximumProfit(arr));
  }

  public static int maximumProfit(int[] arr) {
    int count = 1;
    mergeSort(arr);
    int max = Integer.MIN_VALUE;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] * count > max) {
        max = arr[i] * count;
      }
      count++;
    }

    return max;
  }

  public static void mergeSort(int arr[]) {
    if (arr.length <= 1) {
      return;
    }
    int[] arr1 = new int[arr.length / 2];
    int arr2[] = new int[arr.length - arr1.length];

    for (int i = 0; i < arr.length / 2; i++) {
      arr1[i] = arr[i];
    }
    for (int i = arr.length / 2; i < arr.length; i++) {
      arr2[i - arr.length / 2] = arr[i]; // very important step
    }

    mergeSort(arr1);
    mergeSort(arr2);
    int i = 0;
    int j = 0;
    int index = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        arr[index] = arr1[i];
        index++;
        i++;
      } else {
        arr[index] = arr2[j];
        index++;
        j++;
      }
    }

    while (i < arr1.length) {
      arr[index] = arr1[i];
      index++;
      i++;
    }
    while (j < arr2.length) {
      arr[index] = arr2[j];
      index++;
      j++;
    }
  }
}
