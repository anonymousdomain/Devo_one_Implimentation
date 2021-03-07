public class Queue {
    int arrayS=5; 
    int front;
    int rear;
    int size;
    int queue[]=new int[arrayS];
    public void enqueue(int data){
        
        queue[rear]=data;
        rear++;
        size++;
    }
    public int dequeue(){
        int data;
        data=queue[front];
        front++;
        size--;
        return data;
    }
    public void show(){
        System.out.print("elements:");
        for(int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
       System.out.println();
        
    }
}
