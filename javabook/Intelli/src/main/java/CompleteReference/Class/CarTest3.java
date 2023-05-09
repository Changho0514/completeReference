package CompleteReference.Class;

class Car{
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }


    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println("c1의 color = "+ c1.color + ", c1의 gear = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = "+ c2.color + ", c2의 gear = " + c2.gearType + ", door = " + c2.door);

        c1.door = 100; //c1의 인스턴스 변수 값 변경
        System.out.println("c1.door =100; 수행후");

        System.out.println("c1의 color = "+ c1.color + ", c1의 gear = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = "+ c2.color + ", c2의 gear = " + c2.gearType + ", door = " + c2.door);
    }
}
