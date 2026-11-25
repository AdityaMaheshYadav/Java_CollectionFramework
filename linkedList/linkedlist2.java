package linkedList;

import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(); // here behind the scene same logic kam kr rha hai 
        // as shown in the linkedlist1 
        // but here it is doubly linked list not singly linked list so the following contain 2 pointer 
        // one point to the next node and another point it to previous node
        // UNLIKE ARRAYLIST THE LINKED LIST DONT HAVE CONTINUOUS MEMORY LOCATION  
        linkedList.add(1);                
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);


        linkedList.get(2); // for this the time complexit of the arraylist is o(1) the time complexity for the 
        // linkedlist is o(n) because of loop 
        // jab apne custome linkedlist banate hai jese linkedlist1 mei banai tab apn get method use nhi kr sakte 
        // but when we use linkedlist class we can use get method 

        linkedList.addLast(4);
        linkedList.addFirst(0);
        // when we add element in the arraylist the TC is o(n) bc all element have to move 
        // but in the linkedlist the TC is o(1)
        linkedList.getFirst();
        linkedList.getLast();

        System.out.println(linkedList);
        System.out.println(linkedList.getLast());

        linkedList.removeIf(x -> x%2 ==0); // baki method bhi have remove ki 
        
    }    
}
// HERE  we cannot use index to find a specific element we have to use loop 
// here deletion of an element is easier compare to arraylist as in arraylist when we remove one elment form the 
// middle the rest of the element move to its place like we we delet element present in index 4 so the 5th elment 
// move to the 4th index 
// where as in linkedlist the element get deleted and the previous element start pointing to the next element 