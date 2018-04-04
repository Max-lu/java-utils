package cn.maxlu.util;

public class CountUtil {

    private static final ThreadLocal<Integer> COUNT = ThreadLocal.withInitial(() -> 0);

    private static final ThreadLocal<Integer> MAX = ThreadLocal.withInitial(() -> 10);

    public static void max(Integer max) {
        if (max == null) {
            throw new IllegalArgumentException("parameter is null");
        } else if (max <= 0) {
            throw new IllegalArgumentException("parameter [max] should be greater than 0");
        } else {
            MAX.set(max);
        }
    }

    public static boolean isOver() {
        COUNT.set(COUNT.get() + 1);
        return COUNT.get() > MAX.get();
    }
}