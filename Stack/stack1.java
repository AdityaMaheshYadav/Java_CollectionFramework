import java.util.LinkedList;
import java.util.Stack;

import linkedList.linkedlist1;

class stack1{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        Integer removed = stack.pop();
        System.out.println(removed);
        Integer topmost = stack.peek();
        System.out.println(topmost);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        // As stack extends vector we can add and remove element in between using the index 
        stack.add(3,9);
        System.out.println(stack);
        stack.remove(3);
        System.out.println(stack);
        
        int search = stack.search(3);
        System.out.println(search);
        // 5   1 index
        //4    2 index
        //3    3 index 
  }
}