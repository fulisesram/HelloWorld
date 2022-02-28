package basicprograming;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("Enter day index: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        if (day == 1) {
            System.out.println("day = sunday");

        } else if (day == 2) {
            System.out.println("day = monday");

        } else if (day == 3) {
            System.out.println("day = tuesday");

        } else {
            System.out.println(" other value");
        }
    }
}
