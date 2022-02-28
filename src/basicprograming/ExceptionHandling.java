package basicprograming;

import java.util.Scanner;

public class ExceptionHandling {

    private static int num, den, res;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("numerador = ");
            num = sc.nextInt();
            System.out.print("denominador = ");
            den = sc.nextInt();
            res = num / den;
            System.out.println("res = " + res);
        }
        catch (Exception ex){
            System.out.print("\nNo puedes dividir entre '0' Object Exception -> " + ex);
        }
        finally {
            System.out.print("\nFin del programa - Bloque Finally siempre se ejecuta");
        }
          
    }
}
