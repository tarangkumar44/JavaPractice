/*
Task:
Write a Java program using PriorityQueue<Integer> that:

Adds numbers: 30, 10, 50, 20, 40.
Prints the queue directly (to show its internal order).
Removes and prints elements one by one using poll(), until the queue is empty.
Clearly show that elements are retrieved in natural ascending order.
*/

import java.util.PriorityQueue;

public class PriorityQueueBasicDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(30);
        pQueue.add(10);
        pQueue.add(50);
        pQueue.add(20);
        pQueue.add(40);
        System.out.println("Priority queue direct printing: " + pQueue);
        System.out.println("Removing elements (natural ascending order):");
        int count = 1;
        while(!pQueue.isEmpty()){
            System.out.println(count++ + "). " + pQueue.poll());
        }
    }
}
