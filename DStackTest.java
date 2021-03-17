/*
data structure & algorithms  first assignment 

Dynamic Stack Test implimentation source code

Name:Dawit Yitagesu
ID:DBUR/0311/10
*/
public class DStackTest {

  public static void main(String[] args) {
    DStack dlist = new DStack();
    dlist.push(10);
    dlist.push(15);
    dlist.show();
    dlist.push(12);
    dlist.show();
    dlist.push(25);
    dlist.push(30);

    dlist.show();
    //peek
    System.out.println(dlist.peek());
    // pop
    dlist.pop();
    dlist.pop();
    dlist.show();
    dlist.pop();
    dlist.pop();
    dlist.show();
  }
}
