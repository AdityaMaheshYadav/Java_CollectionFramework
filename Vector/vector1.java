package Vector;

import java.util.LinkedList;
import java.util.Vector;

public class vector1 {
 
   public static void main(String[] args) {
    Vector<Integer> vector = new Vector<>();
    System.out.println(vector.capacity());


    // we can also initialised the capacity of the vector 
    Vector<Integer> vector1 = new Vector<>(5);
    System.out.println(vector1.capacity());
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    System.out.println(vector1.capacity());
 
    // when we want capacity to be incremented from specific number 
    Vector<Integer> vector3 = new Vector<>(10,3); // iska matlab capacity will be 10 + 3 
    System.out.println(vector3.capacity());
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    vector3.add(1);
    System.out.println(vector3.capacity());



    // we can also give any collection in the constructor of the vactor
    LinkedList<Integer> linkedlist1 = new LinkedList<>();
    linkedlist1.add(1);
    linkedlist1.add(2);
    linkedlist1.add(3);
    linkedlist1.add(4);

    Vector<Integer> vector4 = new Vector<>(linkedlist1);
    System.out.println(vector4);
   }
    
}
