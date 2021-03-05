public class DStack {

  int arraySize = 3;
  int stack[] = new int[arraySize];
  int top = 0;

  public void push(int data) {
    if (size() == arraySize) expandArray();

    stack[top] = data;
    top++;
  }

  private void expandArray() {
    int length = size();
    int newStack[] = new int[arraySize * 2];
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
    arraySize = arraySize * 2;
  }

  public int pop() {
    int data = 0;
    
      top--;
      data = stack[top];
      stack[top] = 0; //delete the value from the top
    shrink();
    return data;
  }

  private void shrink() {
int length=size();
if(length<=arraySize/2)
arraySize=arraySize/2;
int newStack[]= new int[arraySize];
System.arraycopy(stack, 0, newStack, 0, length);
stack=newStack;

}

public int peek() {
    int data;
    data = stack[top - 1];
    return data;
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return top <= 0;
  }

  public void show() {
    for (int n : stack) {
      System.out.print(n + " ");
      
    }
    System.out.println();
  }
}
