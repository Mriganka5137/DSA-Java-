import java.util.Scanner;

public class InsertRecursively {

  public static Node<Integer> TakeInput() {
    Scanner s = new Scanner(System.in);
    int data = s.nextInt();
    Node<Integer> head = null;
    Node<Integer> tail = null;

    while (data != -1) {
      Node<Integer> curr = new Node<Integer>(data);
      if (head == null) {
        head = curr;
        tail = curr;
      } else {
        tail.next = curr;
        tail = tail.next;
      }

      data = s.nextInt();
    }
    return head;
  }

  public static Node<Integer> insertRecrsive(
    Node<Integer> head,
    int index,
    int num
  ) {
    if (head == null && index > 0) {
      return head;
    }

    if (index == 0) {
      Node<Integer> newHead = new Node<Integer>(num);
      newHead.next = head;
      return newHead;
    }

    Node<Integer> newHead = insertRecrsive(head.next, index - 1, num);
    head.next = newHead;
    return head;
  }
}
