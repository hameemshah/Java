import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SpeedConverter converter = new SpeedConverter();
        System.out.print("Enter the speed in km/h:");
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        sc.close();
        long mph = converter.toMilesPerHour(speed);
        System.out.println(speed + " km/h = " + mph + " mph");
    }
}
