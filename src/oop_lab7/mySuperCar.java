package oop_lab7;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar s = new SuperCar();
        s = inputData(s);
        s.getSuperCarInfo();
    }

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car info: ");
        System.out.print("Enter car brand: ");
        s.setCarBrand(scanner.nextLine());
        System.out.print("Enter car color: ");
        s.setCarColor(scanner.nextLine());
        return s;

    }
}
