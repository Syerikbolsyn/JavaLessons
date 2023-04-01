import java.util.NoSuchElementException;

public class Lesson4 {
    static class MyException extends Exception {

    }

    static void test() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        try {
            test();
        } catch (MyException ex) {
            ex.printStackTrace();
        }
        Shmoption<String> present = new Shmoption<String>("yes");
        Shmoption<String> absent = new Shmoption<String>(null);
        System.out.println(present.isPresent());
        System.out.println(present.get());
        System.out.println(absent.isPresent());
        System.out.println(absent.orElse("no"));
        Shmoption<?> present1 = new Shmoption<>("Yes");
        Shmoption<String> absent1 = new Shmoption<>(null);
        System.out.println(present1.get());
        System.out.println(absent1.orElse("no").length());
        Shmoption<? extends Number> number = new Shmoption<>(131);
        Number n = number.get();
        // set except null we can't call
        System.out.println(n);

    }

    static class Shmoption<T> {
        T value;

        public Shmoption(T value) {
            this.value = value;
        }

        public T get() {
            if (value == null)
                throw new NoSuchElementException();
            return value;
        }

        public void set(T newValue) {
            value = newValue;
        }

        public T orElse(T other) {
            return value == null ? other : value;
        }

        public boolean isPresent() {
            return value != null;
        }
    }
}
