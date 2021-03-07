public class Queue {
    int arrayS=5; 
    int front;
    int rear;
    int size;
    int queue[]=new int[arrayS];
    public void enqueue(int data){
        
        queue[rear]=data;
        rear=(rear+1)%5;
        size++;
    }
    public int dequeue(){
        int data;
        data=queue[front];
        front=(front+1)%5;
        size--;
        return data;
    }
    public void show(){
        System.out.print("elements:");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
       System.out.println();
       
    }
}
