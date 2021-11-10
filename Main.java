import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        Car c = new Car("Mercedes-Benz", "S400", "30A - 888.88", p, 4);
        MotorBike m = new MotorBike("Yamaha", "Y2F-R6", "29 - p1 686.68", p, false);
        p.addVehicle(c);
        p.addVehicle(m);
        System.out.println(p.getVehiclesInfo());
    }
}
