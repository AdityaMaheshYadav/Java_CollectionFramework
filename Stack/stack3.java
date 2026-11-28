import java.util.ArrayList;
// using arraylist as stack
public class stack3 {
    public static void main(String[] args) {
    
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        arrayList.get(arrayList.size() -1); //peek 
        arrayList.remove(arrayList.size() - 1); //pop 

        System.out.println(arrayList);
        Integer size = arrayList.get(arrayList.size() -1); //peek 
        System.out.println("the size of the arraylist" + " " + size);


    }
    
}
