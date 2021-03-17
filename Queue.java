public class Queue {

  int arSize = 5;
  int front;
  int rear;
  int size;
  DStack obj = new DStack();
  int queue[] = new int[arSize];

  public void enqueue(int data) {
    if (getSize() == this.arSize) {
      obj.expandArray();
      queue[rear] = data;
      rear = (rear + 1) % this.arSize;
    } else {
      queue[rear] = data;
      rear = (rear + 1) % this.arSize;
    }

    this.size++;
  }

  public int dequeue() {
    int data = 0;
    if (!isEmpty()) {
      data = queue[front];
      front = (front + 1) % this.arSize;
      this.size--;
      obj.shrink();
    } else System.out.println("the Queue is empty");
    return data;
  }

  public void show() {
    System.out.print("elements:");
    for (int i = 0; i < this.size; i++) {
      System.out.print(queue[(front + i) % this.arSize] + " ");
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
}
