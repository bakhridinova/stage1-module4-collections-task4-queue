package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        if (firstList.isEmpty() && secondList.isEmpty()) return new PriorityQueue<>();
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        Collections.sort(list);
        Collections.reverse(list);
        PriorityQueue<String> queue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        queue.addAll(list);
        return queue;
    }
}
