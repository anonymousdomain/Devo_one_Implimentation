public class runnur {
   public static void main(String[] args) {
       Stack list=new Stack();
       list.push(5);
       list.push(10);
       list.push(20);
       System.out.println("deleted value is : "+list.pop());
       
       list.show();
   } 
}
