import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.*;

public class Lesson7 {
    @FunctionalInterface
    public interface Runnable {
        public abstract void run();
    }

    /*
     * @FunctionalInterface
     * public interface Comparator<T> {
     * int compare(T o1, T o2);
     * 
     * boolean equals(Object obj);
     * 
     * default Comparator<T> reversed() {
     * return Collections.reverseOrder(this);
     * }
     * }
     */

    @FunctionalInterface
    interface LongSupplier {
        long getLong();
    }

    @FunctionalInterface
    interface IntSupplier extends LongSupplier {
        int getInt();

        @Override
        default long getLong() {
            return getLong();
        }
    }

    static void run(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello world!");
        r.run();
        run(() -> System.out.println("Hello world!"));
        IntSupplier l1 = () -> 4;
        System.out.println(l1);
        IntBinaryOperator sum = Integer::sum;
        Predicate<String> pred = "Java"::equals;
        System.out.println(pred.test("Java"));
        System.out.println(pred.test("Jav"));

        Consumer<Object> lambdaPrinter = obj -> System.out.println(obj);
        Consumer<Object> methodRefPrinter = System.out::println;
        methodRefPrinter.accept("Hello method");
        lambdaPrinter.accept("Hello lambda");
        int[] numbers = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
        int count = 0;
        for (int i : numbers) {

            if (i > 0)
                count++;
        }
        System.out.println(count);
        long count1 = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count1);
        IntStream.iterate(1, x -> x * 2).limit(10).sorted().forEach(System.out::println);

    }
}
