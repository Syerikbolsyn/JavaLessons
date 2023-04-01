import java.util.HashMap;
import java.util.*;

public class Lesson6 {

    void iterateOverMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

    void iterateOverValues(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println("value: " + value);
        }
    }

    void removeYnwantValue(Map<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue().equals("foo") ||
                entry.getValue().equals("bar"));
        /*
         * map.values().removeIf(entry -> entry.getValue().equals("foo") ||
         * entry.getValue().equals("bar"));
         */
    }

    class User implements Comparable<User> {
        final String name;
        final Integer age;

        User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(@NotNull User o) {
            return name.compareTo(o.name);
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    // lambda
    static final Comparator<User> USER_COMPARATOR = (u1, u2) -> {
        int res = u1.getName().compareTo(u2.getName());
        return res == 0 ? Integer.compare(u1.getAge(), u2.getAge()) : res;
    };

    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        void add(String key) {
            counts.merge(key, 1, (a, b) -> a + b);
        }
    }
}
