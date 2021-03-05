public class DStackTest {
   public static void main(String[] args) {
    DStack dlist=new DStack();
    dlist.push(10);
    dlist.push(15);
    dlist.push(12);
    dlist.show();
    dlist.push(25);
    dlist.push(30);
    dlist.show();
    
    // pop
    dlist.pop();
    dlist.pop();
    dlist.show();
    dlist.pop();
    dlist.show();
   } 
}
