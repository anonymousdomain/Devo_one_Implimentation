/*
data structure & algorithms  first assignment 

Queue Test implimentation source code

Name:Dawit Yitagesu
ID:DBUR/0311/10
*/
public class QueueTest {

  public static void main(String[] args) {
    Queue qlist = new Queue();
    qlist.enqueue(3);
    qlist.enqueue(5);
    qlist.enqueue(10);
    qlist.enqueue(12);
    qlist.show();
    System.out.println("size:" + qlist.getSize());
    qlist.enqueue(20);
    qlist.enqueue(15);
    qlist.enqueue(25);
    qlist.show();
    System.out.println("size:" + qlist.getSize());
    qlist.dequeue();
    qlist.dequeue();

    qlist.show();
    System.out.println("size:" + qlist.getSize());
  }
}
