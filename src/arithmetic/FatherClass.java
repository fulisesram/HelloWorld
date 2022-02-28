package arithmetic;

import java.util.Scanner;

public class FatherClass {

    public int value1, value2, result;
    Scanner sc = new Scanner(System.in);

    public void getValues (){
        System.out.print("Enter 1st Value: ");
        value1 = sc.nextInt();
        System.out.print("Enter 2nd Value: ");
        value2 = sc.nextInt();
    }

    public void showResult (){
        System.out.print("Result = " + result);
    }

}
