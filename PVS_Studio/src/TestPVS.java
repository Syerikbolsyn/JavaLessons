import java.util.Arrays;

public class TestPVS {
    public static void main(String[] args){
        int[][] x = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                x[i][j] =20;
            }
        }
        System.out.println(Arrays.deepToString(x));
    }
}
