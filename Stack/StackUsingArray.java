package Stack;
public class StackUsingArray {

  public StackUsingArray() {
    private int arr[];
    private int topIndex = -1;  
  }

  public StackUsingArray(int size){
    private int arr[] = new int[size];
    private int topIndex = -1;  
  }

  public void push(int data) {
    if( topIndex == arr.length -1){
      System.out.println("Stack is Full");
      return;
    }

    topIndex++;
    arr[topIndex] = data;
    
  }
  
  public int pop(){
    if(arr.size() == 0){
      return "Stack is Empty";
    }

    topIndex--;

  }

  public boolean isEmpty(){
    return arr.size() == 0;

  }

  public int size(){
    return topIndex + 1;
  }

  public int top(){
    if(arr.size() == 0){
      return "Stack is Empty";
    }

    return arr[topIndex];

  }



    
  
}