package Stack;

import Stack.StackUsingArray;

public class StackUsingArrayUse extends StackUsingArray {

  public static void main(String[] args) {
    StackUsingArray s = new StackUsingArray(5);
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println(s.pop());
  }
}
