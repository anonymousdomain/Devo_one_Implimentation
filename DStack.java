public class DStack {

  int arraySize = 2;
  int stack[] = new int[arraySize];
  int top = 0;

  public void push(int data) {
    if (size() == arraySize) {
      expandArray();

      stack[top] = data;
      top++;
    } else {
      stack[top] = data;
      top++;
    }
  }

  public void expandArray() {
    int length = size();
    int newStack[] = new int[arraySize * 2];
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
    arraySize += 2;
  }

  public int pop() {
    int data = 0;
    if (isEmpty()) {
      System.out.println("the stack is empty");
    } else {
      top--;
      data = stack[top];
      stack[top] = 0; //delete the value from the top
      shrink();
    }

    return data;
  }

  public void shrink() {
    int length = size();
    if ((length <= (arraySize / 2) / 2)) {
      arraySize = arraySize / 2;
      int newStack[] = new int[arraySize];
      System.arraycopy(stack, 0, newStack, 0, length);
      stack = newStack;
    }
  }

  public int peek() {
    int data;
    data = stack[top - 1];
    return data;
  }

  public int size() {
    return arraySize;
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
