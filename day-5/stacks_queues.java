// Stacks & Queues (Collection) + Basic OOPS (Theory Notes)


//  stacks 
// -linear ds
// - lifo (last in first out)
// - top 
// - operations in stack : 
//     - push : stack kei andr dalna 
//     - pop  : stack kei top se ele ko remove krne 
//     - peek : see whats on top

// example : s=[1,223,4,5,90]
// declaration 
// Stack<Integer>stack=new Stack();


//  queue
// -linear ds
// - fifo (first in first out)
// - rear(add) and front(delete) 
// - operations in stack : 
//     - offer : q kei andr dalna 
//     - poll  : q kei ele ko remove krne ko front se 
//     - peek : see whats in front

// example : s=[1,223,4,5,90]
// declaration 
// Queue<Integer>q=new LinkedList<>();

import java.util.*;
public class stacks_queues {
    public static void main(String[] args) {
        // example on stack 
        // Stack<Integer> stack=new Stack();
        // stack.push(45); // [45]
        // stack.pop(); // []
        // System.out.println(stack); // empty
        // stack.push(1); // [1]
        // stack.push(5); // [1,5]
        // stack.push(6); // [1,5,6]
        // stack.push(8); // [1,5,6,8]
        // System.out.println(stack);// [1,5,6,8]
        // System.out.println(stack.peek()); // 8
        // stack.pop(); //[1,5,6]
        // System.out.println(stack);

        // queue example 
        // Queue<Integer> q=new LinkedList<>();
        // q.offer(45); // [45]
        // q.poll(); // []
        // System.out.println(q); // empty
        // q.offer(1); // [1]
        // q.offer(10); // [1,10]
        // q.offer(21); // [1,10,21]
        // System.out.println(q);// [1,10,21]
        // System.out.println(q.peek()); // 1
        // q.poll(); //[10,21]
        // System.out.println(q);


    }
}
