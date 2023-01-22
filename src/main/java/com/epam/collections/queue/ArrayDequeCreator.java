package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(List.of(firstQueue.poll(), firstQueue.poll(), secondQueue.poll(), secondQueue.poll()));
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.pollLast());
            arrayDeque.addLast(firstQueue.poll());
            arrayDeque.addLast(firstQueue.poll());
            secondQueue.add(arrayDeque.pollLast());
            arrayDeque.addLast(secondQueue.poll());
            arrayDeque.addLast(secondQueue.poll());
        }

        return arrayDeque;
    }
}
