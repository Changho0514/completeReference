package CompleteReference.Class;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        // Data2 data2 = new Data2();  //<== 컴파일 에러 발생
    }
}
