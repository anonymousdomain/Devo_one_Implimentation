public class QueueTest {
 public static void main(String[] args) {
    Queue qlist=new Queue();
    qlist.enqueue(3);
    qlist.enqueue(5);
    qlist.enqueue(10);
    qlist.enqueue(12);
    qlist.enqueue(20);
    qlist.enqueue(15);
    qlist.enqueue(25);
    qlist.show();
    qlist.dequeue();
    qlist.dequeue();
    System.out.println(qlist.getSize());
    qlist.show();
 }   
}
