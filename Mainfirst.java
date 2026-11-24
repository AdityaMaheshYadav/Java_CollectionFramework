 import java.util.*;


//  continution of the comparatior 
//  step1 creating a class and implementing comparator

 class StringLengthComparator implements Comparator<String> {
    // Class Class_name implements Comparator<type of data we are dealing with> 
    @Override 
    public int compare(String s1, String s2) 
    //public int compare(object o1 , object o2)
    { // here  we write the logic how we sort 
        return Integer.compare(s1.length(), s2.length());
    }

 }

 // step 3 of the comparator / for number the following class will work  

  class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // is upar wale int ki baat kr rhe hai 
        // integer jab to objects ko dekh ta hai to kis manner mei usko sort krega ye sorting algorithm ko batayega 
        // case 1 jab int negative aata hai o1 phele aayega o2 se
        // case 2 jab int zero aata hai it will consider o1 and o2 equal / same preference denge 
        // case 3 jab int positiv aata hai o1 baad mei aayega o2 se 
        // TODO Auto-generated method stub
        return o1-o2; 
    }
    // for ex let o1 be 5 and o2 be 3 and we want to sort it in accending order which means o2 should come first
    // so the method should return a postive int therefore the logic will be o1-o2 5-3

    // ex2 if o1 is 3 and o2 is 5 and we want it in the accending order so the o1 has to come first so the method 
    // int should return a negative value  so the logic will be o1-o2 

  }

 public class Mainfirst {
    public static void main(String[] args) {
        //how to declare and array
        //int[] arr = new int[10];
       // ArrayList<Integer> arr = new ArrayList<Integer>();
        //syntax ArrayList<generic> arraylistname = new ArrayList<generic>();
        //the above thing can be also be written as 
        // List<generic> arraylistname = new ArrayList<generic>(); bc list is the parent class of arraylist 
        //generic krna hai?                               ider generic lgana optional hai after java 7  

        // can we only add number to the list ?
        // how to add number in the arraylist
        // arraylistname.add(6 etc):
        //arr.add(1);
        //arr.add(45);
        //arr.add(80);

        //how to get those element 
        // arraylist follows zero based indexing 
        //System.out.println(arr.get(2));

        //if we want to find the size of the array list we use .size method
        //System.out.println(arr.size());

        // loop for printing the element of the list 
       /*  for(int i = 0; i<arr.size() ; i ++) {
            System.out.println(arr.get(i));
        }
                                                                   // ub dono loop me ander kya hua fir 
        // using for each loop 
        for(int x: arr){
            System.out.println(x);
        } */

        // checking if the element is present inside the arraylist or not by using .contain() method 
        //System.out.println(arr.contains(56));
        //System.out.println(arr.contains(80));


        // how to remove the elements using .remove() method
        //arr.remove(2);

        //how to insert the index in between the two elemnt 
        //arr.add(2, 34);

        /*for(int i= 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
            
    }*/

        // when we want to replace an element in the arraylist we use .set() method
       /*  arr.set(0,23);

        for(int i= 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
            
    }*/
    // or instant of the above list we can also print the element using the following method 
     //System.out.println(arr);



     // internal working of the ArrayList 
     //unlike regular array, which has a fixed size an arraylist can grow and shrink as elements are added or removed.
     // this dynamic resizing is achieved by creating a new array when the current array is full and copying the elements
     // to the new array 



     // INTERVIEW QUESTION 
     // What is different between the capacity and the size of the arraylist 
     // capacity means the size of the internal array that can hold element before needing to resize
     // default 10 hota hai 
      
     // ArrayList<integer> list = new Arraylist<integer>;
     // when we create a arraylist its intial capacity is 10
     // iska size abhi zero hai pr iski capacity 10 hai kyu ki internal array ki capacity 10 hai 
     // agar hum 10s se jada element add krte hai tho fir iska size increase hoga 



     // pata krna kya hai inche ke method
     //Arrays.asList("monday","tuesday");

     // comparator
    //  List<String> words = Arrays.asList("banana", "apple", "date");
    //  words.sort(null);
    //  System.out.println(words);
     
    // for using the comparator in different way we have to follow the following steps
    // 1 if we want to use teh comparator interface we have to make its implementation class or we have to use
    //   the lambda expression 
    // 2 That imprement [int compare(T o1, o2);] 


    List<String> words = Arrays.asList("banana", "apple", "date");
    // Comparator step 2 giving instance of the method 
    words.sort(new StringLengthComparator()); // the word will get sorted by their length  
     System.out.println(words);
     
    }
 }


//  we can also do comparator thing with the help of lambda expression 
//  List<String> words = Arrays.asList("banana","apple","date");
//  words.sort((a,b) -> a.length() - b.length());  for accending order
//  words.sort((a,b) -> b.length() - a.length());  for decending order 

//list.sort((a,b) -> b-a); for decending order
