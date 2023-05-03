package CompleteReference.Array;

public class ArrayEx16 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = new int[3][5];
        int[] c[] = new int[3][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
            }
        }

        for (int[] row : a) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
