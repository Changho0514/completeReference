package CompleteReference.Class;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    /**
     * 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없다.
     * */
    //static int cv2 = iv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);

        /**
         * 에러. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
         * */
//        System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv); //객체를 생성한 후에 인스턴스 변수 참조 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); //인스턴스 메서드에서는 인스턴스 변수 바로 사용가능
    }

    static void staticMethod2() {
        staticMethod1();
        /**
         * 에러. 클래스 메서드는 인스턴스 메서드를 호출할 수 없다.
         * */
//        instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }

}
