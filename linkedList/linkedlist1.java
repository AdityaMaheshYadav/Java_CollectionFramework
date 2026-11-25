package linkedList;

public class linkedlist1 {
    // creating our own nodes 
    public static void main(String[] args) {
        Node node1 = new Node(); // syntax for creating node step2
        Node node2 = new Node(); // syntax for creating node step2
           
        node1.value = 1; 
        node2.value = 2;
        
        node1.next = node2;
        node2.next = null; 
    }
}


class Node{

    public int value;
    
    public Node  next; // here next is the reference/pointer that points the node to another node 
}
// WE DONT HAVE TO DO ALL THE ABOVE THING BECAUSE JAVA HAS ALREADY CONTAIN LINKEDLIST CLASS INSTEAD WE CAN DO AS SHOWN
// IN LINKEDLIST2 s