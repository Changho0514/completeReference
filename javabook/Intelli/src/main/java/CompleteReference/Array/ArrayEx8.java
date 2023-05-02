package CompleteReference.Array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[6];

        for (int i = 0; i < ball.length; i++) {
            int num = (int) ((Math.random() * 45));
            ball[i] = num + 1;
        }

        for (int i = 0; i < ball.length; i++) {
            System.out.println(ball[i]);
        }
    }
}
