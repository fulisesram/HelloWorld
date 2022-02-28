package generics;

import java.util.*;

public class Assessment {

    public static <T> void main(String[] args) {

        Assessment obj = new Assessment();
        ArrayList array = new ArrayList<T>();

        array.add(1.10);
        array.add(2.20);
        array.add(3.30);

        System.out.println("Array "+(array));
        System.out.println("Product "+obj.product(array,0,1));
        System.out.println("Sum "+obj.sum(array,0,1));
        System.out.println("Min "+obj.min(array));
        System.out.println("Max "+obj.max(array));
    }

    public  <T extends Number> T product(List a, int index1, int index2) {
        T val1 = (T) a.get((int)index1);
        T val2 = (T) a.get((int)index2);
        Double product = val1.doubleValue() * val2.doubleValue();
        return (T) product;
    }

    public  <T extends Number> T sum(List a, int index1, int index2){
        T val1 = (T) a.get(index1);
        T val2 = (T) a.get(index2);
        Double sum = val1.doubleValue() + val2.doubleValue();
        return (T) sum;
    }

    public  <T> T min(ArrayList a){
        Integer n = a.size();
        Collections.sort(a);
        T min = (T) a.get(0);
        return min;
    }
    public  <T> T max(ArrayList a){
        Integer n = a.size();
        Collections.sort(a);
        T max = (T) a.get(n-1);
        return max;
    }


}

