public class DStack {

  int arrSize = 2;
  int stack[] = new int[arrSize];
  int top = 0;

  public void push(int data) {
    if (isFull()) {
      expandArray();

      stack[top] = data;
      top++;
    } else {
      stack[top] = data;
      top++;
    }
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

  public int peek() {
    int data;
    data = stack[top - 1];
    return data;
  }

  public void expandArray() {
    int length = size();
    int newStack[] = new int[arrSize * 2];
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
    arrSize += 2;
  }

  public void shrink() {
    int length = size();
    if ((length <= (arrSize / 2) / 2)) {
      arrSize = arrSize / 2;
      int newStack[] = new int[arrSize];
      System.arraycopy(stack, 0, newStack, 0, length);
      stack = newStack;
    }
  }

  public int size() {
    return arrSize;
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

  public boolean isFull() {
    return size() == arrSize;
  }
}
