import java.util.NoSuchElementException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Lesson5 {
    static <T> Iterable<T> nCopies(T value, int count) {
        if (count < 0)
            throw new IllegalArgumentException("Negative count: " + count);
        /*
         * return new Iterable<T>() {
         * 
         * @Override
         * public Iterator<T> iterator() {
         * return new Iterator<T>() {
         * int rest = count;
         * 
         * @Override
         * public boolean hasNext() {
         * return rest > 0;
         * }
         * 
         * @Override
         * public T next() {
         * if (rest == 0) {
         * throw new NoSuchElementException();
         * }
         * rest--;
         * return value;
         * }
         * };
         * }
         * };
         */
        return () -> new Iterator<T>() { // lambda
            int rest = count;

            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0) {
                    throw new NoSuchElementException();
                }
                rest--;
                return value;
            }
        };
    }

    static List<Integer> rangeList(int fromInclusve, int toExclusive) {
        return new AbstractList<> {
            @Override
            public Integer size () {
                return toExclusive - fromInclusve;
            }
            @Override
            public Integer get (int index) {
                if (index < 0 || index >= size()) {
                    throw new IndexOutOfBoundsException(index);
                }
                return fromInclusve + index;
            }
            @Override
            public void set (int a) {
                toExclusive = a;
            }
            @Override
            public void remove() {
                fromInclusve = 0;
            }
        };
    }

    public static void main(String[] args) {

    }
}
