public class Queue {

  int arrayS = 5;
  int front;
  int rear;
  int size;
  DStack d = new DStack();
  int queue[] = new int[arrayS];

  public void enqueue(int data) {
    if (getSize() == this.arrayS) {
      d.expandArray();
      queue[rear] = data;
      rear = (rear + 1) % this.arrayS;
    } else {
      queue[rear] = data;
      rear = (rear + 1) % this.arrayS;
    }

    this.size++;
  }

  public int dequeue() {
    int data = 0;
    if (!isEmpty()) {
      data = queue[front];
      front = (front + 1) % this.arrayS;
      this.size--;
      d.shrink();
    } else System.out.println("the Queue is empty");
    return data;
  }

  public void show() {
    System.out.print("elements:");
    for (int i = 0; i < this.size; i++) {
      System.out.print(queue[(front + i) % this.arrayS] + " ");
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
