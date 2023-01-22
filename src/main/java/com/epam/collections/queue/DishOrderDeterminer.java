package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = IntStream.rangeClosed(1, numberOfDishes).boxed().collect(Collectors.toList());
        Iterator<Integer> iterator = dishes.listIterator();
        List<Integer> dishesToEat = new ArrayList<>(numberOfDishes);
        int i = 1;
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!iterator.hasNext()) {
                iterator = dishes.listIterator();
            }
            if (dishesToEat.size() == numberOfDishes) {
                break;
            } else if (dishesToEat.contains(n)) {
                continue;
            }
            if (i % everyDishNumberToEat == 0) {
                dishesToEat.add(n);
                i = 1;
            } else {
                i += 1;
            }
        }

        return dishesToEat;
    }
}
