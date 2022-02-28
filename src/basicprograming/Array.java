package basicprograming;

import javax.swing.*;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //ArrayList<Integer> numList = new ArrayList<Integer>(); -> tambien podemos usar esta
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        numList.add(5);
        numList.add(7);
        numList.add(10);

        nameList.add("Fabian");
        nameList.add("Melissa");
        nameList.add("Anais");
        nameList.add(0,"Ulises");

        System.out.println("\nNumeros = " + numList);
        System.out.println("Posicion 2 = " + nameList.get(2));
        System.out.println("Names = " + nameList);
        boolean exist = nameList.contains("Anais");
        System.out.println("Existe 'Anais'? = " + exist);
        System.out.println("Donde esta 'Anais'? = " + nameList.indexOf("Anais"));
        System.out.println("Adios Anais");
        nameList.remove(3);
        System.out.println("Nueva lista = " + nameList);


        for (int i = 0; i < 3; i++){
            nameList.add(JOptionPane.showInputDialog("Ingresa 3 nombres: " + i));
        }
        System.out.println("**Nueva lista**");
        for (int i = 0; i < nameList.size(); i++){
            System.out.println("Index " + i + " = " + nameList.get(i));
        }


    }
}
