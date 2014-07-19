package io.github.kongeor.mocking.anonymous.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    
    public static <T> List<T> filter(List<T> list, Predicate<T> pred) {
        List<T> filtered = new ArrayList<>();
        for (T e : list) {
            if (pred.test(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }
}
