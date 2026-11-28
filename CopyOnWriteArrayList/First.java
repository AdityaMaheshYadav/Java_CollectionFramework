package CopyOnWriteArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class First {

    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy On Write" means that whenever a write operation 
        // write operation matlab operation like adding or removing an element 
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // this ensures that other threads reading the list while it's being modified are unaffected,

        //Read operations: Fast and Direct, since they happen on a stable list without interference 
        //from modification.

        //Write Operations: A new copy of the list is created for every modification.
        // the reference to the list is then updated so that subsequent reads use this new list.

        // example notepad and making the copy of notepad
        // we are going to use copyonwritearraylist when read operation is more compared to the 
        // write operation as because on every write operation it will create its a copy 

        //  and when read and write operation are working on the same time 

        // example 
        // LinkedList<String> shoppingList = new LinkedList<>();
        // shoppingList.add("Milk");
        // shoppingList.add("eggs");
        // shoppingList.add("Bread");
        // System.out.println("Intial Shopping List: " + shoppingList);

        // for (String item : shoppingList) {
        //     System.err.println("itme");
        //     // try to modigy the list while reading 
        //     if (item.equals("eggs")) {
        //         shoppingList.add("butter");
        //         System.err.println("Add butter while reading.");
        //     }
        // }

        // System.out.println("Updated Shopping List :" + shoppingList);

        // this will give error as show below 
//         Intial Shopping List: [Milk, eggs, Bread]
// itme
// itme
// Add butter while reading. 
// Exception in thread "main" java.util.ConcurrentModificationException
//         at java.base/java.util.LinkedList$ListItr.checkForComodification(Unknown Source)
//         at java.base/java.util.LinkedList$ListItr.next(Unknown Source)
//         at CopyOnWriteArrayList.First.main(First.java:35)


         List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("eggs");
        shoppingList.add("Bread");
        System.out.println("Intial Shopping List: " + shoppingList);

        for (String item : shoppingList) {
            System.err.println("itme");
            // try to modigy the list while reading 
            if (item.equals("eggs")) {
                shoppingList.add("butter");
                System.err.println("Add butter while reading.");
            }
        }

        System.out.println("Updated Shopping List :" + shoppingList);
    }
    
    
}
