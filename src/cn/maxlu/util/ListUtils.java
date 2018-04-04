package cn.maxlu.util;

import java.lang.reflect.Array;
import java.util.List;

public class ListUtils {

    public static <T> T[] toArray(List<T> list) {
        if (list == null) {
            return null;
        } else if (list.isEmpty()) {
            return null;
        } else {
            Class<?> componentClass = list.get(0).getClass();
            @SuppressWarnings("unchecked")
            T[] array = (T[]) Array.newInstance(componentClass, list.size());
            return list.toArray(array);
        }
    }
}
