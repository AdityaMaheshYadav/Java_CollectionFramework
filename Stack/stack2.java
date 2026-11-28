import java.util.LinkedList;
// linkedlist as stack 
public class stack2 {
    public static void main(String[] args) {
               // we can also use linkedlist as stack
        LinkedList<Integer> linkedlist = new LinkedList<>();  
        linkedlist.addLast(1);
        linkedlist.addLast(2);
        linkedlist.addLast(3);
        linkedlist.addLast(4);
        linkedlist.addLast(5);
        linkedlist.addLast(6);

        System.out.println(linkedlist);

        LinkedList<Integer> linkedlist1 = new LinkedList<>();  
        linkedlist1.add(1);
        linkedlist1.add(2);
        linkedlist1.add(3);
        linkedlist1.add(4);
        linkedlist1.add(5);
        linkedlist1.add(6);

        System.out.println(linkedlist1);


        Integer link = linkedlist.getLast();
        // or
        System.out.println(link);// peek
        System.out.println(linkedlist.getLast());

        Integer linked = linkedlist.removeLast(); // pop
        System.out.println(linked);
        System.out.println(linkedlist);
        // the above linkedlist is doubly linkedlist not the singular one 
        // Stack is a general term in data structure 
        // we can implement it by using the stack class and linkedlist class as shown in above
    }
    
}
