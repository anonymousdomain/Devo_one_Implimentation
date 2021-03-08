public class Queue {
    int arrayS=5; 
    int front;
    int rear;
    int size;
    DStack d=new DStack();
    int queue[]=new int[arrayS];
    public void enqueue(int data){
        if(getSize()==arrayS){
           
            d.expandArray();       }
        queue[rear]=data;
        rear=(rear+1)%5;
        size++;
    }
    public int dequeue(){
        int data=0;
        if(!isEmpty()){
            data=queue[front];
            front=(front+1)%5;
            size--;
            d.shrink();
           
        }else System.out.println("the Queue is empty");
        return data;
    }
    public void show(){
        System.out.print("elements:");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
       System.out.println();
       for(int n:queue){
           System.out.print(n+" ");
       }
       System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
}
