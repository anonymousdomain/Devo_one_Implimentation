public class Queue {

  int arrSize = 5;
  int front;
  int rear;
  int size;
  DStack obj = new DStack();
  int queue[] = new int[arrSize];

  public void enqueue(int data) {
    if (isFull()) {
      obj.expandArray();
      queue[rear] = data;
      rear = (rear + 1) % this.arrSize;
    } else {
      queue[rear] = data;
      rear = (rear + 1) % this.arrSize;
    }

    this.size++;
  }

  public int dequeue() {
    int data = 0;
    if (!isEmpty()) {
      data = queue[front];
      front = (front + 1) % this.arrSize;
      this.size--;
      obj.shrink();
    } else System.out.println("the Queue is empty");
    return data;
  }

  public void show() {
    System.out.print("elements:");
    for (int i = 0; i < this.size; i++) {
      System.out.print(queue[(front + i) % this.arrSize] + " ");
    }
    System.out.println();
    for (int n : queue) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }

  public boolean isFull() {
    return getSize() == this.arrSize;
  }
}
