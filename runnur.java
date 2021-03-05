public class runnur {
   public static void main(String[] args) {
       Stack list=new Stack();
       list.push(5);
       list.push(10);
       list.push(20);
       list.size();
       System.out.println("pekk the value from the top "+list.peek());
       System.out.println("deleted value is : "+list.pop());
       System.out.println(list.isEmpty());
       list.show();
   } 
}
