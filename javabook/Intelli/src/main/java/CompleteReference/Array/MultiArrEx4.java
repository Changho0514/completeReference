package CompleteReference.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArrEx4 {
    public static void main(String[] args) throws IOException {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

            String temp = br.readLine();

            if (temp.equals(words[i][1])) {
                System.out.printf("정답입니다. %n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
    }
}
