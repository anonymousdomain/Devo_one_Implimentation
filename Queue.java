public class Queue {
    int arrayS=3;
    int front;
    int queue[]=new int[arrayS];
    public void enqueue(int data){
        queue[front]=data;
        front++;
    }
}
