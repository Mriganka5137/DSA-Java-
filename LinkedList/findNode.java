public class findNode {

  class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
      this.data = data;
    }
  }

  public static int FindNode(LinkedListNode<Integer> head, int n) {
    if (head == null) {
      return -1;
    }
    // Write your code here.
    int count = 0;
    LinkedListNode<Integer> curr = head;
    while (curr != null) {
      if (curr.data == n) {
        return count;
      }
      count++;
      curr = curr.next;
    }

    return -1;
  }
}
