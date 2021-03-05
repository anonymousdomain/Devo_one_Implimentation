public class Stack {

  int stack[] = new int[5];
  int top = 0;

  public void push(int data) {
    stack[0] = data;
    top++;
  }

  public int pop() {
    int data;
    top--;
    data = stack[top];
    stack[top] = 0; //delete the value from the top
    return data;
  }

  public void show() {
    for (int n : stack) {
      System.out.print(n + " ");
    }
  }
}
