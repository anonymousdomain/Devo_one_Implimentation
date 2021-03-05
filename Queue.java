public class Queue {
    int arrayS=3;
    int front;
    
    int queue[]=new int[arrayS];
    public void enqueue(int data){
        
        queue[front]=data;
        front++;
    }
    public void show(){
        System.out.println("elements:");
        for(int i:queue){
            System.out.print(i+" ");
        }
    }
}
