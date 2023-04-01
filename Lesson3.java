public class Lesson3 {

    public static class Point {
        final int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void print() {
            System.out.println(x + ", " + y);
        }
    }

    /**
     * Represents on immutable 3D - vector
     */
    interface Vector {
        /**
         * Returns a vector component
         * 
         * @param n component number, must be 0 (x), 1 (y), 2 (z)
         * @return a value of the corresponding vector component
         */
        double component(int n);

        /**
         * @return a vector length
         */
        double length();

        /**
         * sums two vectors
         * 
         * @param other a vector to add to this vector
         * @return a result of addition
         */
        Vector plus(Vector other);
    }

    public static class ArrayVector extends AbstractVector {
        double[] arr;

        ArrayVector(double x, double y, double z) {
            this.arr = new double[] { x, y, z };
        }

        @Override
        public double component(int n) {
            return arr[n];
        }

        @Override
        public double length() {
            return Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1] + arr[2] * arr[2]);
        }

        @Override
        public Vector plus(Vector other) {
            return new ArrayVector(arr[0] + other.component(0),
                    arr[1] + other.component(1),
                    arr[3] + other.component(2));
        }

    }

    public static class FieldVector extends AbstractVector {
        double x, y, z;

        FieldVector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public double component(int n) {
            switch (n) {
                case 0:
                    return x;
                case 1:
                    return y;
                case 2:
                    return z;
                default:
                    throw new IllegalAccessError();
            }
        }

        @Override
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        @Override
        public Vector plus(Vector other) {
            return other;
        }
    }

    public static class ZeroVector extends AbstractVector {
        public static final ZeroVector INSTANCE = new ZeroVector();

        private ZeroVector() {
        }

        @Override
        public double component(int n) {
            return 0;
        }

        @Override
        public double length() {
            return 0;
        }

        @Override
        public Vector plus(Vector other) {
            return other;
        }
    }

    abstract static class AbstractVector implements Vector {
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Vector))
                return false;
            Vector that = (Vector) o;
            return this.component(0) == that.component(0) &&
                    this.component(1) == that.component(1) &&
                    this.component(2) == that.component(2);
        }

        @Override
        public String toString() {
            return "(" + component(0) + ", " + component(1) + ", " + component(2) + ")";
        }
    }

    enum Weekday {
        MONDAY("MON", false), TUESDAY("TUE", false), WEDNESDAY("WED", false),
        THURSDAY("THU", false), FRIDAY("FRI", false),
        SATURDAY("SAT", true), SUNDAY("SUN", true);

        private final String shortName;
        private final boolean weekend;

        Weekday(String shortName, boolean weekend) {
            this.shortName = shortName;
            this.weekend = weekend;
        }

        public String getShortName() {
            return shortName;
        }

        public boolean isWeekEnd() {
            return weekend;
        }
    }

    public static void main(String[] args) {
        Point p = new Point(4, 6);
        process(p);
        Vector v1 = ZeroVector.INSTANCE;
        Vector v2 = new ArrayVector(1, 2, 3);
        Vector v3 = new FieldVector(4, 5, 6);

        Vector sum = v1.plus(v3).plus(v2);
        System.out.println(sum.component(0) + ", " + sum.component(1) + ", " + sum.component(2));
        Vector v0 = ZeroVector.INSTANCE;
        Vector v01 = new ArrayVector(0, 0, 0);
        Vector v02 = new FieldVector(0, 0, 0);
        System.out.println(v0.equals(v02));
        System.out.println(v02.equals(v01));
        System.out.println(sum.toString());

        for (Weekday weekday : Weekday.values()) {
            System.out.println(
                    weekday + "(" + weekday.getShortName() + ") "
                            + (weekday.isWeekEnd() ? "relax and enjoy" : "work!"));
        }
    }

    private static void process(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            point.print();
        }
        /*
         * java 16
         * if (obj instanceof Point point) {
         * point.print()
         * }
         */
    }
}
