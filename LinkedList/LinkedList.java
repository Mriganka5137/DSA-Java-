import java.util.Scanner;

public class LinkedList {

  public static void print(Node<Integer> head) {
    Node<Integer> curr = head;

    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    // Node<Integer> node1 = new Node<Integer>(10);
    // Node<Integer> node2 = new Node<Integer>(20);
    // node2.next = node1;
    Node<Integer> head = TakeInput();
    print(head);
  }

  public static int lengthOfLinkedList(Node<Integer> head) {
    int count = 0;
    Node<Integer> curr = head;
    if (head == null) {
      return count;
    }

    while (curr != null) {
      count++;
      curr = curr.next;
    }

    return count;
  }

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
}
