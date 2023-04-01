import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson8StreamTest {

    static BigInteger factorial(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    static Map<Integer, String> stringsByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length, Collectors.joining()));
    }

    public static void main(String[] args) {
        IntStream stream = Stream.of("1", "2", "3", "", "4", "5")
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt);
        int[] array = stream.toArray();
        long numberOfOptions = Stream.of(1, 2, 3, 4, 5).skip(1).peek(System.out::print).count();
        System.out.println(Arrays.toString(array));
        System.out.println(numberOfOptions);
        System.out.println(factorial(4));
        String t = "sdmowe";
        System.out.println(t.toUpperCase());
        System.out.println(stringsByLength(Arrays.asList("1", "2", "12", "313", "13", "134")));
    }
}
