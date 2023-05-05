package CompleteReference.Class;

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
