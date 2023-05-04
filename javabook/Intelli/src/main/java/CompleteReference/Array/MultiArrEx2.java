package CompleteReference.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArrEx2 {
    public static void main(String[] args) throws IOException {
        final int SIZE = 5;
        int x = 0, y = 0;
        int num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i*SIZE + j + 1;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                y = (int)(Math.random() * SIZE);
                x = (int)(Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE * SIZE);
            num = Integer.parseInt(br.readLine());

            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        }while (num != 0);
    }
}
