public class QueueTest {
 public static void main(String[] args) {
    Queue qlist=new Queue();
    qlist.enqueue(3);
    qlist.enqueue(5);
    qlist.enqueue(10);
    qlist.enqueue(12);
    qlist.show();
    qlist.dequeue();
    qlist.show();
 }   
}
