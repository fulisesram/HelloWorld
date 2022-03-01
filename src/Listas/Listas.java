package Listas;

import java.util.*;

public class Listas {

    public static void main(String[] args) {
        /** List */
        System.out.println("\nEn listas podemos tener duplicados y se respeta el orden.");

        List miLista = new ArrayList<>();

        miLista.add("Lun");
        miLista.add("Lun");
        miLista.add("Mar");
        miLista.add("Mie");
        miLista.add("Jue");
        miLista.add("Vie");
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        System.out.println("\nLista Set, no permite valores duplicados no respeta orden");
        
        /** Set */
        Set miSet = new HashSet();
        miSet.add("Lun");
        miSet.add("Lun");
        miSet.add("Mar");
        miSet.add("Mier");
        miSet.add("Jue");
        miSet.add("Vie");
        miSet.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        System.out.println("\nLista Map");
        
        /** Map */
        Map miMap = new HashMap<>();
        miMap.put("1", "Lun");
        miMap.put("2", "Lun");
        miMap.put("3", "Mar");
        miMap.put("4", "Mie");
        miMap.put("5", "Jue");
        miMap.put("6", "Vie");
        
        String element = (String) miMap.get("1");
        System.out.println("elemento con key:1 = " + element);

        System.out.println("keys: " + miMap.keySet());
        System.out.println("keys: " + miMap.values());
        System.out.println("keys: " + miMap.size());

        miMap.forEach((k,v) -> System.out.println("key:" + k + " value:" + v));

    }
    
}
