package CompleteReference.Array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //배열에 1-5 저장
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("변경전 - arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;

        System.out.println("변경전 - arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
