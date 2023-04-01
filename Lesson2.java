public class Lesson2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num++;
        }
        System.out.println(num);
        String s = "Hello";
        System.out.println(s.toLowerCase());
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        switch (num) {
            case 102:
                System.out.println(102);
                break;
            case 100:
                System.out.println(100);
                break;
            default:
                System.out.println(1021);
        }
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 2);

        // object and class
        class Point {
            int x, y; // object ozgermeitin object bolady eger ony sozdat' etkennen keiin
                      // ozgertilmeitin bolsa
            // mysaly final int x, y;

            public Point() {
            }

            @Override
            public String toString() {
                return x + " " + y;
            }

            /*
             * public Point(int x_val, int y_val) {
             * x = x_val;
             * y = y_val;
             * // constructor
             * }
             */
            /*
             * public Point(int x, int x) {
             * this.x = x;
             * this.y = y;
             * //constructor
             * }
             */
            void print() {
                System.out.println(x + ", " + y);
            }

            void print_x(Point this) {
                System.out.println(this.x);
            }

            void shift(int dx, int dy) {
                x += dx;
                y += dy;
            }
        }
        Point p = new Point();
        p.x = 1;
        p.y = 2;
        Point p2 = new Point();
        p2.x = 3;
        p2.y = 4;

        p = p2; // ссылка p p2- nin object-isin korsetedi (1, 2) degen object-nin ssylkasy jok
                // manager memmory removes it;
        p.print();
        p2.print_x();
        p2.shift(1, 1);
        p2.print();
        p.shift(3, 1);
        p2.print();

        /*
         * java 16
         * record Point2(int x, int y) {
         * void print() {
         * System.out.println(x +", " + y);
         * }
         * }
         * classty kurudyn jana turi
         * Point2 p1 = new Point(3, 5);
         * p1.print()
         * jana polia kosuga bolmaidy; ozgermeitin object bul toje;
         * 
         */

    }

}
